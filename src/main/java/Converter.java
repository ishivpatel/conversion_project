import java.util.Random;

/*
*
* Shiv Patel, Sept 2017
*/
public class Converter
{
    //Value of Int
    static double value;
    //Conversion Rate cm to inches
    static final double RATE = 0.393701;
    //Get random integer
    static Random rnd = new Random();

    public static void main(String args[]){

        value = rnd.nextInt(500);
        System.out.println("converting " + value + " to inches");
        System.out.println( value + "cm = " + value * RATE + " Inches");
    }
}
