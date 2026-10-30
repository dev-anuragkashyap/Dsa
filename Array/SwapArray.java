import java.util.Arrays;
public class SwapArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array before swapping: ");
        System.out.println(Arrays.toString(arr));
        Swap(arr,0,4);
        System.out.println("Array after swapping: ");
        System.out.println(Arrays.toString(arr));
    
    }
    public static void Swap(int[]arr,int index0,int index1){
        int temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;
    }
}
