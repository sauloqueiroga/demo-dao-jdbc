package application;

import java.sql.Connection;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		
		
		conn = DB.getConnection();
		DB.closeConnection();

	}

}
