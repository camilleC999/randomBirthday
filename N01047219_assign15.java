//Assignment 15
//Camille Copeland

import java.util.Scanner;
import java.util.Random;
public class N01047219_assign15 {

	public static void main(String[] args) {
		int[] birthday = new int[365];
		
		RandomNumber(birthday);
		MaxMinBday(birthday);
		

	}

	static void RandomNumber(int[] array) {
		Random day = new Random();
		

		for(int numOfBdays = 0; numOfBdays < 12000; numOfBdays++) {
			int birthday = day.nextInt(365);
			int c = array[birthday];
			array[birthday] = c + 1;
		}
		
		for(int i = 0; i < 365; i++) {
			System.out.println("Day " + (i+1) + ": " + array[i] + " people");
		}
	}
	
	static void MaxMinBday(int[] array) {
		int max = array[0];
		for(int i = 1; i < 365; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		int min = array[0];
		for(int i = 1; i < 365; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
	
		
		System.out.println("The following days have " + max +" people:" );
		for(int i = 0; i < 365; i++) {
			if(array[i] == max) {
				System.out.print("Day " + (i+1) + " \n");
			}
		}
		System.out.println("The following days have " + min +" people:" );
		for(int i = 0; i < 365; i++) {
			if(array[i] == min) {
				System.out.print("Day " + (i+1) + " \n");
			}
		}
		
	}
}
