package edu.grinnell.csc207.knoebber17.layout;

public class CenteredBlock implements TextBlock {

	TextBlock block;
	int width;
	int height;
	public CenteredBlock(TextBlock block, int width) throws Exception
	{
		if(width<block.width())
			throw new Exception("Width must be larger than parent block");
		
		this.block=block;
		this.width=width;
		this.height=block.height();
	}
	public String row(int i) throws Exception {
		
		if(i<0 || i>height)
			throw new Exception("Invalid row " + i);
		
		String result=block.row(i);
		int difference=(width-result.length())/2; //divide the difference in length by 2 to find how much to add to the start and end
		System.out.println(difference);
		if(difference<0)
			throw new Exception("Attempt to center block that is too large to be held in surrounding block");
		for(int k=0;k<difference;k++)
		{
			result=" " + result;
			result=result + " ";
		}//for
		return result;
	}

	
	public int height() {
		// TODO Auto-generated method stub
		return height;
	}

	
	public int width() {
		// TODO Auto-generated method stub
		return width;
	}

}
