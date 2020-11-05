//Kate Blunt
//COP2552
//class to read files and send to 
//super class and subclass


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ReadFiles {

	
	//empty array declaration
	ArrayList<String> courseArray = new ArrayList<String>();
	
	//empty array declaration
	ArrayList<String> courseArrayTwo = new ArrayList<String>();
		
	//empty array declaration
	ArrayList<String> courseArrayThree = new ArrayList<String>();
	
    //empty array for the student array
	ArrayList<Integer> studentArrayZero = new ArrayList<Integer>();
	
	//empty array for the student array
	ArrayList<Integer> studentArrayM = new ArrayList<Integer>();
	
	//empty array for the student array
	ArrayList<Integer> studentArrayE = new ArrayList<Integer>();
	
	public void driver()
	{
	
		File courseInfo = openFileCourseInfo();
		readCourse(courseInfo);
		File studentInfo = openFileStudentInfo();
		readStudent(studentInfo);
	
	}
	
		//open the first file
			 public File openFileCourseInfo()
			{
				//open first file 
						File courseInfo = new File("CourseInfo.txt");
						

						return courseInfo;		
			}
			 
			 //open the second file
			 public File openFileStudentInfo()
				{
					//open second file 
							File studentInfo = new File("StudentRegistration.txt");
							

							return studentInfo;		
				}
			 
			 //read the course information file
			 public void readCourse(File courseInfo)
			 {
				 
				 try (Scanner courseFile = new Scanner(new File("CourseInfo.txt"))) {
					    
						//while the file is not at the end read in the next integer value
						while(courseFile.hasNext())
						{
							//read in the string
							String a = courseFile.nextLine();
							
							//handling for enters or spaces
							if(a.isEmpty())
							{
								continue;
							}
							
							
							
							//add the string to the array
							//testing for 8 because that is the number before we hit the new section information
							courseArray.add(a);
							if (courseArray.size() == 8)
							{
								break;
							}
							
							//testing purposes
							
							//System.out.println(courseArray);
							
							
						} 
						
						//the first two elements of each array need to be course name and number
						courseArrayTwo.add(courseArray.get(0));
						courseArrayTwo.add(courseArray.get(1));
						
						while(courseFile.hasNext())
						{
							//read in the int
							String a = courseFile.nextLine();
							
							if(a.isEmpty())
							{
								continue;
							}
							
							
							
							
							//add the int to the array
							courseArrayTwo.add(a);
							if (courseArrayTwo.size() == 8)
							{
								break;
							}
							
							//testing purposes
							
							
							
							
						} 
						
						//System.out.println(courseArrayTwo);
						
						courseArrayThree.add(courseArray.get(0));
						courseArrayThree.add(courseArray.get(1));
						
						while(courseFile.hasNext())
						{
							//read in the int
							String a = courseFile.nextLine();
							
							if(a.isEmpty())
							{
								continue;
							}
							
							
							
							
							//add the int to the array
							courseArrayThree.add(a);
							if (courseArrayThree.size() == 8)
							{
								break;
							}
							
							//testing purposes
							
							
							
							
						} 
						
						//testing
						//System.out.println(courseArrayThree);
						
						//close the file 
						close(courseFile);
						
				 
			 }
	
				 //in case the file is not found
				 catch (FileNotFoundException e) {
						
						//handle
					 	//error messages should always be descriptive
						System.out.println("CourseInfo.txt not found");
						
						
						//exit the program
						System.exit(0);	
					}
				 
				// System.out.println(courseArray.get(2) + "Hello");
				
			 }
			 
			 //read in the student registration file
			 //three arraylists for each section
			 //sort arrrayList
			 
			 public void readStudent(File studentInfo)
			 {
				 
				 
				 try (Scanner studentFile = new Scanner(new File("StudentRegistration.txt"))) {
					    
						//while the file is not at the end read in the next integer value
						while(studentFile.hasNext())
						{
							//read in the string and the int
							String a = studentFile.nextLine();
							String b = studentFile.nextLine();
							int num = 0;
							
							//checks for the section number
							if(b.contentEquals("0M1"))
								
							{
								num = Integer.parseInt(a.substring(5));
								
								//testing
								//System.out.println(num + "&&&& **** **********");
								
								studentArrayM.add(num);
								Collections.sort(studentArrayM);
							}
							
							//checks for the section number
							else if (b.contentEquals("001"))
							{
								num = Integer.parseInt(a.substring(5));
								
								//testing
								//System.out.println(num + "&&&& **** **********");
								
								studentArrayZero.add(num);
								Collections.sort(studentArrayZero);
							}
							
							//checks for the section number
							else
							{
								num = Integer.parseInt(a.substring(5));
								
								//testing
								//System.out.println(num + "&&&& **** **********");
							
								studentArrayE.add(num);
								Collections.sort(studentArrayE);
							}
							
							
							//collections automatically sorts my arrayList
							
						} 
						
						//testing
						//System.out.println(studentArrayZero);
						//System.out.println(studentArrayM);
						//System.out.println(studentArrayE);
						
						
						//close the file 
						close(studentFile);
						
				 
			 }
	
				 catch (FileNotFoundException e) {
						
						//handle any problems
					 	//error messages should always be descriptive
						System.out.println("StudentRegistration.txt not found");
						
						
						//exit the program
						System.exit(0);	
					}
				 
				 //System.out.println(courseArray.get(2) + "Hello");
				 
			 }
			 
			//this way another class can access this array
			 //I have found get methods extremely useful in getting variables to other classes. This 
			 //way i am not passing the array directly
			 
				public ArrayList<String> getCourse()
				{
					return courseArray;
				}
				
				//this way another class can access this array
				public ArrayList<String> getCourseOne()
				{
					return courseArrayTwo;
				}
				
				//this way another class can access this array
				public ArrayList<String> getCourseTwo()
				{
					return courseArrayThree;
				}
				
				//get the student array classes
				public ArrayList<Integer> getStudentZero()
				{
					return studentArrayZero;
				}
				
				
				public ArrayList<Integer> getStudentM()
				{
					return studentArrayM;
				}
				
				public ArrayList<Integer> getStudentE()
				{
					return studentArrayE;
				}
				
				
				
			//close the file
			 public void close(Scanner file)
			 {
				 file.close();
			 }
			 
					 
			 
}
