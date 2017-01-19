/*
 * COPYRIGHT
 */
package edu.snu.csne.csne2543.elementary;

/**
 * Datatype
 *
 * Elementary examples of Java's primitive numerical datatypes
 *
 * @author Brent Eskridge
 * @version $Revision$ ($Author$)
 */
public class NumericalDatatype
{
    public static void main( String[] args )
    {
        // Create some basic numeric variables
        int years = 42;
        long milliseconds = 123456789L;
        double area = 6.25;
        float half = 0.5f;

        // Be careful of floating-point arithmetic
        double result = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println( "result=[" + result + "] != [0.5]" );

        // Widening casts are automatic
        int smallValueInt = 55;
        long smallValueLong = smallValueInt;
        
        // Narrowing casts must be cast
        long bigValueLong = 123456789L;
        int bigValueInt = (int) bigValueLong;
        double bigFractionDouble = 1.55555;
        float bigFractionFloat = (float) bigFractionDouble;
        
        // Arithmetic results in the same type
        int divisionInt = 4 / 3;
        System.out.println( "Integer division: [" + divisionInt + "]" );
        float divisionFloat = 4 / (float) 3;
        System.out.println( "Float division:   [" + divisionFloat + "]" );
    }

}
