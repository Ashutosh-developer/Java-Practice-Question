public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i >= 0; i--){

            for(int j = i-1; j >= 0; j--){
                System.out.print(" ");
            }

            for(int j = n; j >= 0; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
