package com.ynov.bdd.lanceurs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ynov.bdd.connecteur.MysqlConnecteur;

public class TestConnecteur {

	public static void main(String[] args) {
		try
		{
			MysqlConnecteur mc=new MysqlConnecteur("films");
			
			// SQL Request
			String sql = "SELECT * FROM acteurs";
			ResultSet rs = mc.select(sql);
			
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
			
			// Deletion
			int nb = mc.maj("DELETE FROM acteurs WHERE codeActeur = 8");
			System.out.print("Suppr acteur 8 : "+nb);
		}
		catch(Exception exc)
		{
			System.err.println(exc.getMessage());
		}

	}

}