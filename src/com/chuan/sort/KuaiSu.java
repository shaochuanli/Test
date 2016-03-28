package com.chuan.sort;

import java.util.Arrays;

public class KuaiSu {

	public static void sort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int low = left;
		int high = right;
		boolean flag = true;
		while (low < high) {
			if (flag) {
				if (array[low] <= array[high]) {
					high--;
				} else {
					int temp = array[low];
					array[low] = array[high];
					array[high] = temp;
				}
			} else {
				if (array[low] <= array[high]) {
					low++;
				} else {
					int temp = array[low];
					array[low] = array[high];
					array[high] = temp;
				}
			}
		}
		sort(array, left, low - 1);
		sort(array, low + 1, right);

	}

	public static void main(String[] args) {
		int[] array = { 9, 15, 3, 7, 2, 1, 7, 3 };
		KuaiSu.sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
}
