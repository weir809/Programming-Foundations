package StorageAlgortihm;

public class Main {
    // Array declared
    static int[] storageSpaces = {232, 241, 324, 216, 221, 298, 334, 212, 235, 324, 264, 141};

    // Main method
    public static void main(String[] args) {
        int max = MaxValue.maxValue(storageSpaces);
        System.out.println("The largest Storage Space is: " + max);
        printArray(storageSpaces);

        float avg = MeanValue.meanValue(storageSpaces);
        System.out.println("The Average Storage Space is: " + avg);
        printArray(storageSpaces);
    }

    // Separate method to print arrays
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


