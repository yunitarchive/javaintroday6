import java.util.Arrays;

public class Main {
    public static void  main (String[] args){
        //No. 1
        int[] userRotate =  getRotateByIndex();
        System.out.println("The array rotate result : " + Arrays.toString(userRotate));
        // No.2
        System.out.println( "We found the numbers you enter is " + ArrayManipulation.findDuplicateInt()  + " to have duplicate value");
        // No.5
        System.out.println( "Here is the reverse character, you have entered :  " + ArrayManipulation.getTextReverse());
    }
}
