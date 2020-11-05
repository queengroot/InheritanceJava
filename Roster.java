//Kate Blunt
//COP2552
//Project 5 
//Inheritance Project

//To do 
//make a super class to hold course number and course name
//make a subclass to hold all the other section information
//read in course information
//read in student registration 
//inherit the course name and course number from the super class
//sort arrayList of student registration numbers
//display three dialog boxes, each one pertaining to the section number. 


//main should always be small
public class Roster {

	public static void main(String[] args) {
		
		//call array class which populates the arrays
		//and calls the subclass
		Arrays program = new Arrays();
		
		program.populateArrays();
		
	}

}


//My Notes:
//Notes to improve in future:
//Variable and array names: Names must be better and more descriptive. Instead of going for short names go for descriptive so it isn't confusing to myself!
//Break up code as much as possible. With encapsulation and inheritance this will get easier and easier. 
//Do To-Do list for each class to keep track of what each class's job is
//Find better ways to access arrays. I don't like how I had to have a string variable equal to an arrayList element and then pass it into the setfields method.
//Really focus on usability. If the file gets more entries will this code work?
//Is there another way to get the Student Id number without breaking it apart at the dash? 
//



