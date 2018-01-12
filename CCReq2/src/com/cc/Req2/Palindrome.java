package com.cc.Req2;
public class Palindrome {

	public void checkPalindrome(String s){
		int n=s.length();
		for(int i=0;i<=n/2;i++){
		if(s.charAt(i)==s.charAt(n-1)){
			n=n-1;
		}
		else{
			System.out.println("given string is not a palindrome");
			return;
		}
		}
		System.out.println("given string is a palindrome");
	}
	public void checkPalindrome(int num){
		int temp=num;
		int sum=0;
		int rem;
		while(num>0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum){
			System.out.println("given number is a palindrome");
		}
		else{
			System.out.println("given number is not a palindrome");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p=new Palindrome();
		p.checkPalindrome("asdsa");
		p.checkPalindrome(1001);
	}

}
