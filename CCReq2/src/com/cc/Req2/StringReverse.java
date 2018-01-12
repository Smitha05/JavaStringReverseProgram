package com.cc.Req2;
public class StringReverse {
	
	public String reverseString(String s){
		int n=s.length();
		String a="";
		for(int i=n-1;i>=0;i--){
			a= a+ s.substring(i, i+1);
		}
		System.out.println(a);
		return a;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse r= new StringReverse();
		r.reverseString("asdgh7653gvtr");
		
	}

}
