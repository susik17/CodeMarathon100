import java.util.Scanner;
class Matrix{
    //space optimize code
    static void BooleanMatrix(int[][] matrix,int r,int c){
         //Mark matrix using 1st row &colum
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][0] = 1; // Mark the first column of this row
                    matrix[0][j] = 1; // Mark the first row of this column
                }
            }
        }
        //update matrix based on marks in 1st row & col
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][0] == 1 || matrix[0][j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        //update 1st row 
        if(matrix[0][0]==1){
            for(int j=0;j<c;j++){
                matrix[0][j]=1;
            }
        }
        //update 1st col
        if(matrix[0][0]==1){
            for(int i=0;i<r;i++){
                matrix[i][0]=1;
            }
        }
         
    }
    /*
    //brute force
    static void BooleanMatrix(int[][]matrix,int r,int c){
        int[] rowMarker = new int[r];
        int[] colMarker =new int[c];
        //mark row and column has 1
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    rowMarker[i]=1;
                    colMarker[j]=1;
                }
            }
        }
        //update rows
        //traverse through rowMarker Array
        for(int i=0;i<r;i++){
            if(rowMarker[i]==1){
                //traverse through columns due to update same row column will change
                for(int j=0;j<c;j++){
                    matrix[i][j]=1;
                }
            }
        }
        //update columns
        //traverse through columMarker Array
        for(int i=0;i<c;i++){
            if(colMarker[i]==1){
                //traverse through rows due to update same column row will change
                for(int j=0;j<r;j++){
                    matrix[j][i]=1;
                }
            }
        }
    }
    */

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        BooleanMatrix(matrix,m,n);
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
         }
        
    }
}
/*
ip:
3 4
1 0 0 1
0 0 1 0
0 0 0 0
op:
1 1 1 1 
1 1 1 1 
1 0 1 1 
*/
