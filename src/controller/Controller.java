package controller;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;



/**	
* Kümmert sich unm das Event-handlung und vermittelt Daten zwischen View und Model
*	
*	
*/
public class Controller {
	
	private FrmHauptfenster hauptfenster;
	private TurnierVerwaltung model;
	private HauptfensterListener lsn_hauptfenster;
	
	

	

	//innere Klasse, welche den action-listener für frmhauptfenster bereit stellt
	private class HauptfensterListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			//fallunterscheidung - welcher Button wurde geklickt
			if(event.getActionCommand().equals("Turnier anlegen")) {
				
			}
			else if(event.getActionCommand().equals("Turniere laden")) {
				
			}
		}
	}


}
