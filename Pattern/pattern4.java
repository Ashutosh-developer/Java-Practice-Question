import java.util.*;
public class pattern4{
	public static void main(String args[]){
		printH(4);
	}

	public static void printH(int row){
		int col = 4;
		int hl = row/2;
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= col; j++){
				if(j == 1 || j == row || i == hl){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}