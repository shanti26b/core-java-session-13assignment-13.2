
 //here we cretaed package as assignment A which that organizes a set of related classes and interfaces

package assignment;   // here i am creating package name as assignment

public class Name {      // creating class name as Name
	
	public static void main (String[]args){   // main method
		
		
		String Str = new String("I-Love-my-parents");
		
		              //system : is a class in java language pacakage.
		              //out : static member of the system class.
		              //println : to print what is message.
		
	      System.out.println("Output Value :" );  
	      
	      //Applying for each loop
	      //The string split() method breaks a given string around matches of the given regular expression.
	      
	      for (String retval: Str.split("-")) {
	    	  
	         System.out.println(retval);
	      
	      }
	      	        //Creating another string  
	      
	         String Str1 = new String("I-L-o-v-e-m-y-p-a-r-e-n-t-s");
	         
	         System.out.println("Output value:");
	      
	         
	         for(String s:Str1.split("-")){   //Applying for each loop
//
	        	 System.out.println(s);
	        	 
	        	
	         }
	      }
	   
	

		
	}


