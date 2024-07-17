package javalearning;
/**printing my name
 * creating object q1 for class Question1
 * creating method name()
 */
	//class
public class JavaBasics {
	int g=10;//global variable
	
	public static void main(String[] args){
		String k = "Gudla";//local variable
		
		JavaBasics jb = new JavaBasics();
		System.out.println("printing global variable>>>> " + jb.g);
		
		/*printing local variable
		  no need to use object
		 */
		System.out.println("printing local variable>>>> "+k);
		String s="parimala";
		int i = 100;
		float f = 252525;
		char c = 'v';
		double d = 23564.85;	
		boolean b = true;
		System.out.println("printing integer - "+i);
		System.out.println("printing float - "+f);
		System.out.println("printing char - "+c);
		System.out.println("printing double - "+d);
		System.out.println("printing boolean - "+b);
		System.out.println("My name is"+s);
		//calling method printName() to print name
	    printName();
		
    }
	
	// method to print name   
	static void printName(){
    	System.out.println("Parimala");
	}		
} 
    
	
    
    


    
    
      

	
    


