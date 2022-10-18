import java.util.*;

class rotateArr{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N;
        int K;
        for(int i = 0; i < T; i++){
            N = sc.nextInt();
            K = sc.nextInt();
            int arr[] = new int[N];
            for(int j = 0; j < N; j++){
                arr[j] = sc.nextInt();
            }
            rotate(arr,N,K);
        }
    }

    public static void rotate(int arr[], int N, int K){
        for(int i = 0; i < K; i++){
            int temp = arr[N-1];
            for(int j = N-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }

        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}