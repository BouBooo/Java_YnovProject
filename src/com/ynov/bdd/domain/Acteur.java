package com.ynov.bdd.domain;

public class Acteur {
	private int m_codeActeur;
	private String m_prenomActeur;
	private String m_nomActeur;
	private int m_sexeActeur;
	private int m_anneeNaissanceActeur;
	
	public Acteur(int codeActeur, String prenomActeur, String nomActeur, int sexeActeur, int anneeNaissanceActeur) {
		super();
		m_codeActeur = codeActeur;
		m_prenomActeur = prenomActeur;
		m_nomActeur = nomActeur;
		m_sexeActeur = sexeActeur;
		m_anneeNaissanceActeur = anneeNaissanceActeur;
	}
	
	public String toString()
	{
		return String.format("%3d : %3s %20s %20s né(e) en %d", m_codeActeur,(m_sexeActeur==1?"Mme":"M."), 
				m_prenomActeur, m_nomActeur, m_anneeNaissanceActeur);
	}

	public int getCodeActeur() {
		return m_codeActeur;
	}

	public void setCodeActeur(int codeActeur) {
		m_codeActeur = codeActeur;
	}

	public String getPrenomActeur() {
		return m_prenomActeur;
	}

	public void setPrenomActeur(String prenomActeur) {
		m_prenomActeur = prenomActeur;
	}

	public String getNomActeur() {
		return m_nomActeur;
	}

	public void setNomActeur(String nomActeur) {
		m_nomActeur = nomActeur;
	}

	public int getSexeActeur() {
		return m_sexeActeur;
	}

	public void setSexeActeur(int sexeActeur) {
		m_sexeActeur = sexeActeur;
	}

	public int getAnneeNaissanceActeur() {
		return m_anneeNaissanceActeur;
	}

	public void setAnneeNaissanceActeur(int anneeNaissanceActeur) {
		m_anneeNaissanceActeur = anneeNaissanceActeur;
	}

}

