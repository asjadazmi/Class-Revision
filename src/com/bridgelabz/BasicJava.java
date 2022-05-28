package com.bridgelabz;
public class BasicJava {
	public static int addTwo(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static void main(String args[]) {
		int a=5;
		int b=2;
		int sum=0;
		sum=addTwo(a,b);
		System.out.println("sum of two number"+sum);
		System.out.println("-----------------NEXT Question------------");
		System.out.println("hello");
		System.out.println("asjad");
		if(a!=b) {
			System.out.println(a+"!="+b+"=");
			System.out.println(a!=b);
		}
		else {
			System.out.print(+a+"!="+b+"="+(a!=b));
			
		}
		if(a<b) {
			System.out.print(+a+"<"+b+"=");
			System.out.println(a<b);
		}
		else {
			System.out.print(+a+"<"+b+"=");
			System.out.println(a<b);
		}
		if(a>b) {
			System.out.print(+a+">"+b+"=");
			System.out.println(a<b);
		}
		else {
			System.out.print(+a+">"+b+"=");
			System.out.println(a>b);
		}
}
	

}
