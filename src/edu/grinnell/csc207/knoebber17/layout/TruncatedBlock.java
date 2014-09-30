package edu.grinnell.csc207.knoebber17.layout;

public class TruncatedBlock implements TextBlock
{
	int width;
	int height;
	TextBlock tb;
	/**
	 * Create a new truncated block of the specified width.
	 */
	public TruncatedBlock(TextBlock tb, int width)
	{
	  this.tb=tb;
	  this.width=width;
	  this.height=tb.height();
	} // TruncatedBlock(TextBlock, int)
	
	/**
	 * Get the ith row of the block.
	 * @throws Exception 
	 */
	public String row(int i) throws Exception
	{
		if(i<0 || i>height)
			throw new Exception("Invalid row " + i);
		
		String result=tb.row(i);
		result=result.substring(0,width);
		return result;
	} // row(int)
	
	/**
	 * Determine how many rows are in the block.
	 */
	public int height()
	{
		return height;
	} // height()
	
	/**
	 * Determine how many columns are in the block.
	 */
	public int width()
	{
		return width;
	} // width()
} // class TruncatedBlock