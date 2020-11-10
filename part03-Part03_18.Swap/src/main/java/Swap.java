    
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap: ");
        Scanner scanner = new Scanner(System.in);
        int indice1 = Integer.valueOf(scanner.nextLine());
        int indice2 = Integer.valueOf(scanner.nextLine());
        if (indice1 < 0 || indice1 >= array.length || indice2 < 0 || indice2 >= array.length) {
            System.out.println("Error, indices needs to be from 0 to " + (array.length -1));
        }
        int helper = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = helper;

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
