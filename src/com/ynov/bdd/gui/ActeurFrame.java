package com.ynov.bdd.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ActeurFrame extends JFrame implements ActionListener {

	private JTextField jtf_code, jtf_prenom, jtf_nom, jtf_annee, jtf_sexe;
	private JButton jb_premier, jb_precedent, jb_suivant, jb_dernier, jb_quit;
	
	public ActeurFrame()
	{
		//crée jpanel de type JPanem, et lui associer un layout GRID
		// GridLayout (rows, columns, border)
		JPanel panelData = new JPanel(new GridLayout(5, 2, 10, 10));
		
		//ligne du code : jLabel + jtexetfield
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
		
		//panel des boutons
		JPanel panelBoutons = new JPanel(new GridLayout(1, 5, 10, 10));
		
		
		jb_premier = new JButton("|<<");
		panelBoutons.add(jb_premier);
		
		jb_dernier = new JButton(">>|");
		panelBoutons.add(jb_dernier);
		
		jb_suivant = new JButton(">");
		panelBoutons.add(jb_suivant);
		
		jb_precedent = new JButton("<");
		panelBoutons.add(jb_precedent);
		
		
		add(panelBoutons,BorderLayout.SOUTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
