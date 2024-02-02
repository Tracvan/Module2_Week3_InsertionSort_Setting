public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 8, 9, 12};
        System.out.println("Trước khi sắp xếp");
        for(int num : arr){
            System.out.print(num + ",");
        }
        insertSort(arr);
        System.out.println("");
        System.out.println("Sau khi sắp xếp");
        for(int num : arr){
            System.out.print(num + ",");
        }

    }
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
    }
}
