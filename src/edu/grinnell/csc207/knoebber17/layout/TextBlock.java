package edu.grinnell.csc207.knoebber17.layout;

public interface TextBlock
{
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   * 
   * @pre i < this.height()
   * @exception Exception
   *              if the row number is invalid.
   */
  public String row(int i)
    throws Exception;

  /**
   * Determine how many rows are in the block.
   */
  public int height();

  /**
   * Determine how many columns are in the block.
   */
  public int width();

} // interface TextBlock
