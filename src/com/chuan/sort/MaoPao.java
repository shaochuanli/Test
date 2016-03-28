package com.chuan.sort;

import java.util.Arrays;

public class MaoPao {

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 9, 15, 3, 7, 2, 1, 7, 3 };
		MaoPao.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
