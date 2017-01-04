package com.techwaly.hailstoneseries;

import java.util.Scanner;

public class TestHailStone {
	static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Enter Number To Generate Series:");
		int number = input.nextInt();
		// Creating instance of HailStone series
		HailStone hailstone = new HailStone(100);
		// Calling method to Create HailStone Series and Store it in ArrayList
		hailstone.genrateHailStoneInArrayList(number);
		// Calling method to Create HailStone Series and Store it in Array
		try {
			hailstone.genrateHailStoneInArray(number);

		} catch (IndexOutOfBoundsException msg) {

			System.out.println("HailStone Series Have more elements then Arraysize ");
		}

		System.out.println("Print series from Arraylist:");
		hailstone.printArrayListSeries();
		System.out.println("\nPrint series from Array:");
		hailstone.printArraySeries();
		System.out.println("\nMaximum Number in series Using ArrayList:" + hailstone.maximumValueFromArrayList());
		System.out.println("Maximum Number in series Using Array:" + hailstone.maximumValueFromArray());
		hailstoneSeries();

	}

	public static void hailstoneSeries() {

		int[] a = new int[100];
		int i = 0;
		int n = 3;
		while (n != 1) {
			a[i] = n;
			i++;
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
		}
		a[i] = n;
		i++;
		for (int k :a) {
			if (a[k] == 0) {
				break;
			} else {
				System.out.print(a[k] + " ");
			}

		}
	}
	public static void hailstoneusingAL(){
  //  List<Integer> h
		
	}

}
