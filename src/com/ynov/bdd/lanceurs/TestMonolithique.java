package com.ynov.bdd.lanceurs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMonolithique {

	public static void main(String[] args) {
		try
		{
			// Database connection
			String base = "films";
			String ip = "localhost";
			String url = "jdbc:mysql://"+ip+"/"+base; 	//Database path
			String login = "ynov";  		  				// Login
			String pass = "ynov";			  				// Password
			Connection con=DriverManager.getConnection(url, login, pass);
			
			// SQL Request
			Statement instruction=con.createStatement();
			String sql = "SELECT * FROM acteurs";
			ResultSet rs = instruction.executeQuery(sql);
			
			// View
			while(rs.next())
			{
				String prenom = rs.getString("prenomActeur");
				String nom = rs.getString("nomActeur");
				int annee = rs.getInt("anneeNaissanceActeur");
				int sexe = rs.getInt("sexeActeur");
				String titre = sexe==1?"Mme":"Mr";
				
				System.out.println(titre+" "+prenom +" "+nom+" was born in "+annee);
			}
		}
		catch(Exception exc)
		{
			System.err.println(exc.getMessage());
		}

	}

}
