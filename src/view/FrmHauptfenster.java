package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmHauptfenster {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JButton btnTurnierAnlegen;
	private JButton btnTurnierLabel;
	private JLabel lbStatus;
	private ActionListener actionListener;

	/**
	 * Load the window externally.
	 */
	public static FrmHauptfenster init() {
		FrmHauptfenster window = new FrmHauptfenster();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHauptfenster window = new FrmHauptfenster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return window;
	}

	/**
	 * Create the application.
	 */
	public FrmHauptfenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 793, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnTurnierAnlegen = new JButton("Turnier anlegen");
		btnTurnierAnlegen.setBounds(101, 22, 116, 100);
		frame.getContentPane().add(btnTurnierAnlegen);
		
		btnTurnierLabel = new JButton("Turniere laden");
		btnTurnierLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTurnierLabel.setBounds(541, 24, 130, 96);
		frame.getContentPane().add(btnTurnierLabel);
		
		table = new JTable();
		table.setBounds(332, 323, 148, -52);
		frame.getContentPane().add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(101, 160, 570, 181);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Meldungen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(58, 380, 644, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lbStatus = new JLabel("");
		lbStatus.setBounds(10, 22, 632, 23);
		panel.add(lbStatus);
	}
	//Methode, welche  von außen einen listener entgegen nimmt, und dieser den jeweiligen buttons zuordnet
	public void addActionListenerToForm(ActionListener listener) {
		this.actionListener = listener;
		btnTurnierAnlegen.addActionListener(listener);
		btnTurnierLabel.addActionListener(listener);
	}
}


