//****************************************************
//Programmer:  Karson Mathews
//Aggregation-Interface
//Homework 1:  Task
//Date:        11/11/21
//Description: The Task class implements our interface, priority
//			   and needs a Mode to create a Task object. Here I 
//		       define a constructor(and a counter), a String getName()  
//			   method, int getPriority(), String setName(newName),
//			   int setPriority(newPriority), String toString(), and  
//			   a static method getTasks() that returns the total count
//			   of all task objects created.
//****************************************************** 

package AggregationHW;

public class Task implements Priority {
	//Variables
	public int priority;
	public String name;
	public static int taskNr;
	public Mode m1;
	
	//Constructor
	public Task(String n, Mode m) {
		name = n;
		m1 = m;
		priority = MID_PRIORITY;
		taskNr++;
	}
	
	//getName() method simply returns the String in the name variable
	public String getName() {
		return name;
	}
	
	//getPriority() method simply returns the integer in the priority variable
	public int getPriority() {
		return priority;
	}
	
	//setName() method simply sets the String parameter as the new value of "name"
	public void setName(String newName) {
		name = newName;
	}
	
	//setPriority() takes in an integer and assigns the new priority value to "priority"
	public void setPriority(int newPriority) {
		priority = newPriority;
	}
	
	//toString method changing priority to a string and return a description of my task(s)
	public String toString() {
		String p = Integer.toString(priority);
		return name + "\n" + "Priority: " + p + "\n" + m1;
	}
	
	//static method getTasks returns an integer counting the number of times we created a task object
	public static int getTasks() {
		return taskNr;
	}


}
