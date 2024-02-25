package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {7, 1, 2, 6, 4, 3, 8, 5};
        SelectionSort ss = new SelectionSort();
        a = ss.selectionSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    int[] selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j=i+1; j<n; j++){
                if (a[min_idx] > a[j]){
                    min_idx = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
        return a;
    }
}
