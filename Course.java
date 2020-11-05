//Kate Blunt
//COP2552
//Super class for Course number and Course Name

import javax.swing.JOptionPane;

public class Course {
	
		//will need two variables, course number and course name
		//protected is so a subclass can inherit these two fields
		protected String courseNumber;
		protected String courseName;
		
		
		//set the fields of courseName and courseName
		//send in the first two of the array when reading in from file
		public void setFields(String num, String name)
		{
			
			courseNumber = num;
			courseName = name;
		}
		
		
		//print out the course number and name for each output dialog box
		//subclass will be able to access this
		//public void outCourse()
		//{
			
			//JOptionPane.showMessageDialog(null, courseNumber + " - " + courseName);
			
			
		//}
		

}

//the subclass will inherit this for every dialog box for the different sections because
//these two parts have to be at the top of every dialog box
