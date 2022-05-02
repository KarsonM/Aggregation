//****************************************************
//Programmer:  Karson Mathews
//Aggregation-Interface
//Homework 1:  Priority
//Date:        11/11/21
//Description: Interface includes the abstract methods from the 'Task' class
//			   setPriority(int newPriority) and getPriority(). Also, contains 
//		       three CONSTANT variables: MIN_PRIORITY=1, MID_PRIORITY=1, and
//			   MAX_PRIORITY=3.
//****************************************************** 

package AggregationHW;

public interface Priority {
	//Constant variables
	public final int MIN_PRIORITY = 1;
	public final int MID_PRIORITY = 2;
	public final int MAX_PRIORITY = 3;
	
	//Methods used in 'Task' class
	abstract void setPriority(int newPriority);
	abstract int getPriority();
}
