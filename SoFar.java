
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
            System.out.println("===String Array===" + myBored.length);
            for(int x = 0; x < numCells; x++)
            System.out.print(myBored[x] + " ");
            // Solve.
            boolean hasSolution = solve();

            if(hasSolution){
                print(true);
            }
            else
                print(false);

        }
    }
    //print output
    //DONE
    private static void print(boolean valid) {
        if(valid){
            System.out.println("\n");
            for(int x = 0; x < numCells; x++){
                System.out.print(myBored[x] + " ");
                if(x%7 == 6)
                    System.out.println("");
            }
        }
        else {
            System.out.println("No solution possible.");
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


    //NOT DONE HELPPPPP PLSSSSSSSSSSSSSSS
    public static boolean solve(int k) {
        //Done!
        if (k == numCells) return true;

        // Fixed square, go to next.
        if(!myBored[k].equals("."))return solve(k+1);


        //if point is not near number just continue to the next index
        if(!NearNumber(k)){
            return solve(k+1);
        }

        //Places a bomb on the testing location
        //myBored[k] = "*";
        //if it doesn't break the current board continue
        if(NearNumber(k)){
            if(isValid(k)){
                //recursive calling  for next iteration
                boolean branch = solve(k+1);
                if(branch) return true;

            }
        }


        //Nothing Worked so Return False
        return false;
    }

    public static boolean isValid(int x) {
        //Rules to if its Valid
        //Checking if the new inputted value is next to a number

        //Checking if new input is valid for the number
        if(ValidSpot(x)){

        }

        return true;
    }

    public static boolean ValidSpot(int x) {

        return true;
    }


    //Done
    public static boolean NearNumber(int x) {
        if(x+6 < numCells){
            if((!myBored[x+6].equals("."))&& (x+8)% 7 != 1){
                //myBored[x] = "*";
                return true;
            }
        }
        if(x+7 < numCells){
            if((!myBored[x+7].equals("."))){
                //myBored[x] = "*";
                return true;
            }
        }
        if(x+8 < numCells){
            if((!myBored[x+8].equals(".")) && (x+8)% 7 != 0){
                //myBored[x] = "*";
                return true;
            }
        }
        if(x+1 < numCells){
            if((!myBored[x+1].equals("."))&& (x+1)% 7 != 0){
                //myBored[x] = "*";
                return true;
            }
        }
        if(x-1 < numCells && x != 0){
            if((!myBored[x-1].equals(".")) && !myBored[x-1].equals("*") && (x+1)% 7 != 1 ){
                //myBored[x] = "*";
                return true;
            }
        }
        if(x-7 < numCells && x >= 7){
            if((!myBored[x-7].equals(".")) && !myBored[x-7].equals("*")){
                //myBored[x] = "*";
                return true;
            }
        }
        if(x-6 < numCells && x >= 6){
            if((!myBored[x-6].equals(".")) && !myBored[x-6].equals("*")){
                //myBored[x] = "*";
                return true;
            }
        }
        if(x-8 < numCells && x > 8){
            if((!myBored[x-8].equals(".")) && !myBored[x-8].equals("*") && (x+8)% 7 != 1 ){
                //myBored[x] = "*";
                return true;
            }
        }
        return false;
    }


}
