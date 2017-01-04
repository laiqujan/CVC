package com.techwaly.hailstoneseries;

import java.util.ArrayList;

public class HailStone {
	private ArrayList<Integer> hailstone_AL;
	private int[] hailstone;
	private int array_size;

	public HailStone(int array_size) {
		hailstone_AL = new ArrayList<Integer>();
		this.setArray_size(array_size);
		hailstone = new int[array_size];

	}

	public void genrateHailStoneInArrayList(int number) {

		while (number != 1) {
			hailstone_AL.add(number);
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = number * 3 + 1;
			}

		}
		hailstone_AL.add(number);

	}

	public void genrateHailStoneInArray(int number)throws IndexOutOfBoundsException {
		int index = 0;
		while (number != 1) {
			hailstone[index] = number;
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = number * 3 + 1;
			}
			index++;

		}
		hailstone[index] = number;
	}

	public int maximumValueFromArray() {
		int max = hailstone[0];
		for (int i = 0; i < hailstone.length; i++) {
			if (hailstone[i] > max) {
				max = hailstone[i];
			}
		}
		return max;
	}

	public int maximumValueFromArrayList() {
		int max = (int) hailstone_AL.get(0);
		for (int i = 0; i < hailstone_AL.size(); i++) {
			if ((int) hailstone_AL.get(i) > max) {
				max = (int) hailstone_AL.get(i);
			}
		}
		return max;
	}

	public void printArrayListSeries() {
		for (int i = 0; i < hailstone_AL.size(); i++) {
			System.out.print(hailstone_AL.get(i) + " ");
		}
	}

	public void printArraySeries() {
		for (int i = 0; i < hailstone.length; i++) {
			if (hailstone[i] == 0) {
				break;
			} else {
				System.out.print(hailstone[i] + " ");
			}

		}

	}

	public int getArray_size() {
		return array_size;
	}

	public void setArray_size(int array_size) {
		this.array_size = array_size;
	}
}