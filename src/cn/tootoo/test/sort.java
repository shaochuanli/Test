package cn.tootoo.test;

import java.util.Arrays;

/**
 * @author chuan
 * 
 */
public class sort {

	public static void quickSort(int[] a, int A, int B) {
		if (A >= B) {
			return;
		}
		boolean tranfer = true;
		int left = A;
		int right = B;
		while (left < right) {
			if (tranfer) {
				if (a[left] <= a[right]) {
					right--;
				} else {
					int temp = a[left];
					a[left] = a[right];
					a[right] = temp;
					tranfer = !tranfer;
				}
			} else {
				if (a[left] <= a[right]) {
					left++;
				} else {
					int temp = a[left];
					a[left] = a[right];
					a[right] = temp;
					tranfer = !tranfer;
				}
			}
		}

		quickSort(a, A, left - 1);
		quickSort(a, left + 1, B);

	}

	public static void main(String[] args) throws Exception {
		int[] list = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4,
				62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		sort.px(list, 0, list.length - 1);

		System.out.println(Arrays.toString(list));
	}

	public static void px(int[] list, int a, int b) {
		if(a >= b){
			return;
		}
		int left = a;
		int right = b;
		boolean flag = true;
		while (left < right) {
			if (flag) {
				if (list[left] <= list[right]) {
					right--;
				} else {
					int temp = list[left];
					list[left] = list[right];
					list[right] = temp;
					flag = false;
				}
			} else {
				if (list[left] <= list[right]) {
					left++;
				} else {
					int temp = list[left];
					list[left] = list[right];
					list[right] = temp;
					flag = true;
				}
			}
		}
		sort.px(list, a, left - 1);
		sort.px(list, left + 1, b);
	}
}
