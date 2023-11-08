package demo;

import java.util.Scanner;

public class A {
	
	  protected int a=45;
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	         n = 1;
	        for (int i = 1; i <=5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(n + " ");
	                n++;
	            }
	            System.out.println();
	        }sc.close();
		}
}
