package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name");
	}

	public void studentDept() {
		System.out.println("Student Dept");
	}

	public void studentId() {
		System.out.println("Student ID");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}

}
