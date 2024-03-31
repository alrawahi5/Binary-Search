import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Integer size = 0;
        System.out.println("Enter the size of the array: ");
        size = scanner.nextInt();
        Integer[] array = new Integer[size];
        System.out.println("Enter your numbers, clicking 'enter' after each entred number: ");

        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("You Entered: " + Arrays.toString(array));
        System.out.println("Choose the number you want to know about its index: ");
        Integer choose = scanner.nextInt();
        Arrays.sort(array);
        System.out.println("Your sorted array: " + Arrays.toString(array));

        for(int i = 0; i<size; i++){
            if(array[i] == choose){
                System.out.println("The Index of " + choose + " is: " + Arrays.binarySearch(array, array[i]));
            }
        }
    }
}
