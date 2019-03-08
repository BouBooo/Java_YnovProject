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
			
			//boucle tant que y a un enregistrement
			while(rs.next()) 
			{
				//recup chaque champ
				int code = rs.getInt("codeActeur");
				String prenom = rs.getString("prenomActeur");
				String nom = rs.getString("nomActeur");
				int annee = rs.getInt("anneeNaissanceActeur");
				int sexe = rs.getInt("sexeActeur");
				//créer un pbjet Acteur
				Acteur acteur = new Acteur(code, nom, prenom, sexe, annee);
				//ajouter l'objet à la collection
				collection.add(acteur);
			}
		}
		catch(Exception exc)
		{
			System.err.println(exc.getMessage());
		}			
				
	}
	
	public Acteur afficheActeurCourant()
	{
		return collection.get(curseur);
	}
	
	public void precedent()
	{
		if(curseur<collection.size()+1)
		{
			curseur--;
		}
	}
	
	public void suivant()
	{
		if(curseur<collection.size()+1)
		{
			curseur++;
		}
	}
	
	public void premier()
	{
		curseur = 1;
	}
	
	public void dernier()
	{
		curseur = collection.size()-1;
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
		return curseur == collection.size()-1;
	}
}
