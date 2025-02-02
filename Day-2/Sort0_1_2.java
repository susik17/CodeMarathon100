import java.util.Scanner;
class Main {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
        
    }
    static int[] Sort012(int[] arr){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        Sort012(arr);
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
/*
ip:
6
0 2 1 2 1 0
op:
0 0 1 1 2 2 
*/