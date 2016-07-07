package strings;
import java.util.Scanner;


/**
 * Created by sourabh.jain on 26/06/16.
 */
public class stringdemo {

    public  static void main(String args[]){
        pyramid1();
    }

    public static void test(){
        char [] stringchars = { 'h', 'e', 'l', 'l', 'o', '.'};
        String createdString = new String(stringchars);
        System.out.println(createdString);
        System.out.println("Length of string="+createdString.length());
        float floatVar= 1;
        int intVar =2;
        String stringVar = "3";
        String fs;
        fs = String.format("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);
        System.out.println(fs);
    }
    public static void pyramids(){
        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    public static void pyramid1(){
        System.out.println("The Pattern is");
        int row,temp,c,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int size = n; //use only odd numbers here
        for (int i = 1; i <= size; i=i+2) {
            int spaceCount = (size - i)/2;
            for(int j = 0; j< size; j++) {
                if(j < spaceCount || j >= (size - spaceCount)) {
                    System.out.print(" ");
                } else {
                    System.out.print("$");
                }
            }
            System.out.println();
        }
    }
}
