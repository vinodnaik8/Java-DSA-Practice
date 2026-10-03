package Arrays;

public class reverse_array {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int l=0;
        int r=arr.length-1;
        int temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
