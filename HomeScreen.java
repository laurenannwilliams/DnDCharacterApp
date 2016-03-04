package dndapp;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class HomeScreen extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public HomeScreen() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblDdCharacterCreator = new JLabel("D&D Character Creator");
		lblDdCharacterCreator.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDdCharacterCreator.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDdCharacterCreator, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 117, 0, 0, 0, 0, 35, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{25, 45, 40, 40, 40, 40, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNew = new JButton("New");
		GridBagConstraints gbc_btnNew = new GridBagConstraints();
		gbc_btnNew.fill = GridBagConstraints.BOTH;
		gbc_btnNew.insets = new Insets(0, 0, 5, 5);
		gbc_btnNew.gridx = 1;
		gbc_btnNew.gridy = 1;
		panel.add(btnNew, gbc_btnNew);
		
		JButton btnLoad = new JButton("Load");
		GridBagConstraints gbc_btnLoad = new GridBagConstraints();
		gbc_btnLoad.fill = GridBagConstraints.BOTH;
		gbc_btnLoad.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoad.gridx = 7;
		gbc_btnLoad.gridy = 1;
		panel.add(btnLoad, gbc_btnLoad);
		
		JButton btnHowToUse = new JButton("How to Use");
		GridBagConstraints gbc_btnHowToUse = new GridBagConstraints();
		gbc_btnHowToUse.fill = GridBagConstraints.BOTH;
		gbc_btnHowToUse.insets = new Insets(0, 0, 0, 5);
		gbc_btnHowToUse.gridx = 1;
		gbc_btnHowToUse.gridy = 5;
		panel.add(btnHowToUse, gbc_btnHowToUse);
		
		JButton btnAbout = new JButton("About");
		GridBagConstraints gbc_btnAbout = new GridBagConstraints();
		gbc_btnAbout.insets = new Insets(0, 0, 0, 5);
		gbc_btnAbout.fill = GridBagConstraints.BOTH;
		gbc_btnAbout.gridx = 7;
		gbc_btnAbout.gridy = 5;
		panel.add(btnAbout, gbc_btnAbout);

	}

}
