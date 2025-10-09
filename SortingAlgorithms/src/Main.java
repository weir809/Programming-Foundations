

public class Main {

    // Class-level array, accessible by all methods
    static int[] unsortedArray = {3, 6, 2, 7, 1, 4, 8, 5};

    //main method
    public static void main(String[] args) {

        BubbleSort.bubbleSort(unsortedArray);
        System.out.println("Sorted with Bubble Sort:");
        printArray(unsortedArray);

        SelectionSort.selectionSort(unsortedArray);
        System.out.println("Sorted with Selection Sort:");
        printArray(unsortedArray);

        InsertionSort.insertionSort(unsortedArray);
        System.out.println("Sorted with Insertion Sort:");
        printArray(unsortedArray);
    }

    //seperate method to print arrays
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
