package com.levelup.JavaSession2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		System.out.println("Enter Some Value");

		Scanner sc = new Scanner(System.in);
		
		try {
			int num = sc.nextInt();
			int a = num % 0;
			System.out.println(a);
		}catch (ArithmeticException e) {
			//System.err.println("Divisible by 0 not possible");
			System.err.println(e.getMessage());
		}catch (InputMismatchException e) {
			//e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e) {
			System.err.println("Unknown Exception");
		}finally {
			sc.close();
			System.out.println("Test finally");
		}
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// try - catch 
		
		// try- finally
		
		// try- catch - finally
		
		
		System.out.println("Test Completed");

	}

}
