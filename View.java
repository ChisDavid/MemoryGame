import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.*;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.CardLayout;

public class View {
	private JFrame frame;
	private String[] File = new String[] { "File", "New Game", "Resolve" };
	private JPanel MainPanel = new JPanel();
	private JComboBox comboBox = new JComboBox();
	private final JComboBox comboBox_1 = new JComboBox();
	public JPanel getPanel8x4() {
		return Panel8x4;
	}
	private final JComboBox comboBox_2 = new JComboBox();
	private String[] Help = new String[] { "Help ", "About Game", "Cards" };
	private String[] Options = new String[] { "Options", "Size", "Mode" };
	public JLabel start_button = new JLabel("");
	private JLayeredPane layeredPane = new JLayeredPane();
	public Picture[][] Cards = new Picture[3][32];
	private JPanel ChangePanel = new JPanel();
	private JLabel Title = new JLabel("Memory Game");
	public JRadioButton button_4x4 = new JRadioButton(" 4 x 4");
	public JRadioButton button_8x8 = new JRadioButton(" 8 x 8");
	public JRadioButton button_16x16 = new JRadioButton("16 x 16");
	private JLabel start = new JLabel(new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\start.jpg"));
	private JPanel Panel4x4 = new JPanel();
	public ArrayList<Integer> pozitie = new ArrayList<Integer>();
	private JPanel win = new JPanel();
	private final JLabel end = new JLabel("You win");
	public JButton home_button = new JButton("Go Home");
	private final JButton ok = new JButton("GO");
	private final JPanel Panel8x8 = new JPanel();
	private final JPanel CardsPanel = new JPanel(null);
	private final JPanel Panel8x4 = new JPanel();
	public JLabel time = new JLabel("TIME");
	public JTextField textPane = new JTextField();
	
	
	
	
	public JPanel getPanel4x4() {
		return Panel4x4;
	}

	public void setPanel4x4(JPanel panel4x4) {
		Panel4x4 = panel4x4;
	}

	public JLayeredPane getLayeredPane() {
		return layeredPane;
	}

	public void setLayeredPane(JLayeredPane layeredPane) {
		this.layeredPane = layeredPane;
	}

	public JPanel getChangePanel() {
		return ChangePanel;
	}

	public void setChangePanel(JPanel changePanel) {
		ChangePanel = changePanel;
	}

	public JFrame getFrame() {

		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public String[] getFile() {
		return File;
	}

	public void setFile(String[] file) {
		File = file;
	}

	public JPanel getMainPanel() {
		return MainPanel;
	}

	public void setMainPanel(JPanel mainPanel) {
		MainPanel = mainPanel;
	}

	public String[] getHelp() {
		return Help;
	}

	public void setHelp(String[] help) {
		Help = help;
	}

	public String[] getOptions() {
		return Options;
	}

	public void setOptions(String[] options) {
		Options = options;
	}

	public JRadioButton getButton_4x4() {
		return button_4x4;
	}

	public void setButton_4x4(JRadioButton button_4x4) {
		this.button_4x4 = button_4x4;
	}

	public JRadioButton getButton_8x8() {
		return button_8x8;
	}

	public void setButton_8x8(JRadioButton button_8x8) {
		this.button_8x8 = button_8x8;
	}

	public JRadioButton getButton_16x16() {
		return button_16x16;
	}

	public void setButton_16x16(JRadioButton button_16x16) {
		this.button_16x16 = button_16x16;
	}

	public JLabel getStart_button() {
		return start_button;
	}

	public void setStart_button(JLabel start_button) {
		this.start_button = start_button;
	}

	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox getComboBox_2() {
		return comboBox_2;
	}

	public JLabel getTitle() {
		return Title;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		View window = new View();

	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Memory Game");
		frame.setBounds(0, 0, 1500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(MainPanel);
		MainPanel.setLayout(null);

		
		comboBox.setModel(new DefaultComboBoxModel(File));
		comboBox.setBounds(0, 0, 77, 22);
		MainPanel.add(comboBox);
		comboBox_1.setModel(new DefaultComboBoxModel(Options));
		comboBox_1.setBounds(76, 0, 71, 22);

		MainPanel.add(comboBox_1);
		comboBox_2.setBounds(146, 0, 71, 22);
		comboBox_2.setModel(new DefaultComboBoxModel(Help));
		MainPanel.add(comboBox_2);
		
		ok.setBounds(280, 1, 85, 21);
		MainPanel.add(ok);

		layeredPane.setBounds(67, 109, 1223, 799);
		MainPanel.add(layeredPane);

		frame.setVisible(true);
		layeredPane.setLayout(new CardLayout(0, 0));

		ChangePanel.setLayout(null);

		layeredPane.add(ChangePanel, "name_73320185680700");
		Title.setFont(new Font("Baskerville Old Face", Font.PLAIN, 50));
		Title.setBounds(456, 11, 410, 83);

		ChangePanel.add(Title);
		
		button_4x4.setFont(new Font("Tahoma", Font.PLAIN, 61));
		button_4x4.setBounds(31, 223, 257, 168);

		ChangePanel.add(button_4x4);
		button_8x8.setFont(new Font("Tahoma", Font.PLAIN, 61));
		button_8x8.setBounds(479, 297, 257, 168);

		ChangePanel.add(button_8x8);
		button_16x16.setFont(new Font("Tahoma", Font.PLAIN, 61));
		button_16x16.setBounds(870, 223, 257, 168);

		ChangePanel.add(button_16x16);
		start.setBounds(434, 528, 320, 131);
		ChangePanel.add(start);
		layeredPane.add(Panel4x4, "name_73325589848300");
		Panel4x4.setLayout(null);
		
		layeredPane.add(win, "name_161906789686100");
		win.setLayout(null);
		
		JLabel end_of_game = new JLabel(new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\end.jpg"));
		end_of_game.setBounds(68, 58, 1060, 457);
		win.add(end_of_game);
		end.setFont(new Font("Tahoma", Font.ITALIC, 47));
		end.setBounds(490, 548, 245, 83);
		
		win.add(end);
		
		
		home_button.setBounds(752, 581, 148, 21);
		win.add(home_button);
		
		layeredPane.add(Panel8x8, "name_165209053872300");
		Panel8x8.setLayout(null);
		
		layeredPane.add(CardsPanel, "name_654786928287000");
		
		layeredPane.add(Panel8x4, "name_721451402327800");
		Panel8x4.setLayout(null);
		
		
		time.setFont(new Font("Tahoma", Font.PLAIN, 46));
		time.setBounds(1300, 284, 161, 66);
		time.setVisible(false);
		MainPanel.add(time);
		
		
		
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane.setBounds(1310, 360, 123, 50);
		textPane.setVisible(false);
		textPane.setEditable(false);
		MainPanel.add(textPane);

		
		
// CAARDS 4x4					
						
						for (int i = 0; i < 16; i++) {
							pozitie.add(new Integer((i % 8) + 1));
						}
						Collections.shuffle(pozitie);
				
						for (int i = 0; i < 16; i++) {
							JLabel face = face = new JLabel(
									new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\" + pozitie.get(i).intValue() + ".jpg"));
							JLabel back = new JLabel(new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\" + "YuGiOh" + ".jpg"));
							face.setBounds(300 * (i % 4), 175 * (i / 4), 100, 145);
							back.setBounds(300 * (i % 4), 175 * (i / 4), 100, 145);
				
							Panel4x4.add(face);
							Panel4x4.add(back);
							Cards[0][i] = new Picture(face, back, pozitie.get(i).intValue()  + ".jpg");
						}
						
// CArds 6x4        
						
						pozitie.clear();
						for (int i = 0; i < 24; i++) {
							pozitie.add(new Integer((i % 12) + 1));
						}
						Collections.shuffle(pozitie);
						for (int i = 0; i < 24; i++) {
							JLabel face = new JLabel(new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\" + pozitie.get(i).intValue() + ".jpg"));
							JLabel back = new JLabel(new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\" + "YuGiOh" + ".jpg"));
							face.setBounds(100+ 200 * (i % 6), 180 * (i / 6), 100, 145);
							back.setBounds(100+ 200 * (i % 6), 180 * (i / 6), 100, 145);
							Panel8x8.add(face);
							Panel8x8.add(back);
							Cards[1][i] = new Picture(face, back, pozitie.get(i).intValue()  + ".jpg");
						}
						
//Cards 8x4

						pozitie.clear();
						for (int i = 0; i < 32; i++) {
							pozitie.add(new Integer((i % 16) + 1));
						}
						Collections.shuffle(pozitie);
						
						for (int i = 0; i < 32; i++) {
							JLabel face = new JLabel(new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\" + pozitie.get(i).intValue() + ".jpg"));
							JLabel back = new JLabel(new ImageIcon("E:\\Facultatee\\MemoryGame\\Images\\" + "YuGiOh" + ".jpg"));
							face.setBounds( 150 * (i % 8), 180 * (i / 8), 100, 145);
							back.setBounds( 150 * (i % 8), 180 * (i / 8), 100, 145);
							Panel8x4.add(face);
							Panel8x4.add(back);
							Cards[2][i] = new Picture(face, back, pozitie.get(i).intValue()  + ".jpg");
						}	
						
						
						

		addCardListener();

	}

	public JPanel getPanel8x8() {
		return Panel8x8;
	}

	void addCardListener() {

		for (int i = 0; i < 32; i++) {
			if(Cards[0][i]!=null)
			{
				Cards[0][i].back.addMouseListener(new CardListener(0,Cards, i,layeredPane,win));
				
			}
			if(Cards[1][i]!=null)
			{
				Cards[1][i].back.addMouseListener(new CardListener(1,Cards, i,layeredPane,win));
				
			}
			if(Cards[2][i]!=null)
			{
				Cards[2][i].back.addMouseListener(new CardListener(2,Cards, i,layeredPane,win));
				
			}
			
		}

	}

	void add4x4Listener(ActionListener a) {
		button_4x4.addActionListener(a);

	}

	void add16x16Listener(ActionListener a) {

		button_16x16.addActionListener(a);

	}
     void GoHome (ActionListener a)
	
	{
		home_button.addActionListener(a);
	}

	void add8x8Listener(ActionListener a) {
		button_8x8.addActionListener(a);
	}

	void addStartListener(MouseListener a) {
		start.addMouseListener(a);
	}
	String getSelectedString()
	{
		return (String) comboBox.getSelectedItem();
	}
	String getSelectedString1()
	{
		return (String) comboBox_1.getSelectedItem();
	}
	String getSelectedString2()
	{
		return (String) comboBox_2.getSelectedItem();
	}
	void press (ActionListener a)
	{
		ok.addActionListener(a);
	}
}

