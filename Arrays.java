import java.util.ArrayList;

//Kate Blunt
//COP2552
//Array handling class
//did not want this in main
//the purpose of this class is to send the array elements to the setFields in the subclass



public class Arrays {

	
	public void populateArrays()
	{
		
	//call the driver in read files
	ReadFiles courseArray = new ReadFiles();
	
	courseArray.driver();
	
	//populate the three arrays for each section information
	ArrayList<String> superArray = courseArray.getCourse();
	ArrayList<String> superArrayTwo = courseArray.getCourseOne();
	ArrayList<String> superArrayThree = courseArray.getCourseTwo();
	
	//populate the three arrays that have the student registration
	ArrayList<Integer> studentArrayZero = courseArray.getStudentZero();
	ArrayList<Integer> studentArrayM = courseArray.getStudentM();
	ArrayList<Integer> studentArrayE = courseArray.getStudentE();
	
	//array for section 001
	String one = superArray.get(0);
	String two = superArray.get(1);
	String three = superArray.get(2);
	String four = superArray.get(3);
	String five = superArray.get(4);
	String six = superArray.get(5);
	String seven = superArray.get(6);
	String eight = superArray.get(7);
	
	//array for 0M1
	String oneo = superArrayTwo.get(0);
	String twoo = superArrayTwo.get(1);
	String threeo = superArrayTwo.get(2);
	String fouro = superArrayTwo.get(3);
	String fiveo = superArrayTwo.get(4);
	String sixo = superArrayTwo.get(5);
	String seveno = superArrayTwo.get(6);
	String eighto = superArrayTwo.get(7);
	
	//array for EM1
	String onei = superArrayThree.get(0);
	String twoi = superArrayThree.get(1);
	String threei = superArrayThree.get(2);
	String fouri = superArrayThree.get(3);
	String fivei = superArrayThree.get(4);
	String sixi = superArrayThree.get(5);
	String seveni = superArrayThree.get(6);
	String eighti = superArrayThree.get(7);
	
	//ReadFiles read = new ReadFiles();
	
	//read.driver();

	//instantiate the subclass
	CourseInfo info = new CourseInfo();
	
	//call the set fields of courseInfo
	//the super class has a setFields method as well
	//but we know this is going to the subclass 
	//by the amount of arguments it has
	info.setFields(one, two, three, four, five, six, seven, eight);
	info.outStudent(studentArrayZero);
	info.setFields(oneo, twoo, threeo, fouro, fiveo, sixo, seveno, eighto);
	info.outStudent(studentArrayM);
	info.setFields(onei, twoi, threei, fouri, fivei, sixi, seveni, eighti);
	info.outStudent(studentArrayE);
	
	//test
	//System.out.println(superArrayTwo + "******");
	
	//System.out.println(superArray + "&&&&&&&&&&&");
	//info.outCourse();
	}
	
}
	

