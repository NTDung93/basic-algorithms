package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 4, 1, 2, 8, 5, 6};

        BubbleSort bs = new BubbleSort();
        int[] sorted = bs.bubbleSort(a);

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    public int[] bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
