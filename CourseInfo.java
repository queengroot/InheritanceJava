//Kate Blunt
//COP2552
//subclass to Course
//extends signifies this is a subclass

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CourseInfo extends Course {

	//per specifications, this subclass will hold the following variables:
	private String sectionNumber;
	private String instructorID;		//this is never used in the output, but it will still hold it in case it is ever needed to be used
	private String instructorName;
	private String day;
	private String time;
	private String campusRoom;
	
	
	
	//set the fields
	public void setFields(String num, String name, String secNum, String iName, String iID, String dayIn, String timeIn, String campRoom)
	{
		
		//set the course name and number from the superclass
		super.setFields(num, name);
		
		//same as up above - super.setfields is more convenient because it already assigns these variables
		//courseNumber = num;
		//courseName = name;
		
		//setting the variables in the subclass
		//inherited from superclass
		sectionNumber = secNum;
		instructorID = iID;
		instructorName = iName;
		day = dayIn;
		time = timeIn;
		campusRoom = campRoom;
		
		
	}
	
	//this method displayed the three dialog boxes
	public void outStudent(ArrayList<Integer> roster)
	{
	
		
		//checking to see which section it is
		//Depending on which section we will have to print out a different roster and students
		if (sectionNumber.contentEquals("001"))
		{
			
			
		
			
		JOptionPane.showMessageDialog(null, courseNumber + " - " + courseName + "\nSection: " + sectionNumber + "\n\n" 
				+ "Instructor: " + instructorName + "\nDay/time: " + day + " " + time + "\nCampus/Room: " + campusRoom 
				+ "\n\nStudent Roster: \n" + getRosterOutput(roster)); 
		}
		
		else if (sectionNumber.contentEquals("0M1"))
		{
		
			
			JOptionPane.showMessageDialog(null, courseNumber + " - " + courseName + "\nSection: " + sectionNumber + "\n\n" 
					+ "Instructor: " + instructorName + "\nDay/time: " + day + " " + time + "\nCampus/Room: " + campusRoom 
					+ "\n\nStudent Roster: \n" + getRosterOutput(roster));
			
		}
		
		else 
		{
			
			
			JOptionPane.showMessageDialog(null, courseNumber + " - " + courseName + "\nSection: " + sectionNumber + "\n\n" 
					+ "Instructor: " + instructorName + "\nDay/time: " + day + " " + time + "\nCampus/Room: " + campusRoom 
					+ "\n\nStudent Roster: \n" + getRosterOutput(roster));
			
			
		}
		
		//testing
		//System.out.println("Section: " + sectionNumber + "\n");
		
		//System.out.println("Instructor: " + instructorName);
		
		//System.out.println("Day/Time: " + day + time);
		
		//System.out.println("Campus/Room: " + campusRoom);
		
	}
	
	//this method is going to make the array of students in the class
	//display in a list
	public String getRosterOutput(ArrayList<Integer> roster)
	{
		
		////https://stackoverflow.com/questions/24414736/how-do-display-multiple-lines-in-a-joptionpane-with-arraylist
		//^^Helpful information on how to print off an array list
		//I did not think of adding the list as a variable
		
		String output = "";
		for(int i = 0; i < roster.size(); i++){
		    String studentString = roster.get(i).toString();

		    //student string is like this because the ID in the file was a - and then the id number again
		    output += studentString + "-" + studentString + "\n";       
		
		    
		}
		
		return output;
	}
	


	
}
