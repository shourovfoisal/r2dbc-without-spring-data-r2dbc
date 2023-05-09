package com.example.r2dbcwithoutspringdatar2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class R2dbcWithoutSpringDataR2dbcApplication {

	public static void main(String[] args) {

		try {
//			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("r2dbc:postgresql://localhost:5432/reactiveraw", "postgres", "newpassword");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		SpringApplication.run(R2dbcWithoutSpringDataR2dbcApplication.class, args);
	}

}
