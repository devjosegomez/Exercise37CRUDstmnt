package com.exercise37crudstmnt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.exercise37crudstmnt.model.*;

/***
 * Servlet that allows me to create an Employee into mySQL
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/***
 * Servlet that allows me to create an Employee
 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output = response.getWriter();
		
		Employee myEmployee = new Employee();
		myEmployee.setIdEmployee(Integer.parseInt(request.getParameter("txtIdEmployee")));
		myEmployee.setNameEmployee(request.getParameter("txtNameEmployee"));
		myEmployee.setAgeEmployee(Integer.parseInt(request.getParameter("txtAgeEmployee")));
		myEmployee.setAddressEmployee(request.getParameter("txtAddressEmployee"));
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalaryEmployee")));
		myEmployee.setDepartmentEmployee(request.getParameter("txtDepartmentEmployee"));
		
		String urlServer = "jdbc:mysql://localhost:3306/tiendita?useSSL=false&serverTimeZone='UTC'";
		String nombreUsuario = "root";
		String password = "root";
		int rowsAffected = 0;
		String sentenciaSQLPreparedStatements = "insert into Empleados(nombreEmpleado, "
				+ "edadEmpleado, domicilioEmpleado, salarioEmpleado, departamentoEmpleado) "
				+ "values (?,?,?,?,?)";
		
		
		Connection conn = null;
		PreparedStatement pstmnt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
			DriverManager.getConnection(urlServer, nombreUsuario, password);
			
			pstmnt = conn.prepareStatement(sentenciaSQLPreparedStatements);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmnt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		output.close();
	}

}
