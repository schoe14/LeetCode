/**
 * You are given coordinates, a string that represents the coordinates of a square of the chessboard.
 * Return true if the square is white, and false if the square is black.
 * The coordinate will always represent a valid chessboard square.
 * The coordinate will always have the letter first, and the number second.
 */
public class Solution {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) + coordinates.charAt(1)) % 2 != 0;
    }
}
