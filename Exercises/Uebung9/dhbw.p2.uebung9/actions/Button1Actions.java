package dhbw.p2.uebung9.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;

public class Button1Action extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea myTextArea1 = null;
	
	public Button1Action(JTextArea myTextArea)
	{
		super("Button 1");
		myTextArea1 = myTextArea;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		//ThirdActionFrame.getInstance().append("Button 1 Pressed: ");
		myTextArea1.append("Button 1 pressed. \n");
	}
}
