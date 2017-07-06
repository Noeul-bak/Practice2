package com.javane.practice;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] intNumber = new int[5];
		int num = 0;
		double sum = 0;

		for (int i = 0; i < intNumber.length; i++) {
			num = sc.nextInt();
			
			sum+=num;
		}
		System.out.println("평균은" + sum / intNumber.length + "입니다.");

		sc.close();
	}
}
