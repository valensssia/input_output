package input_output;

import java.util.Scanner;

public class nastupne_parne {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(n - (n % 2) + 2 );

    }
}


