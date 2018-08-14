import java.util.*;

class Student
{
	private String name;	
	private int marks;
	
	Student (String n , int m)
	{
		name= n;
		marks=m;
	}
	
	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public String toString()
	{
		String s;
		s = "\n Name " + name + " Marks " + marks;
		
		return s;
	}
	
}

class StudentComparator implements Comparator
{

	public int compare(Object obj1, Object obj2) {
		Student  first = (Student )obj1;
		Student second = (Student )obj2;

		//int diff= first.getMarks()- second.getMarks(); //Ascending order of marks
		int diff= second.getMarks()- first.getMarks(); //Descending order of marks
		
		
		if(diff==0)
		diff= first.getName().compareTo(second.getName());
		
		return diff;
	}
	
	}

public class ComparatorDemo2 {
	public static void main(String args[])
	{
		StudentComparator cmp = new StudentComparator();
	  	
		TreeSet ts = new TreeSet(cmp);
		ts.add(new Student("Amit",35) );
		ts.add(new Student("Deepak",55));
		ts.add(new Student("Manoj",75));
		ts.add(new Student("Alok",75));
		ts.add(new Student("Niraj",85));		
		
		System.out.println("Contents of  ts = " + ts);
	}
}
