package com.nit.gitdemo;

public class GitHubDemo {
	public static void m1() {
		//System.out.println("M1 Method");
	}
    public static void m2(int i)
    {
    	
    	System.out.print(i*i+" ");
    	System.out.print(i*i+" ");
    }
	public static void main(String[] args) {
		System.out.println("Welcome To GitHub");
		for(int i=0;i<=10;i++) {
			//System.out.println("I::"+i);
			 m2(i);//created by shakti
		}
		
		m1();
   
	}

}
