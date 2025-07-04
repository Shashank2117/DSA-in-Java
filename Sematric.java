
import java.util.Scanner;

public class Sematric {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter column");
        int col = sc.nextInt();

        int [][]arr = new int[row][col];

        System.out.println("Enter elements");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // check metrix is semmetrix or not

        boolean sym = true;
        if(row == col){
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if (arr[i][j] != arr[j][i]) {
                        sym = false;
                    }
                }
            }
            if(sym){
                System.out.println("Symetric Metrix");
            }else{
                System.out.println("Not a symetric");
            }
        }else{
            System.out.println("Noooooo");

        }


    }
}
