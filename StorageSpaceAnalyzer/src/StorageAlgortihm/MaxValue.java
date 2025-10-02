package StorageAlgortihm;

public class MaxValue {
    // Method to find the maximum in an array
    static int maxValue(int[] arr) {
        
    	// Initialize maximum element
        int max = arr[0];

        // Traverse and compare elements to find the max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
