package _08_Arrays;

public class Q_04 {

	public static void main(String[] args) {
		 /*
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
		
		int[] arr= {5,7,-6,4,2,15,3,8,1};
		topla(arr);

	}

	private static void topla(int[] arr) {
		int istenenToplam=9;
   for (int i = 0; i < arr.length; i++) {
	   for (int j = i+1; j < arr.length; j++) {
		   if (arr[i]+arr[j]==istenenToplam) {
			 System.out.println("istenen toplama esit olan sayi ciftleri sunlardir :"+ arr[i] +" ile "+arr[j]);
}
		}
		
	}
		
	}
  
		
	}


