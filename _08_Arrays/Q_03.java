package _08_Arrays;

import java.util.Arrays;

public class Q_03 {

	public static void main(String[] args) {
		 //bir int Array elemanlarinin i�aretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
        
		int arr[]= {1,2,-3,4,-5,-6};
		
         
       System.out.println(Arrays.toString(sayininTersi(arr)));
	}

	public static int[] sayininTersi(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;

        }
        return arr;

	}

	




}
