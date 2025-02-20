import java.util.Arrays;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		int[] array = { 12, 84, 1, 56, 78, 5, 2 };

		System.out.println("Original Array :" + Arrays.toString(array));

		Arrays.sort(array);

		System.out.println("Sorted Array : " + Arrays.toString(array));
	}

}