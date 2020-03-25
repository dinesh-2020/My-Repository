package ttd;

public class Project {

	public String input(String s) {
	String result="";
	if (s.length()>=1 && s.charAt(0)!='A')
	     result+=s.charAt(0);
	if (s.length()>=2 && s.charAt(1)!='A')
			result+=s.charAt(1);
	if (s.length()>=3)
		result+=s.substring(2);
	return result;
			
	}
}


