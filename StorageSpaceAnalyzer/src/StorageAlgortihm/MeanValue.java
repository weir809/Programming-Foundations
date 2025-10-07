package StorageAlgorithm;


public class MeanValue {
    // Method to find the average in an array
    static float meanValue(int[] storageSpaces) {
        float sum = 0;

        // Loop through the elements of the array
        for (int storageSpace : storageSpaces) {
            sum += storageSpace;
        }

        // Calculate and return the average
        return sum / storageSpaces.length;
    }
   
    // Separate method to calculate total space used
    static int totalSpace(int[] storageSpaces) {
    	int sum = 0;
    	int i;
    	
    	// Loop through the array and store the sum in the sum variable
    	for (i = 0; i < storageSpaces.length; i++) {
    		sum += storageSpaces[i];
    	}
    	
    	return sum;
    }

}
