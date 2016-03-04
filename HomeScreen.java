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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Lauren Williams
 * 
 * The Class HomeScreen.
 * 
 * This is the initial screen the user is taken to.
 * From this screen, the user can either create a new
 * character, load an existing character, read how to
 * use the software or read about the software.
 * 
 */

public class HomeScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	/*HomeScreen constructor */
	public HomeScreen() {
		setLayout(new BorderLayout(0, 0));
		
		/* Title label of HomeScreen */
		JLabel lblDdCharacterCreator = new JLabel("D&D Character Creator");
		lblDdCharacterCreator.setFont(new Font("Play", Font.PLAIN, 24));
		lblDdCharacterCreator.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDdCharacterCreator, BorderLayout.NORTH);
		
		/* Set up JPanel for buttons */
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{26, 117, 162, 117, 26, 0};
		gbl_panel.rowHeights = new int[]{25, 50, 40, 40, 40, 50, 27, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		/* Adding "New" button */
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNew = new GridBagConstraints();
		gbc_btnNew.fill = GridBagConstraints.BOTH;
		gbc_btnNew.insets = new Insets(0, 0, 5, 5);
		gbc_btnNew.gridx = 1;
		gbc_btnNew.gridy = 1;
		panel.add(btnNew, gbc_btnNew);
		
		/* Adding "Load" button */
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnLoad = new GridBagConstraints();
		gbc_btnLoad.fill = GridBagConstraints.BOTH;
		gbc_btnLoad.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoad.gridx = 3;
		gbc_btnLoad.gridy = 1;
		panel.add(btnLoad, gbc_btnLoad);
		
		/* Adding "How to Use" button */
		JButton btnHowToUse = new JButton("How to Use");
		btnHowToUse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnHowToUse = new GridBagConstraints();
		gbc_btnHowToUse.fill = GridBagConstraints.BOTH;
		gbc_btnHowToUse.insets = new Insets(0, 0, 5, 5);
		gbc_btnHowToUse.gridx = 1;
		gbc_btnHowToUse.gridy = 5;
		panel.add(btnHowToUse, gbc_btnHowToUse);
		
		/* Adding "About" button */
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnAbout = new GridBagConstraints();
		gbc_btnAbout.insets = new Insets(0, 0, 5, 5);
		gbc_btnAbout.fill = GridBagConstraints.BOTH;
		gbc_btnAbout.gridx = 3;
		gbc_btnAbout.gridy = 5;
		panel.add(btnAbout, gbc_btnAbout);

	}

}
