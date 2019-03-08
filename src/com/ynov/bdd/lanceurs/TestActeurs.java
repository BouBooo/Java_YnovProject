package com.ynov.bdd.lanceurs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ynov.bdd.domain.Acteur;


public class TestActeurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acteur a1 = new Acteur(1, "Silouan", "LE COSSEC", 0, 1996);
		Acteur a2 = new Acteur(2, "Clément", "XIMENES", 0, 1997);
		System.out.println(a1);
		System.out.println(a2);
	}

}
