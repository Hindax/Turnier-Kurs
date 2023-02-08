package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class FrmTurnierAnlegen extends JFrame {

	private JPanel contentPane;
	private JTextField txt_turnierName;
	private JTextField txt_ort;
	private JTextField txt_beginn;
	private JTextField txt_ende;
	private JTextField txt_status;
	private JLabel lbl_meldung;
	private JButton btn_zurueck;
	private JButton btn_speichern;
	private ActionListener lstn_action;

	/**
	 * Launch the Frame
	 */
	public static FrmTurnierAnlegen init() {
		FrmTurnierAnlegen window=new FrmTurnierAnlegen();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return window;
		
	}

	/**
	 * Create the frame.
	 */
	public FrmTurnierAnlegen() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 710, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_turnierName = new JLabel("Turniername");
		lbl_turnierName.setBounds(35, 31, 73, 24);
		contentPane.add(lbl_turnierName);
		
		txt_turnierName = new JTextField();
		txt_turnierName.setBounds(109, 33, 128, 20);
		contentPane.add(txt_turnierName);
		txt_turnierName.setColumns(10);
		
		JLabel lbl_ort = new JLabel("Ort");
		lbl_ort.setBounds(35, 89, 73, 24);
		contentPane.add(lbl_ort);
		
		txt_ort = new JTextField();
		txt_ort.setColumns(10);
		txt_ort.setBounds(109, 91, 128, 20);
		contentPane.add(txt_ort);
		
		JLabel lbl_Beginn = new JLabel("Beginn");
		lbl_Beginn.setBounds(35, 148, 73, 24);
		contentPane.add(lbl_Beginn);
		
		txt_beginn = new JTextField();
		txt_beginn.setColumns(10);
		txt_beginn.setBounds(109, 150, 128, 20);
		contentPane.add(txt_beginn);
		
		JLabel lbl_Ende = new JLabel("Ende");
		lbl_Ende.setBounds(35, 213, 73, 24);
		contentPane.add(lbl_Ende);
		
		txt_ende = new JTextField();
		txt_ende.setColumns(10);
		txt_ende.setBounds(109, 215, 128, 20);
		contentPane.add(txt_ende);
		
		JLabel lbl_status = new JLabel("Status");
		lbl_status.setBounds(35, 282, 73, 24);
		contentPane.add(lbl_status);
		
		txt_status = new JTextField();
		txt_status.setColumns(10);
		txt_status.setBounds(109, 284, 128, 20);
		contentPane.add(txt_status);
		
		btn_zurueck = new JButton("Zurueck");
		btn_zurueck.setBounds(67, 376, 154, 36);
		contentPane.add(btn_zurueck);
		
		btn_speichern = new JButton("Speichern");
		btn_speichern.setBounds(464, 376, 154, 36);
		contentPane.add(btn_speichern);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(28, 442, 617, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lbl_meldung = new JLabel("");
		lbl_meldung.setBounds(10, 11, 605, 24);
		panel.add(lbl_meldung);
	}

	public JTextField getTxt_turnierName() {
		return txt_turnierName;
	}

	public JTextField getTxt_ort() {
		return txt_ort;
	}

	public JTextField getTxt_beginn() {
		return txt_beginn;
	}

	public JTextField getTxt_ende() {
		return txt_ende;
	}

	public JTextField getTxt_status() {
		return txt_status;
	}

	public JLabel getLbl_meldung() {
		return lbl_meldung;
	}

	public void setLbl_meldung(JLabel lbl_meldung) {
		this.lbl_meldung = lbl_meldung;
	}
	
	//methode für das übergeben des listeners aus dem controller
	public void addActionListenerToView(ActionListener listener) {
		lstn_action=listener;
		btn_speichern.addActionListener(listener);
		btn_zurueck.addActionListener(listener);
		
	}
	
	
	
}
