package week3.d1.assignment4;
/*
 * Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

==================================================
 */

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("ID alone");
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("ID and Name alone");
	}

	public void getStudentInfo(String email, String phoneNo) {
		System.out.println("Email and phone no alone");
	}
	
	public static void main(String[] args) {
		
		Students ss = new Students();
		ss.getStudentInfo(1);
		ss.getStudentInfo(1, "Sudhagar");
		ss.getStudentInfo("abc@gmail.com", "8754420144");
		
	}

}
