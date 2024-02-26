package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 4, 3, 8, 7, 6};
        InsertionSort is = new InsertionSort();
        a = is.insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    int[] insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            // compare key with each element standing in front of it
            // if key < ele, move ele backward 1 unit
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                j--;
            }

            // if key > ele or j < 0, put key into the empty space between moved ele and cur ele
            // for ex, if loop over all eles before key, j will be -1
            // then j + 1 = 0 means the key will be put into first place
            a[j + 1] = key;
        }
        return a;
    }
}
