package assignment2;

public class Exercise6 {

	public static void main(String[] args) {
		// 6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
				System.out.println("");
				System.out.println("Exercise 6. Find the duplicates in an array");
				int[] numberList2 = { 12, 32, 12, 45, 65, 93, 0, 23, 45, 6, 32, 32, 5, 5, 5, 5 };
				duplicateValues = new int[numberList2.length];
				System.out.println("Counting the duplicates values");
				for (int m = 0; m < numberList2.length; m++) {
					int count = 0;
					for (int p = 0; p < numberList2.length; p++) {
						if (numberList2[m] == numberList2[p]) {
							count++;
							if (numberExists(numberList2[m])) {
								duplicateValues[m] = numberList2[m];
							}
						}
					}
					if (duplicateValues[m] != 0) {
						System.out.println(duplicateValues[m] + " duplicates: " + count + " times");
					}
				}
			}

			static int[] duplicateValues;

			static boolean numberExists(int num) {
				for (int i = 0; i < duplicateValues.length; i++) {
					if (duplicateValues[i] == num) {
						return false; // number already exist
					}
				}
				return true;// No exist
			}

		

	}


