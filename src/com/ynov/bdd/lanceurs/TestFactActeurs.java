package com.ynov.bdd.lanceurs;

import com.ynov.bdd.factory.FactActeurs;

public class TestFactActeurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactActeurs fa = new FactActeurs();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		
		//precedent
		fa.precedent();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());	
		fa.precedent();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		fa.suivant();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());
		
		fa.estPremier();
		if(fa.estPremier())
		{
			System.out.print("Cet acteur est le premier\n");
		}
		else
		{
			System.out.print("Cet acteur n'est pas le premier\n");
		}
		
		fa.estDernier();
		if(fa.estDernier())
		{
			System.out.print("Cet acteur est le dernier\n");
		}
		else
		{
			System.out.print("Cet acteur n'est pas le dernier\n");
		}
		
		//System.out.println(fa.estPremier());
		//System.out.println(fa.estDernier());
		
		
	}

}
