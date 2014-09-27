package main;

public class Main {

	// public static void main(String[] args) {
	// // output : 11,
	// // test : 5, {0,2,7,3,4,5}
	// int priceArray[] = { 0, 2, 7, 3, 4, 5 };
	// int output = 0;
	// int rodLen = 5;
	//
	// output = new Main().getMaxProfit(rodLen, output, priceArray);
	// System.out.println("Output : " + output);
	//
	// }

	public int getMaxProfit(int rodLen, int output, int[] priceArray) {
		// find max value
		int myLen = findMaxIndex(priceArray);
		if (myLen <= rodLen)
			output += priceArray[myLen];
		myLen += 1;
		if (myLen <= rodLen)
			output += priceArray[1];
		myLen += 1;
		if (myLen <= rodLen)
			output += priceArray[1];
		return output;
	}

	private int findMaxIndex(int[] priceArray) {
		int indexMax = 0;
		for (int i = 1; i < priceArray.length; i++) {
			int tempIndex = priceArray[i];
			if ((tempIndex > priceArray[indexMax])) {
				indexMax = i;
			}
		}
		return indexMax;
	}
}
