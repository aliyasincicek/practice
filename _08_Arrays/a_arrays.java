package _08_Arrays;

public class a_arrays {

	public static void main(String[] args) {
		/*  Array�ler object�tir. Bu yuzden
	    - Heap Memory�de depolanirlar.
	    - Value ile birlikte method�lara da sahiptirler - runtime�da olusturulurlar.
	    Bir Array nasil declare edilir?
	     Array olusturmak icin iki yol vardir :
	    - int myArray[ ] ; Bu daha cok kullanilir
	    - int [ ] myArray;

	    Bir Array nasil olusturulur..
	    int myArray[ ] = new int[6];
	    - Yukaridaki kod length�i 6 olan bir array olusturur.
	    - Biz array�e eleman eklemezsek Java elemanlar icin data type�ina uygun
	    default degerler atar.
	    Eger yukaridaki array�i yazdirirsaniz ekranda {0, 0, 0, 0, 0, 0} gorursunuz
	    Not: Array olustururken length�i yazmazsaniz compile time error alirsiniz.

	    Array�e deger nasil atanir...
	    int myArray[] = new int[3];
	    myArray[0] = 9;
	    myArray[1] = 10;
	    myArray[2] = 11;
	    Veya
	    int myArray[] = {9, 10, 11};

	    Array�in elemanlarina nasil ulasilir ve nasil update edilir ?
	    int myArray[] = {9, 10, 11};
	    Array elemanlarina index�ler kullanilarak ulasilir.
	    myArray[0] ==> 9,
	    myArray[1] ==> 10,
	    myArray[2] ==> 11,
	    NOT 1 : �n� array�in length�i olmak uzere myArray[n-1] son elemani gosterir
	    NOT 2 : Bir Array�de olmayan index�i kullanmak isterseniz �ArraysIndexOutOfBoundsException� hatas� alirsiniz.

	     Multi Dimesional Array :
	    Deger Atama -->int arr[][] = { {1, 2}, {3}, {4, 5, 6, 7}, {8, 9} };
	    yazd�rma-->System.out.println(Arrays.deepToString(arr));

	    Bir Array�in uzunlugu nasil bulunur?
	    int myArray[] = {9, 10, 11}; --> int size = myArray.length;
	    NOT : String ve Array icin length method�larinda dikkatli olmak gerekir.
	    Strings ==> length()
	    Arrays ==> length

	    Bir Array�in tum eleamanlari nasil yazdirilir?
	    int myArray[] = {9, 10, 11};
	    A) for(int i=0; i<size; i++) {
	    System.out.println(myArray[i]);}
	    B) System.out.println(Arrays.toString(myArray));

	    Bir Array�in tum elemanlari nasil siralanir?
	    int myArray[] = {9, 15, 11}; 
	    Arrays. sort (myArray);
	    Siralama buyukten kucuge nasil yapilir ?
	    - Once sort methodu kullanilir
	    - Sonra siralamayi ters cevirmek icin loop kullanilir

	    Bir Array�de istenen bir elemanin varligi nasil kontrol edilir?
	    binarySearch() methodu belli bir elemanin bir array�de olup olmadigini kontrol etmek icin kullanilir.
	    Not: binarySearch() methodunu kullanmadan once mutlaka sort() methodu kullanilmalidir.
	    int[ ] numbers = { 2, 4, 6, 8 };
	    System.out. printin (Arrays. binarySearch(numbers, 2)); =======> 0.index
	    System.out. printin (Arrays. binarySearch(numbers, 4)); =======> 1.index

	    Not: Eger bir eleman array�de yoksa output negatif olur.
	    1) O eleman var olsaydi sira numarasi ka� olurdu, bulunuz.
	    2) Sira numarasinin negatif degeri binarySearch() outputu olur
	    System.out.println(Arrays.binarySearch(numbers, 1)); =======> -1
	    System.out.println(Arrays.binarySearch(numbers, 3)); =======> -2
	    System.out.println(Arrays.binarySearch(numbers, 9)); =======> -5

	    Iki array�in esit olup olmadigi nasil kontrol edilir?
	    equals() method�u degerleri ve indexleri birlirkte kontrol edip, boolean bir deger return eder.

	    Bir String nasil array�e cevrilir ?
	    split() method�u String�e ait bir method�dur ve belirledigimiz ayirac�_09_Arrays.Q18 gore String�i parcalara ayirip bir Array�e cevirir.
   */
	}

}
