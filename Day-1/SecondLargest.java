import java.util.*;
class SecondLargest{
    static int secondLargestElement(int[] arr, int n) {
        int max=arr[0];
        int secondlargest=-1;//can replace with INT_MIN function
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                secondlargest=max;
                max=arr[i];
            }
            if((arr[i]<max)&&(arr[i]>secondlargest)){
                secondlargest=arr[i];
            }
        
        }
        return secondlargest;
     }
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int slarge=secondLargestElement(arr,n);
        System.out.print(slarge);
        
    }
}