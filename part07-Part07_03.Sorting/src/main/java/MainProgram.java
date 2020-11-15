
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println(smallest(array));
        System.out.println(indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 2));
        swap(array, 1, 4);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }
    
    

    public static int smallest(int[] array) {
        int smallest = array[0];        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}