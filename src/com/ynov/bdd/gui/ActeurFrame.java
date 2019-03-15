package com.ynov.bdd.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.ynov.bdd.domain.Acteur;
import com.ynov.bdd.factory.FactActeurs;
import com.ynov.bdd.factory.FactActeurs;
import com.ynov.bdd.factory.FactActeurs;

@SuppressWarnings("serial")
public class ActeurFrame extends JFrame implements ActionListener {

	private JTextField jtf_code, jtf_prenom, jtf_nom, jtf_annee, jtf_sexe;
	private JButton jb_premier, jb_precedent, jb_suivant, jb_dernier, jb_quit;
	private FactActeurs collec;
	
	public ActeurFrame()
	{
		collec = new FactActeurs();
		//Frame size
		setSize(400, 300);
		
		
		//crée jpanel de type JPanem, et lui associer un layout GRID
		// GridLayout (rows, columns, border)
		JPanel panelData = new JPanel(new GridLayout(5, 2, 10, 10));
		
		//margin around panel
		panelData.setBorder(new EmptyBorder(10, 10, 10, 10));
	
		//ligne du code : jLabel + jtextfield
		panelData.add(new JLabel("Code: "));
		jtf_code = new JTextField();
		panelData.add(jtf_code);
		
		panelData.add(new JLabel("Prénom: "));
		jtf_prenom = new JTextField();
		panelData.add(jtf_prenom);
		
		panelData.add(new JLabel("Nom: "));
		jtf_nom = new JTextField();
		panelData.add(jtf_nom);
		
		panelData.add(new JLabel("Annee: "));
		jtf_annee = new JTextField();
		panelData.add(jtf_annee);
		
		panelData.add(new JLabel("Sexe: "));
		jtf_sexe = new JTextField();
		panelData.add(jtf_sexe);
	
		
		//on colle le panelData dans la frame
		add(panelData);
		
		//panel des boutons + border
		JPanel panelBoutons = new JPanel(new GridLayout(1, 5, 10, 10));
		panelBoutons.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		
		jb_premier = new JButton("|<<");
		panelBoutons.add(jb_premier);
		
		jb_precedent = new JButton("<");
		panelBoutons.add(jb_precedent);
		
		jb_suivant = new JButton(">");
		panelBoutons.add(jb_suivant);
		
		jb_dernier = new JButton(">>|");
		panelBoutons.add(jb_dernier);

		
		jb_quit = new JButton("X");
		panelBoutons.add(jb_quit);
		
		//listen
		jb_premier.addActionListener(this);
		jb_dernier.addActionListener(this);
		jb_suivant.addActionListener(this);
		jb_precedent.addActionListener(this);
		jb_quit.addActionListener(this);
		
		
		add(panelBoutons,BorderLayout.SOUTH);
		
		afficheActeur();
		btnDisable();
		
	}
		
	public void afficheActeur()
	{
		setTitle(collec.bandeau());
		Acteur current_acteur = collec.afficheActeurCourant();
		jtf_code.setText(String.valueOf(current_acteur.getCodeActeur()));
		jtf_prenom.setText(String.valueOf(current_acteur.getPrenomActeur()));
		jtf_nom.setText(String.valueOf(current_acteur.getNomActeur()));
		jtf_annee.setText(String.valueOf(current_acteur.getAnneeNaissanceActeur()));
		jtf_sexe.setText(String.valueOf(current_acteur.getSexeActeur()));
		
	}
	
	public void btnDisable()
	{
		jb_premier.setEnabled(!collec.estPremier());
		jb_dernier.setEnabled(!collec.estDernier());
		jb_precedent.setEnabled(!collec.estPremier());
		jb_suivant.setEnabled(!collec.estDernier());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb_premier)
		{
			collec.premier();
			
		}
		else if(e.getSource()==jb_dernier)
		{
			collec.dernier();
		}
		else if(e.getSource()==jb_suivant)
		{
			collec.suivant();
	
		}
		else if(e.getSource()==jb_precedent)
		{
			collec.precedent();
		}
		else if(e.getSource()==jb_quit)
		{
			System.exit(0);
		}
		
		afficheActeur();
		btnDisable();
	}
}
