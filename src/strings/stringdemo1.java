package strings;

/**
 * Created by sourabh.jain on 26/06/16.
 */
public class stringdemo1 {

    public  static void main(String args[]){
        test();
    }

    public static void test(){
        char [] stringchars = { 'h', 'e', 'l', 'l', 'o', '.'};
        String createdString = new String(stringchars);
        System.out.println(createdString);
    }
}
