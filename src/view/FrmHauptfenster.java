package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class FrmHauptfenster {

	private JFrame frame;
	private JTable tbl_Turniere;
	private JButton btnTurnierAnlegen;
	private JButton btnTurniereLaden;
	private JLabel lblStatus;
	private ActionListener actionListener;
	
	/**
	 * Load the Window externally
	 */
	public static FrmHauptfenster init() {
		FrmHauptfenster window = new FrmHauptfenster();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return window;
	}

	/**
	 * Create the window.
	 */
	public FrmHauptfenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnTurnierAnlegen = new JButton("Turnier anlegen");
		btnTurnierAnlegen.setBounds(83, 28, 146, 133);
		frame.getContentPane().add(btnTurnierAnlegen);
		
		btnTurniereLaden = new JButton("Turniere laden");
		btnTurniereLaden.setBounds(457, 28, 146, 133);
		frame.getContentPane().add(btnTurniereLaden);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 240, 520, 192);
		frame.getContentPane().add(scrollPane);
		
		tbl_Turniere = new JTable();
		scrollPane.setViewportView(tbl_Turniere);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Meldungen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(16, 487, 672, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblStatus = new JLabel("");
		lblStatus.setBounds(6, 16, 660, 33);
		panel.add(lblStatus);
		
		
	}
	
	//methode, welche von außen einen listener entgegen nimmt, und diesen den jeweiligen buttons zuordnet
	public void addActionListenerToForm(ActionListener listener) {
		this.actionListener=listener;
		btnTurnierAnlegen.addActionListener(listener);
		btnTurniereLaden.addActionListener(listener);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
