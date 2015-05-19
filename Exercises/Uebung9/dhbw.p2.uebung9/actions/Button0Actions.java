package dhbw.p2.uebung9.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;

import dhbw.p2.uebung9.gui.ThirdActionFrame;

public class Button0Action extends AbstractAction
{
	/**
	 * 
	 */
	int x = ThirdActionFrame.buttonCounter0;
	
	private static final long serialVersionUID = 1L;

	public Button0Action()
	{
		super("Button 0.0");
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		x++;
		ThirdActionFrame.getInstance().append("Button 0 Pressed: "+x+" times");
		
	}

	
	
}
