package controller;

import view.FrmHauptfenster;
import view.FrmTurnierAnlegen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import model.*;

/**
 * 	Kümmert sich um das Event-Handling und vermittelt Daten zwischen View und Model
 * 
 * 
 * 
 * 
 *
 */
public class Controller {
	
	private FrmHauptfenster hauptfenster;
	private FrmTurnierAnlegen turnierFenster;
	private TurnierVerwaltung model;
	private HauptfensterListener lstn_hauptfenster;
	private TurnierAnlegenFensterListener lstn_turnierAnlegen;
	
	
	public Controller() {
		
		//Hauptfenster laden/initiieren
		hauptfenster = FrmHauptfenster.init();
		//Model-Objekt in den Speicher laden
		model=new TurnierVerwaltung(this);
		//Listener-Objekte in den Speicher laden
		lstn_hauptfenster=new HauptfensterListener();
		lstn_turnierAnlegen=new TurnierAnlegenFensterListener();
		//listener an die enstprechenden views weitergeben
		hauptfenster.addActionListenerToForm(lstn_hauptfenster);
		
		
	}
	
	
	
	
	
	//innere klasse, welche den action-listener für frmhauptfenster bereit stellt
	private class HauptfensterListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			//fallunterscheidung - welcher button wurde geklickt?
			if(event.getActionCommand().equals("Turnier anlegen")) {
				//laden des fensters für turniere anlegen
				turnierFenster=FrmTurnierAnlegen.init();
				//an das turnierfenster den listener aus controller übergeben
				turnierFenster.addActionListenerToView(lstn_turnierAnlegen);
				
			}
			else if(event.getActionCommand().equals("Turniere laden")) {
				
			}
			
			
		}
	}
	
	//innere klasse für den listener des turnier-anlegen-fensters
	private class TurnierAnlegenFensterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("Zurueck")) {
				//turnier-fenster unsichtbar machen und dessen ressourcen freigeben
				turnierFenster.setVisible(false);
				turnierFenster.dispose();
			}
			else if(e.getActionCommand().equals("Speichern")) {
				//model-methode aufrufen zum speichern der turnierdaten in der db
				model.dbConnect();
				model.turnierSpeichern(turnierFenster.getTxt_turnierName().getText(), turnierFenster.getTxt_ort().getText(), 
						turnierFenster.getTxt_beginn().getText(), turnierFenster.getTxt_ende().getText(), turnierFenster.getTxt_status().getText());
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
