import java.util.Arrays;
public class InsertionS {
    public static void main(String[] args) {
        int arr[]={2,5,4,9,1};
        ins(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ins(int[]arr){
        for(int i=0;i<= arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int [] arr, int s,int j){
        int temp=arr[j];
        arr[j]=arr[s];
        arr[s]=temp;
    }
}
