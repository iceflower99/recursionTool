package recursion.veiw;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

import ctect.controller.RecursionController;
/**
 * @author mhal4767
 * @version ).x Feb 17
 */
public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton= new JButton("Get the Fibonacci sequence for this number");
		factorialButton = new JButton("Get n!");
		inputField = new JTextField(20);
		resultsArea= new JTextArea(10,20);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 36, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -127, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 64, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 58, SpringLayout.WEST, this);

	}
}
