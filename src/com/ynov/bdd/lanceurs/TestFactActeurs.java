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
		fa.precedent();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());	
		fa.precedent();
		System.out.println(fa.afficheActeurCourant());
		System.out.println(fa.bandeau());	
		
		
	}

}
