/**********************************************************************
 * NAME: PDIMath.java
 * AUTHOR: Connor Kuljis 19459138
 * UNIT: PDI SEM 1 2020
 * PURPOSE: provides static methods to be used for math in PDI
 **********************************************************************/
import java.util.*;
public class PDIMath
{
    public static int min(int a, int b)
    {
        int min = 0;
        if(a > b)
        {
            min = b;
        }
        if(b > a)
        {
            min = a;
        }
        return min;
    }

    public static double min(double a, double b)
    {
        double min = 0;
        if(a > b)
        {
            min = b;
        }
        if(b > a)
        {
            min = a;
        }
        return min;
    }

    public static long min(long a, long b)
    {
        long min = 0;
        if(a > b)
        {
            min = b;
        }
        if(b > a)
        {
            min = a;
        }
        return min;
    }

    public static float min(float a, float b)
    {
        float min = 0;
        if(a > b)
        {
            min = b;
        }
        if(b > a)
        {
            min = a;
        }
        return min;
    }
    
    // MAX ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    public static int max(int a, int b)
    {
        int max = 0;
        if(a < b)
        {
            max = b;
        }
        if(b < a)
        {
            max = a;
        }
        return max;
    }

    public static double max(double a, double b)
    {
        double max = 0;
        if(a < b)
        {
            max = b;
        }
        if(b < a)
        {
            max = a;
        }
        return max;
    }

    public static long max(long a, long b)
    {
        long max = 0;
        if(a < b)
        {
            max = b;
        }
        if(b < a)
        {
            max = a;
        }
        return max;
    }

    public static float max(float a, float b)
    {
        float max = 0;
        if(a < b)
        {
            max = b;
        }
        if(b < a)
        {
            max = a;
        }
        return max;
    }

    // ABSOLUTE VALUE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static int abs(int a)
    {
        if(a < 0)
        {
            a = -a;
        }
        return a;
    }

    public static double abs(double a)
    {
        if(a < 0)
        {
            a = -a; 
        }
        return a;
    }

    public static long abs(long a)
    {
        if(a < 0)
        {
            a = -a; 
        }
        return a;
    }

    public static float abs(float a)
    {
        if(a < 0)
        {
            a = -a; 
        }
        return a;
    }

    // FLOOR ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static int floor(double a) // first integer to the left
    {
        // eg 1.9 returns 1
        int result = 0;

        if(a > 0)
        {
            result = (int)(a); // convert to int to round off decimals
        }
        if (a < 0)
        {
            result = (int)(a) - 1; // convert to int and subtract one (to left)
        }
        return result;
    }

    // CEILING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static int ceil(double a) // first integer to the right
    {
        // eg 0.8 returns 1
        // eg -0.8 returns 0
        int result =0;

        if (a > 0)
        {
            result = (int)(a) + 1; // convert to int and add one
        }
        if (a < 0)
        {
            result = (int)(a); // convert to int to round off decimals
        }
        return result;
    }

    public static double pow(double base, int exponent)
    {
        // returns the first argument raised to the exponent
        // eg 3^4 = 3*3*3*3
        double result = 1;
        for(int i=0; i < exponent; i++)
        {
            result = base * result;
        }
        return result;
    }

    public static double pi(int precision)
    {
        double pi = 0.0;
        double theta = 95.5;
        double radians = Math.toRadians(theta);

        for(int i=0; i < precision; i++)
        {
            double nume = Math.sin(radians * ((2 * i) + 1));
            double denom = (2 * i) + 1;
            double eq = (nume / denom) * 4;
            pi = pi + eq;
        }
        return pi;
    }

    public static double e(int precision)
    {
        double e = 1.0;
        double factorial = 1.0;

        for(int i=1; i <= precision; i++)
        {
            factorial = factorial * i;
            e = e + (1.0 / factorial);
        }
        return e;
    }

    // calculates the average value in a real array
    public static double average(double[] realArray)
    { 
        double average;
        double total = 0;
        int numElements = realArray.length;

        for(int i=0; i < realArray.length; i++)
        {
            total += realArray[i];
        }

        return total / numElements;
    }
}
