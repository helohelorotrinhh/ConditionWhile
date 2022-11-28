package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	//11.1
		int i = 0;
		int tong = 0;
		while(i <= 100) {
			tong += i;
			i++;
		}
		System.out.format("Tong: %d", tong);
		
	//11.2
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		tong = 0;
		i = 0;
		while(i < n) {
			i += 3;
			if(i % 3 == 0)
				tong += i;
		}
		System.out.format("Tong: %d", tong);
		
		//11.3
		int count = 0;
		int first = 1;
		int second = 2;
		while(count <= 10) {
			int last = first + second;
			System.out.println(" ");
			System.out.format("fibonacci: %d", last).println();
			count++;
			first = second;
			second = last;
		}
		
		//11.4
		n = 0;
		n = sc.nextInt();
		int temp = n;
		int rv = 0;
		while(n > 0) {
			int mod = n % 10;
			n = n / 10;
			rv = rv * 10 + mod;
		}
		if(temp == rv) {
			System.out.println("Day la so polinum");
		}else {
			System.out.println("Day khong phai la so polinum");
		}
		//11.5
		i = 100;
		int total = 0;
		while(i <= 999) {
			tong = 0;
			n = i;
			while(n > 0) {
				int mod = n % 10;
				n = n / 10;
				tong += mod;
			}
			if(tong % 3 == 0)
				total += i;
			i++;
		}
		System.out.format("so chia het cho 3: ", tong);
	
		
	}
	   
	   
	
	
	
	
	
}
