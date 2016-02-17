package ctect.controller;

import ctect.model.RecursonTool;
import recursion.veiw.RecursionFrame;

public class RecursionController
{
	
		private RecursonTool mathTool;
		private RecursionFrame baseFrame;
		private String calculatedValue;
		public RecursionController()
		{
			mathTool = new RecursonTool();
			baseFrame = new RecursionFrame(this);
			
	}
		public void start()
		{
			calculatedValue = Integer.toString(mathTool.getFibNumber(0));
		}
		
		public String getCalculatedValue()
		{
			return calculatedValue;
		}
}
