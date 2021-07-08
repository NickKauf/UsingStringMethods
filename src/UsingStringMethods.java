import java.util.Scanner;

public class UsingStringMethods {
    public static void main( String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("enter a word: ");
        String word = kb.nextLine();
        System.out.println("enter a number as an index: ");
        int index = kb.nextInt();
        if (index >= word.length()) {
            System.out.println("Index is larger than length");
        }
        else {
            System.out.printf("the length of %s is %d \n", word,word.length());
            System.out.printf("the substring from 0 to %d is " + word.substring(0,index),index);
        }


    }
}
