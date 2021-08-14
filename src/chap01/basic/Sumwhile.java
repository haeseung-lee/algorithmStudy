package chap01.basic;

import java.util.Scanner;

public class Sumwhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
		//while문 종료시 i 값이 n+1이 됨을 확인
		System.out.println("i 값 확인 : " + i);
	}
	
}