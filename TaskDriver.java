//****************************************************
//Programmer:  Karson Mathews
//Aggregation-Interface
//Homework 1:  Task
//Date:        11/11/21
//Description: This is the Driver program for Task, Mode, and 
//			   the interface Priority. Here we create 4 mode 
//		       objects to use in our task objects. I then created
//			   4 tasks objects. I then assigned all 4 tasks
//			   a new priority by using the setPriority() method.
//			   I then output to the screen the toString methods
//			   from our Task class and finally, output the total
//			   number of tasks using our getTasks() static method.
//****************************************************** 

package AggregationHW;

public class TaskDriver {
	public static void main(String[] args) {
		//Creating 4 mode objects
		Mode mode1 = new Mode("Old", 3);
		Mode mode2 = new Mode("Old", 1);
		Mode mode3 = new Mode("Really Old", 5);
		Mode mode4 = new Mode("New", 1);
		
		//Creating 4 task objects using my new modes
		Task task1 = new Task("Do the Laundry", mode1);
		Task task2 = new Task("Clean the Dishes", mode2);
		Task task3 = new Task("Clean the House", mode3);
		Task task4 = new Task("Do my Homework", mode4);
		
		//Assigning priority values
		task1.setPriority(Task.MIN_PRIORITY);
		task2.setPriority(Task.MID_PRIORITY);
		task3.setPriority(Task.MID_PRIORITY);
		task4.setPriority(Task.MAX_PRIORITY);
		
		//Printing using toString method on task objects
		System.out.println(task1.toString() + "\n");
		System.out.println(task2.toString() + "\n");
		System.out.println(task3.toString() + "\n");
		System.out.println(task4.toString() + "\n");
		
		//Printing to screen total number of tasks with the static method get.Tasks
		System.out.println("Number of tasks: " + Task.getTasks());
	
	}
}

