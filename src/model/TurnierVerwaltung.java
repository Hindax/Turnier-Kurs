package model;

import java.util.Date;

import controller.Controller;

/**	
 * 	Das Model dieser MVC-Anwendung
 * 
 * 	-> Aufgaben: 
 * 
 * 		- DB-Verbindung, Daten laden/speichern
 * 		- Vermittlung von Statusmeldungen und Daten an den Controller/View
 * 		- Prüfungen, Eingabe-Validierungen
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */
public class TurnierVerwaltung {
	private Controller controller;
	
	public TurnierVerwaltung(Controller controller) {
		this.controller=controller;
	}
	
	//mit der DB verbinden
	public void dbConnect() {
		
		
		
		
		
		
		
	}
	
	//neues turnier in db speichern
	public void turnierSpeichern(String turnierName, String ort, String beginn, String ende, String status) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
