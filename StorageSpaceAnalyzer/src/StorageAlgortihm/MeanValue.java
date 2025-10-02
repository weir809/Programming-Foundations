package StorageAlgortihm;


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
}