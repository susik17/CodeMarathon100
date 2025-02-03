import java.util.Scanner;
class Main {
     static void BooleanMatrix(int[][] matrix,int m,int n){
         boolean firstRowHasOne =false;
         boolean firstColHasOne =false;
         //check 1st row and 1st column has one 
         for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 1) {
                firstRowHasOne = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 1) {
                firstColHasOne = true;
                break;
            }
        }
        //Mark matrix using 1st row &colum
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][0] = 1; // Mark the first column of this row
                    matrix[0][j] = 1; // Mark the first row of this column
                }
            }
        }
        //update matrix based on marks in 1st row & col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 1 || matrix[0][j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        //update 1st row & 1st column 
        if (firstRowHasOne) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 1;
            }
        }
        if (firstColHasOne) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 1;
            }
        }
         
    }
    /*
    //bruteforce -O(m*n)
    static void BooleanMatrix(int[][] matrix,int m,int n){
        boolean[] rows  = new boolean[m];
        boolean[] colums  = new boolean[n];
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    rows[i]=true;
                    colums[j]=true;
                    }
                }
            }
        
        
        //Update
        for(int i=0;i<m;i++){
           if(rows[i]){
               for(int j=0;j<n;j++){
                   matrix[i][j]=1;
               }
           }
        }
        for(int j=0;j<n;j++){
           if(colums[j]){
               for(int i=0;i<m;i++){
                   matrix[i][j]=1;
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