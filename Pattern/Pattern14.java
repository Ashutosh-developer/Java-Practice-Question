public class Pattern14 {
    public static void main(String[] args) {
        int  n = 4;

        for(int i = 1; i <= n; i++){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for(int j = 2; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n-1; i >= 1; i--){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for(int j = 2; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
