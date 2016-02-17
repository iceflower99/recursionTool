package recursion.veiw;

import javax.swing.JFrame;
import ctect.controller.RecursionController;

public class RecursionFrame
{
	private RecursionPanel basePanel;
	private RecursionController baseController;
	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Lets recurse");
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	
	
}
