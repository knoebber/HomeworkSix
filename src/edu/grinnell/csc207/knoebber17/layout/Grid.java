package edu.grinnell.csc207.knoebber17.layout;

public class Grid
    implements TextBlock
{
  int height;
  int width;
  char ch;

  /**
   * 
   * @param width, the width of the TextBlock. width>=0
   * @param height, the height of the TextBlock. height>=0
   * @param ch, what the TextBlock will be filled with. 
   * 
   */
  public Grid(int width, int height, char ch)
  {
    this.height = height;
    this.width = width;
    this.ch = ch;

  }//Grid

  public String row(int i)
    throws Exception
  {
    String result = String.valueOf(ch);
    if (i < height && i >= 0)
      {
        for (int k = 0; k < width - 1; k++)
          result = result.concat(String.valueOf(ch)); //make a string as long as width of repeating ch
      } //if

    else
      throw new Exception("Invalid row " + i);

    return result;
  }

  public int height()
  {
    return height;
  }//height

  public int width()
  {

    return width;
  }//width

}//Grid
