public class LinearSearch {
    public static void main (String[]args){
        int arr[]={1,2,3,4,5,45,23,56,12,34,56,78,90};
        int target=56;
        int ans=linearsearch(arr,target);
        System.out.println(ans);

    }
     static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if (arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
