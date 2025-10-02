public class SelectionSort {
    static void selectionSort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {

            int min_num = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_num])
                    min_num = j;
            }

            int temp = a[min_num];
            a[min_num] = a[i];
            a[i] = temp;
        }
    }
}
