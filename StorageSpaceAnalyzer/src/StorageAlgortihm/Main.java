package StorageAlgorithm;

public class Main {
    // Array declared
    static int[] storageSpaces = {232, 241, 324, 216, 221, 298, 334, 212, 235, 324, 264, 141};

    // Main method
    public static void main(String[] args) {
        int max = MaxValue.maxValue(storageSpaces);
        float avg = MeanValue.meanValue(storageSpaces);
        int sum = MeanValue.totalSpace(storageSpaces);
        printArray(storageSpaces);
        System.out.println("The largest Storage Space is: " + max);
        System.out.println("The Average Storage Space is: " + avg);
        System.out.println("There are " +storageSpaces.length+ " files in this array.");
        System.out.println("The total storage is: " + sum);
        
    }

    // Separate method to print arrays
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



