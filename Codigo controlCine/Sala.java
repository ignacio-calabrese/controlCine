
import java.util.*;


/**
 * Class Sala
 */
public class Sala {

  //
  // Fields
  //

  protected int roomNumber = 0;
  protected String movieName;
  protected int seatsBought = 0;
  protected int totalSeats = 0;
  protected int availability = 0;
  
  //
  // Constructors
  //
  public Sala () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of roomNumber
   * @param newVar the new value of roomNumber
   */
  protected void setRoomNumber (int newVar) {
    roomNumber = newVar;
  }

  /**
   * Get the value of roomNumber
   * @return the value of roomNumber
   */
  protected int getRoomNumber () {
    return roomNumber;
  }

  /**
   * Set the value of movieName
   * @param newVar the new value of movieName
   */
  protected void setMovieName (String newVar) {
    movieName = newVar;
  }

  /**
   * Get the value of movieName
   * @return the value of movieName
   */
  protected String getMovieName () {
    return movieName;
  }

  /**
   * Set the value of seatsBought
   * @param newVar the new value of seatsBought
   */
  protected void setSeatsBought (int newVar) {
    seatsBought = newVar;
  }

  /**
   * Get the value of seatsBought
   * @return the value of seatsBought
   */
  protected int getSeatsBought () {
    return seatsBought;
  }

  /**
   * Set the value of totalSeats
   * @param newVar the new value of totalSeats
   */
  protected void setTotalSeats (int newVar) {
    totalSeats = newVar;
  }

  /**
   * Get the value of totalSeats
   * @return the value of totalSeats
   */
  protected int getTotalSeats () {
    return totalSeats;
  }

  /**
   * Set the value of availability
   * @param newVar the new value of availability
   */
  protected void setAvailability (int newVar) {
    availability = newVar;
  }

  /**
   * Get the value of availability
   * @return the value of availability
   */
  protected int getAvailability () {
    return availability;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   * @param        roomNumber
   */
  abstract public String insert_roomNumber(int roomNumber = 0);


  /**
   * @return       String
   * @param        movieName
   */
  public String insert_movieName(String movieName)
  {
  }


}
