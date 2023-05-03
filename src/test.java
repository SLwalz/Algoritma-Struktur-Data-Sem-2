import java.util.Arrays;

public class test {
    
    public static void mergeSort(MyObject[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int mid = arr.length / 2;
        MyObject[] left = Arrays.copyOfRange(arr, 0, mid);
        MyObject[] right = Arrays.copyOfRange(arr, mid, arr.length);
        
        // Recursively sort left and right halves
        mergeSort(left);
        mergeSort(right);
        
        // Merge the two sorted halves
        merge(arr, left, right);
    }
    
    private static void merge(MyObject[] arr, MyObject[] left, MyObject[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i].data < right[j].data) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        MyObject[] arr = {new MyObject(3), new MyObject(1), new MyObject(4), new MyObject(2)};
        mergeSort(arr);
        for (MyObject obj : arr) {
            System.out.print(obj.data + " ");
        }
        // Output: 1 2 3 4
    }
}

class MyObject {
    public int data;
    
    public MyObject(int data) {
        this.data = data;
    }
}
