//****************************************************
//Programmer:  Karson Mathews
//Aggregation-Interface
//Homework 1:  Mode
//Date:        11/11/21
//Description: class Mode is needed for any 'Task' object we create.
//			   Therefore, we only have a construct and a toString()
//		       method, as well as, two variables, String novelty
//			   and int likeability.
//****************************************************** 

package AggregationHW;

public class Mode {
	//Variables
	public String novelty;
	public int likeability;
	
	//Constructor
	public Mode(String n, int l) {
		novelty = n;
		likeability = l;
	}
	
	//toString() method changing likeability from an integer to a String and return the Mode description.
	public String toString() {
		String s = Integer.toString(likeability);
		return "Mode: Novelty is " + novelty + " and on a scale of 1-10, I like it this much: " + s;
	}
}
