package dhbw.p2.uebung9.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

import dhbw.p2.uebung9.actions.Button0Action;
import dhbw.p2.uebung9.actions.Button1Action;
import dhbw.p2.uebung9.actions.Button2Action;
import dhbw.p2.uebung9.actions.Button3Action;

public class ThirdActionFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static ThirdActionFrame instance = null;
	
	private JButton myButton0 = null;
	private JButton myButton1 = null;
	private JButton myButton2 = null;
	private JButton myButton3 = null;
	
	public static int buttonCounter0 = 0;
	
	private JTextArea myTextArea = new JTextArea("");
	JPanel ButtonPanel = new JPanel(new FlowLayout());
	
	
	public ThirdActionFrame()
	  {
	  	  	
	  	initAction();
	  	initGUI();
	  }


	private void initGUI() {

		myTextArea.setEditable(false);
		
		this.setSize(500, 300);
		this.setLocation(312, 234);
		this.setLayout(new FlowLayout());
		
		
		//this.add(myButton0);
		//this.add(myButton1);
		//this.add(myButton2);
		//this.add(myButton3);
		this.setVisible(true);
		
		ButtonPanel.add(myButton0);
		ButtonPanel.add(myButton1);
		ButtonPanel.add(myButton2);
		ButtonPanel.add(myButton3);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(ButtonPanel, BorderLayout.NORTH);
		this.add(new JScrollPane(myTextArea), BorderLayout.CENTER);
		
				
	}


	private void initAction() {

		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		myButton0 = new JButton(new Button0Action());
		myButton1 = new JButton(new Button1Action(myTextArea));
		myButton2 = new JButton(new Button2Action());
		myButton3 = new JButton(new Button3Action());
		//myButton4 = new JButton("Test");
		
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
	public void append(String newLine)
	{
		myTextArea.append(newLine+"\n");
	}
	 public static ThirdActionFrame getInstance()
	 {
		 if(instance==null)
		 {
			 instance = new ThirdActionFrame();
		 }
		 return instance;
	 }
	
	
	
	
}
