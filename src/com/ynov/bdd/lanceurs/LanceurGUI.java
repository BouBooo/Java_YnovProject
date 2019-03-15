package com.ynov.bdd.lanceurs;

import javax.swing.JFrame;

import com.ynov.bdd.gui.ActeurFrame;

public class LanceurGUI {

	public static void main(String[] args) {
		// Instancier ActeurFrame
		ActeurFrame guiframe = new ActeurFrame();
		
		//Quand on ferme la fenetre ça ferme l'application
		guiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//On rend visible la fenetre
		guiframe.setVisible(true);


	}

}
