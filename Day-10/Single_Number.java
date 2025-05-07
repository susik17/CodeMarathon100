
import java.util.*;
 class Main {
    static int search(int n,int[] arr){
        int ans = arr[0];
        for(int i=1;i<=n-1;i++){
           ans = ans^arr[i];
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int n = 7;
        int arr[] ={2, 2, 5, 5, 20, 30, 30};
        System.out.println(search(n,arr));
    }
}
//op:20
