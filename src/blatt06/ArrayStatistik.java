package blatt06;
import java. util. Arrays;
public class ArrayStatistik {
	public static void main(String[] args) {
		int[] arr = {35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40, 67,
				 66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51};
		ArrayStatistik t = new ArrayStatistik();
		t.getMittelWert(arr);
		t.getMaximalerWert(arr);
		t.getMinimalerWert(arr);
		t.getMedian(arr);

	}
	 private void getMittelWert (int[] arr) {
		int mittelWert;
		int summe = 0;
		for (int i = 0; i< arr.length; i++) {
			summe += arr[i];
		}
		mittelWert = summe / arr.length;
		System.out.println("Arithmetischer Mittelpunkt ist " + mittelWert);
		}
	 private void getMaximalerWert(int[] arr) {
		 int maxWert = arr[0];
		 for(int i = 0; i < arr.length;i++) {
			 if(maxWert < arr[i]) {
				 maxWert = arr[i];
			 }
		 }
		 System.out.println("Der maximale Wert ist " + maxWert);
	 }
	 private void getMinimalerWert(int[] arr) {
		 int minWert = arr[0];
		 for(int i = 0; i < arr.length;i++) {
			 if(arr[i] < minWert) {
				 minWert = arr[i]; 
				 
			 }
		 }
		 System.out.println("Der minimale Wert ist " + minWert);
	 }
	 private void getMedian (int[] arr) {
		 Arrays.sort(arr);
		 double median;
		 if ((arr.length) % 2 == 1) {
			 median = arr[(arr.length / 2)];
			 System.out.println("Das Median ist " + median );
		 } else {
			
			 int x = arr[(int) ((arr.length / 2) - 1)];
			 int y = arr[(int) (arr.length / 2)];
			 median = (x+y)/2;
			 System.out.println("Das Median ist "+ median);
		 }
		 
	 }
	 
	
}
