import java.util.*;
public class transpose {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("take the base of the rowand col:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int matrix[][]=new int [rows][columns];
        System.out.println("enter the element in matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();

            }

        }
        System.out.println(" the transspose is:");
        for(int j=0;j<columns;j++){
            for(int i=0;i<rows;i++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
    }
    
}
