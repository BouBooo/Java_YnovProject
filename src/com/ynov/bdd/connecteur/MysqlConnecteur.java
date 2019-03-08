package com.ynov.bdd.connecteur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MysqlConnecteur {
	private Connection con;
	
	public MysqlConnecteur(String IP, String base, String login, String pass)
	{
		try
		{
			String url = "jdbc:mysql://"+IP+"/"+base; 	//Database path		  
			con=DriverManager.getConnection(url, login, pass);
		}
		catch(Exception exc)
		{
			System.err.println(exc.getMessage());
		}


	}
	
	public MysqlConnecteur(String base)
	{
		this("localhost",base,"ynov","ynov");
	}
	
	public ResultSet select(String sql)
	{
		// SQL Request
		try
		{	
			Statement instruction=con.createStatement();
			ResultSet rs = instruction.executeQuery(sql);
			return rs;
		}
		catch(Exception exc)
		{
			System.err.println(exc.getMessage());
			return null;
		}

	}
	
	public int maj(String sql)
	{
		try
		{	
			Statement instruction=con.createStatement();
			int rs = instruction.executeUpdate(sql);
			return rs;
		}
		catch(Exception exc)
		{
			System.err.println(exc.getMessage());
			return -1;
		}
	}
}


