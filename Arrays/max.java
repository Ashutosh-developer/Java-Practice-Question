import java.util.*;
    
public class max{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int x = 3;

        showArr(findLesser(arr,n,x));;

        // Arrays.sort(arr);
        // showArr(arr, n);
        // // updatearr(arr, n);
        // // showArr(arr, n);
    }
    
    public static int[] findLesser(int arr[], int n, int x){
        int arr2[] = new int[2];
        arr2[0] = 0;
        for(int i = 0; i < n; i++){
            if(i <= x){
                arr2[0] = i;
            }
        }
        arr2[1] = n;
        return arr2;
    }


    public static void showArr(int arr2[]){
        int n = arr2.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    
    // public static void updatearr(int arr [], int n){
    //     for(int i = 0; i < n; i++){
    //         if (arr[i]==2){  
    //             arr[i] = 0 ;
    //         }
    //     }
    //     showArr(arr, n);
    // }
}