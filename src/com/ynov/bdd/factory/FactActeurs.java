package com.ynov.bdd.factory;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.ynov.bdd.connecteur.MysqlConnecteur;
import com.ynov.bdd.domain.Acteur;

public class FactActeurs 
{
	private int curseur = 0;
	private ArrayList<Acteur> collection = new ArrayList<Acteur>();
	
	public FactActeurs()
	{
		// ouvrir une connexion, table 'acteurs', stocker chaque enregistrement dans la collection
		
		//try catch
		try
		{
			MysqlConnecteur connect = new MysqlConnecteur("films");
			
			// SQL Request
			//recup dans un resultset tous les enregistrements de la table 'acteurs'
			String sql = "SELECT * FROM acteurs";
			ResultSet rs = connect.select(sql);
			
			while(rs.next()) 
			{
				int code = rs.getInt("codeActeur");
				String prenom = rs.getString("prenomActeur");
				String nom = rs.getString("nomActeur");
				int annee = rs.getInt("anneeNaissanceActeur");
				int sexe = rs.getInt("sexeActeur");
				Acteur acteur = new Acteur(code, nom, prenom, sexe, annee);
				collection.add(acteur);
			}
		}
		catch(Exception exc)
		{
			System.err.println(exc.getMessage());
		}
			
			//boucle tant que y a un enregistrement
				//recup chaque champ
				//créer un pbjet Acteur
				//ajouter l'objet à la collection
	}
	
	public Acteur afficheActeurCourant()
	{
		return collection.get(curseur);
	}
	
	public void precedent()
	{
		if(curseur<collection.size()-1)
		{
			curseur--;
		}
	}
	
	public void suivant()
	{
		if(curseur<collection.size())
		{
			curseur++;
		}
	}
	
	public void premier()
	{
		
	}
	
	public void dernier()
	{
		
	}
	
	public String bandeau()
	{
		return "Enregistrement "+(curseur+1)+"/"+collection.size();
	}
	
	public boolean estPremier()
	{
		return curseur == 0;
	}
	
	public boolean estDernier()
	{
		return false;
	}
}
