package com.example.practical;

public class ClassA 
{
 public String Display(String s) 
 {
	 System.out.println("hello"+s);
	 return"hello";
	 
 }
	
 public String Display(int a) 
 {
	 
	 System.out.println("number is"+a);
	 return"number";
	 
 }
 
 public String Display(String s,int a) 
 {
	 System.out.println(s+""+a);
	 return"welcome";
	 
 }
 public static void main(String[] args)
 {
	ClassA obj=new ClassA();
	obj.Display("java");
	obj.Display(10);
	obj.Display("welcome", 20);
	 
	 
}
 
}
