

import java.util.*;

public class main {
    final public static int rowsBoard = 7;
    final public static int colBoard = 7;
    final public static int numCells = colBoard * rowsBoard;

    public static String[] myBored;

    static Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {


        int numCases = stdin.nextInt();

        // Go through each case.
        for (int loop=1; loop<=numCases; loop++) {

            // Read in board.
            myBored = new String[numCells];

            // Assign the values to the String array
            setBoard(myBored);
            System.out.println("===String Array===");
            for(int x = 0; x < numCells; x++)
            System.out.print(myBored[x] + " ");
            // Solve.
            boolean hasSolution = solve();

        }
    }

    public static boolean solve() {
        //If the input was a bad Board

        // Recursively solve.
        return solve(0);
    }

    private static void setBoard(String[] myBored) {
        int x = 0;
        for (int i = 0; i < 7; i++) {
            String temp = (stdin.next());
            for (int j = 0; j < 7; j++) {
                String tempValue = String.valueOf((temp.charAt(j)));
                myBored[x] = tempValue;
                x++;
            }
        }

    }

    public static boolean solve(int k) {
        //Done!
        if (k == numCells) return true;

        // Fixed square, go to next.
        if(!myBored[k].equals("."))return solve(k+1);

        //Try to place a bomb in this spot
        myBored[k] = "*";
        //if it doesn't break the board continue
        if(isValid(k)){


        }

        return true;
    }

    private static boolean isValid(int x) {
        //Rules to if its Valid
        // if the bottom right square surrounding a number




        return true;
    }
}