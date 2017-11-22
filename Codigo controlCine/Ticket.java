
import java.util.*;


/**
 * Class Ticket
 */
public class Ticket {

  //
  // Fields
  //

  protected float totalCost = 0;
  
  //
  // Constructors
  //
  public Ticket () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of totalCost
   * @param newVar the new value of totalCost
   */
  protected void setTotalCost (float newVar) {
    totalCost = newVar;
  }

  /**
   * Get the value of totalCost
   * @return the value of totalCost
   */
  protected float getTotalCost () {
    return totalCost;
  }

  //
  // Other methods
  //

  /**
   * @return       int
   * @param        roomNumber
   */
  public int show_roomNumber(int roomNumber = 0)
  {
  }


  /**
   * @return       String
   * @param        movieName
   */
  public String show_movieName(String movieName)
  {
  }


  /**
   * @return       float
   * @param        movieCost
   */
  public float show_movieCost(float movieCost = 0)
  {
  }


  /**
   * @return       int
   * @param        seatsBought
   * @param        roomNumber
   * @param        availability
   * @param        totalSeats
   */
  public int show_seatsBought(int seatsBought = 0, int roomNumber = 0, int availability = 0, int totalSeats = 0)
  {
  }


  /**
   * @return       float
   * @param        movieCost
   * @param        show_seatsBought
   * @param        totalCost
   */
  public float totaĺTicket(float movieCost = 0, int show_seatsBought = 0, Float totalCost = 0)
  {
  }


}
