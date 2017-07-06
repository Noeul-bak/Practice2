package com.javane.practice;

public class Prac01 {

	public static void main(String[] args) {

		int[] intData = new int[13];
		intData[0] = 1;
		intData[1] = 3;
		intData[2] = 5;
		intData[3] = 8;
		intData[4] = 9;
		intData[5] = 11;
		intData[6] = 15;
		intData[7] = 19;
		intData[8] = 18;
		intData[9] = 20;
		intData[10] = 30;
		intData[11] = 33;
		intData[12] = 31;

		int num = 0;
		int sum = 0;

		for (int i = 0; i < 13; i++) {
			if (i % 3 == 0) {

				num++;
				sum = sum + intData[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + num);
		System.out.println("주어진 배열에서 배수의 합=>" + sum);

	}
}
