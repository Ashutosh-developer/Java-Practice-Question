public class palinArray {

    public static void main(String args[]){
    int a[] = {222,333,555,777};
    int n= a.length;
    palinArray(a,n);
    }

    public static int palinArray(int[] a, int n){
                  //add code here.
        for(int i=0; i<n; i++){
            for(int j=0; j<a.length - 1; j++){
                if(a[j] == a[j+1]){
                    System.out.println(1);
                }            
            }
        }
        return 0;          
    }
}
