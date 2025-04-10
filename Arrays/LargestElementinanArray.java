import java.util.*;
public class LargestElementinanArray{
    public static void main(String args[]){
        int arr[] = {3, 3, 6, 1}; // output = 6
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array :" + max);
    }
}