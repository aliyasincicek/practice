package _08_Arrays;

import java.util.Arrays;

public class Q_10 {

	public static void main(String[] args) {
		 /*  you have a string "GayetBasar�l�"
         * with arrays change it to "CoookBasar�l�" and write changing array
         *(String iniz: "GayetBasar�l�"  Diziyi "CoookBasar�l�" ye cevirin )
         *
         */
		
		    String str = "GayetBasar�l�";
	        str = str.replace("Gayet", "Cook");
	        String[] arr = new String[1];
	        arr[0] = str;
	        System.out.println(Arrays.toString(arr));
		

	}

}
