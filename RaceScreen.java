package charcreate;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * The Class RaceScreen.
 */
public class RaceScreen extends JPanel {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public RaceScreen() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRace.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblRace, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{94, 94, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 28, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 0;
		gbc_verticalStrut.gridy = 1;
		panel.add(verticalStrut, gbc_verticalStrut);
		
		JButton btnHuman = new JButton("Human");
		btnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Character.getInstance().setRace("human");
				ImageIcon imageIcon = new ImageIcon("human.png");
				Image img = imageIcon.getImage(); 
				Image resizedImg = img.getScaledInstance(115, 115, Image.SCALE_SMOOTH);
				lblNewLabel.setIcon(new ImageIcon(resizedImg));
			}
		});
		GridBagConstraints gbc_btnHuman = new GridBagConstraints();
		gbc_btnHuman.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHuman.insets = new Insets(0, 0, 5, 5);
		gbc_btnHuman.gridx = 0;
		gbc_btnHuman.gridy = 2;
		panel.add(btnHuman, gbc_btnHuman);
		
		JButton btnElf = new JButton("Elf");
		btnElf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Character.getInstance().setRace("elf");
				ImageIcon imageIcon = new ImageIcon("elf.png");
				Image img = imageIcon.getImage(); 
				Image resizedImg = img.getScaledInstance(115, 115, Image.SCALE_SMOOTH);
				lblNewLabel.setIcon(new ImageIcon(resizedImg));
			}
		});
		GridBagConstraints gbc_btnElf = new GridBagConstraints();
		gbc_btnElf.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnElf.insets = new Insets(0, 0, 5, 0);
		gbc_btnElf.gridx = 1;
		gbc_btnElf.gridy = 2;
		panel.add(btnElf, gbc_btnElf);
		
		JButton btnDwarf = new JButton("Dwarf");
		btnDwarf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Character.getInstance().setRace("dwarf");
				ImageIcon imageIcon = new ImageIcon("dwarf.png");
				Image img = imageIcon.getImage(); 
				Image resizedImg = img.getScaledInstance(115, 115, Image.SCALE_SMOOTH);
				lblNewLabel.setIcon(new ImageIcon(resizedImg));
			}
		});
		GridBagConstraints gbc_btnDwarf = new GridBagConstraints();
		gbc_btnDwarf.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDwarf.insets = new Insets(0, 0, 5, 5);
		gbc_btnDwarf.gridx = 0;
		gbc_btnDwarf.gridy = 3;
		panel.add(btnDwarf, gbc_btnDwarf);
		
		JButton btnHalfling = new JButton("Halfling");
		btnHalfling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Character.getInstance().setRace("halfling");
				ImageIcon imageIcon = new ImageIcon("halfling.png");
				Image img = imageIcon.getImage(); 
				Image resizedImg = img.getScaledInstance(115, 115, Image.SCALE_SMOOTH);
				lblNewLabel.setIcon(new ImageIcon(resizedImg));
			}
		});
		GridBagConstraints gbc_btnHalfling = new GridBagConstraints();
		gbc_btnHalfling.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHalfling.insets = new Insets(0, 0, 5, 0);
		gbc_btnHalfling.gridx = 1;
		gbc_btnHalfling.gridy = 3;
		panel.add(btnHalfling, gbc_btnHalfling);
		
		JButton btnDragonborn = new JButton("Dragonborn");
		btnDragonborn.setEnabled(false);
		GridBagConstraints gbc_btnDragonborn = new GridBagConstraints();
		gbc_btnDragonborn.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDragonborn.insets = new Insets(0, 0, 5, 5);
		gbc_btnDragonborn.gridx = 0;
		gbc_btnDragonborn.gridy = 4;
		panel.add(btnDragonborn, gbc_btnDragonborn);
		
		JButton btnGnome = new JButton("Gnome");
		btnGnome.setEnabled(false);
		GridBagConstraints gbc_btnGnome = new GridBagConstraints();
		gbc_btnGnome.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGnome.insets = new Insets(0, 0, 5, 0);
		gbc_btnGnome.gridx = 1;
		gbc_btnGnome.gridy = 4;
		panel.add(btnGnome, gbc_btnGnome);
		
		JButton btnGoliath = new JButton("Goliath");
		btnGoliath.setEnabled(false);
		GridBagConstraints gbc_btnGoliath = new GridBagConstraints();
		gbc_btnGoliath.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGoliath.insets = new Insets(0, 0, 5, 5);
		gbc_btnGoliath.gridx = 0;
		gbc_btnGoliath.gridy = 5;
		panel.add(btnGoliath, gbc_btnGoliath);
		
		JButton btnTiefling = new JButton("Tiefling");
		btnTiefling.setEnabled(false);
		GridBagConstraints gbc_btnTiefling = new GridBagConstraints();
		gbc_btnTiefling.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTiefling.insets = new Insets(0, 0, 5, 0);
		gbc_btnTiefling.gridx = 1;
		gbc_btnTiefling.gridy = 5;
		panel.add(btnTiefling, gbc_btnTiefling);
		
		JButton btnGenasi = new JButton("Genasi");
		btnGenasi.setEnabled(false);
		GridBagConstraints gbc_btnGenasi = new GridBagConstraints();
		gbc_btnGenasi.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGenasi.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenasi.gridx = 0;
		gbc_btnGenasi.gridy = 6;
		panel.add(btnGenasi, gbc_btnGenasi);
		
		JButton btnArakocra = new JButton("Arakocra");
		btnArakocra.setEnabled(false);
		GridBagConstraints gbc_btnArakocra = new GridBagConstraints();
		gbc_btnArakocra.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnArakocra.gridx = 1;
		gbc_btnArakocra.gridy = 6;
		panel.add(btnArakocra, gbc_btnArakocra);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{30, 115, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\Lauren\\Desktop\\dungeons_and_dragons_40_ampersand_flat.png");
		Image img = imageIcon.getImage(); 
		Image resizedImg = img.getScaledInstance(115, 115, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(resizedImg));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextArea txtrThisIsSome = new JTextArea();
		txtrThisIsSome.setWrapStyleWord(true);
		txtrThisIsSome.setText("This is some placeholder text.");
		txtrThisIsSome.setEditable(false);
		txtrThisIsSome.setLineWrap(true);
		GridBagConstraints gbc_txtrThisIsSome = new GridBagConstraints();
		gbc_txtrThisIsSome.fill = GridBagConstraints.BOTH;
		gbc_txtrThisIsSome.gridx = 1;
		gbc_txtrThisIsSome.gridy = 1;
		panel_1.add(txtrThisIsSome, gbc_txtrThisIsSome);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Character.getInstance().toString());
			}
		});
		panel_2.add(btnSubmit);

	}

}
