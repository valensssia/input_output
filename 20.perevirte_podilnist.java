package input_output;

import java.util.Scanner;

public class perevirte_podilnist {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n % m == 0) {
			System.out.println("1");
		}else {
			if (m % n == 0) {
				System.out.println("1");
			}else {
				System.out.println("3");
			}
			}
		}
		}


