import java.util.*; 
import java.io.*; 

class prac16{
	static void penlin(String s1, String s2){
				System.out.println("Given: "+s1+"\nReverse: "+s2); 
				if(s1.equalsIgnoreCase(s2))
					System.out.println("Peli Str");
				else
					System.out.println("Non pelin str"); 
	}
	static void strfun(){
		String s1 = "Madam"; 
		String s2 = "Hello"; 
		String revstr="";
		int len = s1.length(); 
		//reverse string
		for(int i=0; i<s1.length(); i++)
			revstr = s1.charAt(i) + revstr;
		penlin(s1, revstr);
		revstr="";
		for(int i=0; i<s2.length(); i++)
			revstr = s2.charAt(i) + revstr;
		penlin(s2, revstr); 
		//swap string
		System.out.println("Before: S1= "+s1+", S2= "+s2); 
		s1 = s1 + s2; 
		s2 = s1.substring(0,len); 
		s1 = s1.substring(len); 
		System.out.println("After: S1= "+s1+", S2= "+s2);
	}
	static void numberfun(){
		//prime
		int no=5;
		int tmp = 1; 
		System.out.print("\nPrime number of "+no+" = "); 
		for(int i=2; i<=no; i++)
			for(int j=2; j<=i; j++) 
				if(i%j==0)
					if(i==j) 
						System.out.print(i+","); 
					else
						break; 
		//Factorial
		System.out.print("\nFactorial of "+no+" = "); 
			for(int i=no; i>0; i--)
				tmp = i * tmp; 
		System.out.print(tmp); 
		//fibonanci
		int next=0, prev=1; 
		System.out.print("\nFibonanci series of "+no+" = "); 
		tmp = 0; 
		for(int i=0; i<=no; i++){
			System.out.print(next+",");
			tmp = next + prev; 
			next = prev; 
			prev = tmp; 
		}
	}
	static void arrayfun(){
		int a[] = {15,13,12,14,13,12,11,11};
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp; 	
				}
				else if(a[i]==a[j])
					a[j] = 0; 
			}
			if(a[i]!=0)
			System.out.print(a[i]+","); 
		}
		//Character freq.
		String s = "aaabbccdddde"; 
		char c[] = s.toCharArray(); 
		System.out.println("\nChar freq. of given string: "+s); 
		for(int i=0; i<c.length; i++){
			int count=1;
			for(int j=i+1; j<c.length; j++)
				if(c[i]==c[j]){
					c[j]='\0';
					count++;
				}
			if(c[i]!='\0')
			System.out.println(c[i]+" = "+count); 
		}		
	}
	static void charfun(){
		//char count
		String s = "adfasd@#@4daf232423", s1="wIndOWs", s2="Hello World!", s3="";
		int cch=0, cno=0, csc=0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i); 
			if(Character.isLetter(ch))
				cch++; 
			else if(Character.isDigit(ch))
				cno++; 
			else
				csc++; 
		}
		System.out.print("\nChar = "+cch+"\nNo = "+cno+"\nSC = "+csc);
		//Upper to Lower
		for(int i=s1.length()-1; i>=0; i--){
			char ch = s1.charAt(i); 
			if(Character.isLowerCase(ch))
				s3 = Character.toUpperCase(ch) + s3; 
			else if(Character.isUpperCase(ch))
				s3 = Character.toLowerCase(ch) + s3; 			
		}
		System.out.print("\nBefore = "+s1+"\nAfter = "+s3); 
		//Starts and endswith
		System.out.print("\nGiven String = "+s2); 
		System.out.print("\nStarts with Hello = "+s2.startsWith("Hello")); 
		System.out.print("\nEnds with World = "+s2.endsWith("World")); 
	}
	static void fileop(){
		try{
			File file = new File("test.txt"); 
			if(file.createNewFile())
				System.out.println("Created New File"); 
			else
				System.out.println("Already Existed"); 
			FileWriter writer = new FileWriter(file); 
			writer.write("Test data 8th Aug");
			writer.close(); 
			
			FileReader reader = new FileReader(file); 
			int c=0; 
			while((c=reader.read()) != -1)
				System.out.print((char)c); 
			
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage()); 
		}
	}
	public static void main(String[] args){
		strfun();
		numberfun(); 
		arrayfun(); 
		charfun(); 
		fileop(); 
	}
}
