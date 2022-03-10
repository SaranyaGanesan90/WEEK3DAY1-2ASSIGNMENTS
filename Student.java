package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name - Student");
	}
	public void studentDept() {
		System.out.println("Student Department - Student");
	}
	public void studentID() {
		System.out.println("Student ID - Student");
	}
	public static void main(String[] args) {
		//College clg = new College();
		//clg.collegeCode();
		//clg.collegeName();
		//clg.collegerRank();
		
		//Department dpt=new Department();
		//dpt.deptName();
		
		
		Student std=new Student();
		std.collegeCode();
		std.collegeName();
		std.collegerRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentID();

		}

	}



