package com.vogella.build.maven.java;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
/**
 * Hello world!
 *
 */
class Gift
{
	String sweetName; 
    int sweetCount;
    String candyName; 
    int candyCount; 
}

class Sweet extends Gift{ 
	  
    // the class Sweet has two fields 
  
    // the class Sweet has one constructor 
    Sweet(String name, int count) 
    { 
        this.sweetName = name; 
        this.sweetCount = count; 
    } 
} 

class Candies extends Gift{ 
	  
    // the class Candies has two fields 
    
  
    // the class Candies has one constructor 
    Candies(String name, int count) 
    { 
        this.candyName = name; 
        this.candyCount = count; 
    } 
}


public class App
{
	public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	Gift ob1;
    	System.out.print("enter the number of things in the gift: ");
        int n=s.nextInt();
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
        	System.out.print("enter the name of the thing: ");
        	BufferedReader reader =  
                    new BufferedReader(new InputStreamReader(System.in)); 
          
         // Reading data using readLine 
        	String name = null;
			try {
				name = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("it will not work");
				e.printStackTrace();
			} 
        	System.out.print("enter the count of the thing: ");
        	int count=s.nextInt();
        	System.out.print("enter the type of the thing: ");
        	String type = null;
			try {
				type = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("it will not work");
				e.printStackTrace();
			} 
        	if(type.contentEquals("sweet"))
        	{
        		ob1=new Sweet(name,count);
        		System.out.println(ob1.sweetName + ", " + ob1.sweetCount+", " + type); 
        	}
        	else if(type.equals("candy"))
        	{
        		ob1=new Candies(name,count);
        		System.out.println(ob1.candyName + ", " + ob1.candyCount+", " + type);
        	}   
        }
    }
}
