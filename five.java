package maain;
import java.util.*;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>a=new ArrayList <String>();
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements");
		a.add("akarsh");
		a.add("bunny");
		a.add("chaitra");
		a.add("charan");
		a.add("manoj");
		a.add("vikram");
		a.add("vijay");
		a.add("vasu");
		a.add("pavan");
		a.add("mithra");
		System.out.println("The initial list is:");
		System.out.println(a);
		while(true)
		{
			System.out.println("Enter choice");
			System.out.println("1.Insert\t 2.Remove\t 3.Fetch\t 4.Exit\t");
			int b=s.nextInt();
			switch(b)
		{
		case 1:System.out.println("Enter element");
		  		String e=s.next();
		      a.add(e);
		      break;
		case 2:System.out.println("Enter element");
		  e=s.next();
		  if(a.contains(e))
		  {
		  a.remove(e);
		  }
		  else
		  {
		  System.out.println(e+"is not present");
		  }
		  break;
		case 3:System.out.println("Fetching:");
		  for(String n1:a )
		  {
		  System.out.println(n1+' ');
		  }
		  break;
		case 4:System.out.println("You have exitted!");
			System.exit(0);
		  break;
		}
		System.out.println(a);
		
		}
		}

	}

