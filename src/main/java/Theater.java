/** INSTRUCTIONS
 * A theater contains rows of seats with the same number of seats in each row. 
 * Some rows contain tier 1 seats and the remaining rows contain tier 2 seats. 
 * Tier 1 seats are in the front and tier 2 seats are in the back. All seats 
 * in a row share the same tier.
 * 
 * The Seat class represents seats in the theater. The boolean variable 
 * available is false if a ticket for the seat has been sold (the seat is no 
 * long available). The int variable tier indicates whether the seat is a tier 
 * 1 or tier 2 seat.
 * 
 * The theater class represents a theater of seats. The number of seats per row 
 * and the number of tier 1 and tier 2 rows are determined by the parameters of 
 * the Theater constructor. Row 0 of the theaterSeats 2D array represents the 
 * row closest to the stage (the front).
 * 
 * Write a constructor for the Theater class that takes three int parameters, 
 * representing the number of seats per row, the number of tier 1 rows, and 
 * the number of tier 2 rows, respectively. The constructor initializes the 
 * theaterSeats member variable so that it has the given number of seats per 
 * row and the given number of tier 1 and tier 2 rows and all the seats are 
 * available and have the appropraite tier designation.
 * 
 * Remember, row 0 of the theaterSeats array represents the row closest to the 
 * stage. All tier 1 seats are closer to the stage than tier 2 seats.
 * 
 * Write the method reassignSeats, which attempts to move a person from a source 
 * seat to a destination seat. The reassignment can be made if the destination 
 * seat is available and has the same or greater tier than the source seat. For 
 * example, a person in a tier 1 seat can be moved to a different tier 1 seat 
 * or to a tier 2 seat, but a person in a tier 2 seat can only be moved to a 
 * different tier 2 seat.
 * 
 * The reassignSeat method has four int parameters representing the row and the 
 * column indexes of the source ("from") and destination ("to") seats. If the 
 * reassignment is possible, the source serat becomes available, the destination 
 * seat becomes unavailable, and the method returns true. If the seat 
 * reassignment is not possible, no changes are made to either seat and the 
 * method returns false. Assume that the source seat is occupied when the method 
 * is called.
 * 
 * Write the method print, which prints out the 2D array theaterSeats.
 * The format for the print function should begin with a 1 or 2 depending on 
 * the tier and an 'O' or 'X' if it is available or unavailable, respectively.
 * 
 * EXAMPLE:
 * theaterSeats has 5 seats in each row and has two tier 1 rows and 3 tier 2 rows.
 * 1 O X X O X
 * 1 X X O X X
 * 2 X O O X O
 * 2 O X X O O
 * 2 X X X X O
 */

package main.java;

public class Theater {
    private Seat[][] theaterSeats;

    /** COMPLETE THIS CONSTRUCTOR
     * Constructs a Theater object, as described in the instructions
     * Precondition: seatsPerRow > 0; tier1Rows > 0; tier2Rows >= 0
     */
    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows) {
        // Insert your code below


    }

    /** Helper method for testing purposes. Assign a seat for a person.
     * @param row is the selected row
     * @param col is the selected column
     * @return true if seat assigning is possible, false otherwise
     */
    public boolean assignSeat(int row, int col) {
        if (row < theaterSeats.length && col < theaterSeats[0].length &&
            theaterSeats[row][col].isAvailable()) {
            theaterSeats[row][col].setAvailability(false);
        }
        return false;
    }

    /** COMPLETE THIS METHOD
     * return true if a seat holder was reassigned from the seat at fromRow, 
     * fromCol to the seat at toRow, toCol; otherwise it returns false, as 
     * described in the instructions.
     * Preconditions: fromRow, fromCol, toRow, and toCol represent valid row 
     *                and column positions in the theater.
     *                The seat at fromRow, fromCol is not available.
     */
    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol) {
        // Insert your code below

        return false;
    }

    /** COMPLETE THIS METHOD
     * Prints out the array of theaterSeats as described in the instructions.
     */
    public void print() {
        // Insert your code below


    }
}
