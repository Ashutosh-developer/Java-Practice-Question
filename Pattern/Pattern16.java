import java.util.*;

public class Pattern16 {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}