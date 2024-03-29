// FILE: Permutations.java
// AUTHOR: Connor Kuljis
// ID: 19459138
// UNIT: PDI
// COMMENTS: There is an integer overflow at n = 17
// LAST MOD: 26/04/2020
import java.util.*;
public class Permutations
{
    public static void main(String[] args)
    {

        int n = getInt("Enter the number of elements in the set (n), between 5 and 50 inclusive: ", 5, 50);
        int rMax = getInt("Enter the maximum number of elements that should be selected, between 2 and n inclusive:: ", 2, n);

        int[] populatedArray = populateArray(n, rMax);

        printArray(populatedArray);
    }


    /* NAME: populateArray
     * IMPORT: n, rmax
     * EXPORT: pmArray
     * PURPOSE: fills pmArray with permutations*/
    public static int[] populateArray(int n, int rMax)
    {
        int nFact = factorial(n); // calculating n! because this never changes;

        int[] pmArray = new int[rMax-1]; // initalising the array
        
        for(int i=0; i<pmArray.length; i++)
        {
            int r = 2 + i;
            pmArray[i] = nFact / (factorial(n-r));
        }

        return pmArray;
    }

    /* NAME: factorial
     * IMPORT: x
     * EXPORT: sum
     * PURPOSE: returns !x*/
    public static int factorial(int x)
    {
        int sum = 1;

        for(int i=1; i<=x; i++)
        {
            sum = sum * i;
        }
        return sum;
    }

    
    /* NAME: printArray
     * IMPORT: pArray
     * EXPORT: none
     * PURPOSE: prints an array*/
    public static void printArray(int[] pArray)
    {
        for(int i=0; i<pArray.length; i++)
        {
            System.out.print(pArray[i] + " ");
        }
    }

    /* NAME: getInt
     * IMPORT: msg, min, max
     * EXPORT: intValue
     * PURPOSE: validates integer input */
    public static int getInt(String msg, int min, int max)
    {
        Scanner sc = new Scanner(System.in);
        String newMsg, erMsg;
        int intValue;

        newMsg = msg;
        erMsg = "Error - must be between " + min + " and " + max + ". ";
        do
        {
            System.out.println(newMsg);
            intValue = sc.nextInt();
            newMsg = erMsg + msg;
        } while((intValue < min) || (intValue > max));
        return intValue;
    }
}
