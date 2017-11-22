
import java.util.*;


/**
 * Class Cinema
 */
public class Cinema {

  //
  // Fields
  //

  protected float movieCost = 0;
  private float profit = 0;
  
  //
  // Constructors
  //
  public Cinema () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of movieCost
   * @param newVar the new value of movieCost
   */
  protected void setMovieCost (float newVar) {
    movieCost = newVar;
  }

  /**
   * Get the value of movieCost
   * @return the value of movieCost
   */
  protected float getMovieCost () {
    return movieCost;
  }

  /**
   * Set the value of profit
   * @param newVar the new value of profit
   */
  private void setProfit (float newVar) {
    profit = newVar;
  }

  /**
   * Get the value of profit
   * @return the value of profit
   */
  private float getProfit () {
    return profit;
  }

  //
  // Other methods
  //

  /**
   * @return       int
   * @param        roomNumber
   * @param        seatsBought
   */
  public int room_seatsSold(int roomNumber = 0, int seatsBought = 0)
  {
  }


  /**
   * @return       int
   * @param        room_seatsSold
   * @param        roomNumber
   */
  public int seatsSold(int room_seatsSold = 0, int roomNumber = 0)
  {
  }


  /**
   * @return       float
   * @param        profit
   * @param        movieCost
   * @param        seatsSold
   */
  public float totalProfit(Float profit = 0, float movieCost = 0, int seatsSold = 0)
  {
  }


}
