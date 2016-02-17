package ctect.model;

/**
 *  @author mhal4767
 *@version 0.x FEb 11, 2016
 */
public class RecursonTool
{

	public int getFibNumber(int position)
	{
		
		// Defensive code against user evilness
		if(position<0)
		{return Integer.MIN_VALUE;
		}
		//base case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else // Recursive case - we must keep calling the method.
		{
			return getFibNumber(position-1) + getFibNumber(position -2);
		}
		
		
		
	}
}
