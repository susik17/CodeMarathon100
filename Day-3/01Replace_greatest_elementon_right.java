import java.util.Scanner;
class Main {
    /* 
    //bruteforce - O(n^2)
    static int max(int[] arr,int j,int n){
        int max_no=arr[j];
        for(int k=j;k<=n;k++){
            if(arr[k]>max_no){
                max_no=arr[k];
            }
        }
        return max_no;
    }
    static int[] replace_greatest_right(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i+1;
            if(j>n-1){
                arr[i]=-1;
            }
            else{
            arr[i]=max(arr,j,n-1);
            }
            
        }
        return arr;
        
    }
    */
    //optimal O(n)
    //Traverse from right to left
    static int[] replace_greatest_right(int[] arr,int n){
        int max_right=arr[n-1];
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int current=arr[i];
            arr[i]=max_right;//replace
            max_right=Math.max(current,max_right);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        replace_greatest_right(arr,n);
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*
ip:
6
16 17 4 3 5 2
op:
17 5 5 5 2 -1 
*/


