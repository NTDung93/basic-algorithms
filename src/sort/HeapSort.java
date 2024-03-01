package sort;

public class HeapSort {
        public void sort(int[] arr)
        {
            int N=arr.length;

            for(int i=N/2-1;i>=0;i--)
            {
                heapify(arr,N,i);
            }

            for(int i=N-1;i>0;i--)
            {
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;

                heapify(arr,i,0);
            }


        }
        public static void heapify(int[] arr,int N,int i)
        {
            int largest = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left < N && arr[left] > arr[largest])
                largest = left;

            if(right < N && arr[right] > arr[largest])
                largest = right;

            if(largest != i)
            {
                int temp = arr[largest];
                arr[largest] = arr[i];
                arr[i] = temp;

                heapify(arr,N,largest);
            }

        }

        public static void main(String[] args) {
            int[] arr={1,12,9,5,6,10};
            HeapSort hsa = new HeapSort();
            hsa.sort(arr);

            System.out.println("Sorted Array is");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
}
