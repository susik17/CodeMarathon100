import java.util.Scanner;
class Main{
    //Brute force
    /*
    static int find_equllibrium_index(int[] arr,int n){
        int left_sum,right_sum;
        //traverse each element
        for(int curr=0;curr<=n-1;curr++){
            left_sum = 0;
            for(int left=0;left<curr;left++){
                left_sum += arr[left];
            }
            right_sum = 0;
            for(int right=curr+1;right<=n-1;right++){
                right_sum += arr[right];
            }
            if(left_sum == right_sum){
                return curr;
            }
        }
        return -1;
    }
    */
    //Better 
    static int find_equllibrium_index(int[] arr,int n){
        int left_sum = 0;
        int total_sum = 0;
        for(int i=0;i<=n-1;i++){
            total_sum += arr[i];
        }
        int right_sum = total_sum;
        for(int i=0;i<=n-1;i++){
            right_sum -=arr[i];
            if(left_sum == right_sum){
                return i;
            }
            left_sum+=arr[i];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int index = find_equllibrium_index(arr,n);
        System.out.println(index);
    }
}
/*
ip:
5
2 3 -1 8 4 
op:
3
*/
