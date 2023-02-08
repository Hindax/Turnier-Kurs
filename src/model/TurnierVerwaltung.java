package model;

import controller.Controller;

/***
 * Das Model dieser MVC-Anwendung
 * -> Aufgaben :
 * 
 * -DB-Verbindung, Daten laden /speichern
 * -Vermittlung von Statusmeldungen und Daten an den Controller/View
 * -Prüfungen. Eingabe-Validierungen
 *
 */
public class TurnierVerwaltung {
	private Controller controller;
	
	public TurnierVerwaltung(Controller controller) {
		this.controller=controller;
	}

	
}
