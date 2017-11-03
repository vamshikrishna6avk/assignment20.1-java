package hashmapemployee;//created package as hashmapemployee
// importing classes, which are belongs from java.util.package;

import java.util.HashMap;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
//hashmap contains values based on key and contains  unique elements
import java.util.Map;//map provides methods for storing values baes on key basis

public class GenericHashMap {//created class name as GenericHashMap
	                        //classes are the basics of opps(object oriented programming language)

	public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		/**
		 * 1.In here Creating HashMap with default initial 
		 * capacity and load factor..
		 */
		HashMap<Integer, String> empNames = new HashMap<Integer, String>();
		//2. in here Putting Empcode as key and EmpName as value..
		empNames.put(001, "Manoj");//putting empNames
		empNames.put(002, "Ravan");
		empNames.put(003, "Manish");
		empNames.put(004, "Bala");
		empNames.put(005, "Sunydhar");
		empNames.put(006, "Deepak");
	
		System.out.println("Display the empNames");//system is used to return code
        //out is a static member
        //println is used to print text and gives output
		// 3. now In here mapping key with the values
		for(Map.Entry maP: empNames.entrySet()){//using for loop
			                                     //for loop is for initialization statement,conditional check
			System.out.println(maP.getValue());//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
		}
	}
}
