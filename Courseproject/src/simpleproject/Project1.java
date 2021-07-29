package simpleproject;
import java.util.Scanner;

public class Project1 {
	public static void main(String[]args) {	
		start();

	}
	
	 public static void start() {
		 Scanner ss =new Scanner(System.in);
	 System.out.println("Welcome to OOP Management System,please choose an option");
	 System.out.println("Choose:\n 1-Log in. \n 2-Close the program."); 
	 int a= ss.nextInt();
	 if(a==1)
	 login();
	 }
	 
	 public static void login() {
		     Scanner ss =new Scanner(System.in);
			 System.out.println("Please enter user name and password");
			 System.out.print("User name: ");
		     String x=ss.next();
			 System.out.print("Password: ");
			 int y= ss.nextInt();
			 login(x,y); 
	 }
	 
	 
	 public static void login(String s,int d) {
 String username[] = {"Ahmed","Aya","Mohamed","Alaa","Salma"};
 int password[] = {1234,5678,9065,2390,8742};
 int i = 0;
 while (i < username.length) {
	 if(username[i].equals(s) && password[i]==d ) {
	 System.out.println("logging in successfully \n");
	 mainpage(i);
	 }
	 i++;	
	}
 System.out.println("Invalid user name or password,please try again. \n");
 start();
	 }
	 
	 
	 public static void mainpage(int u) {
		 String fullname[] = {"Ahmed Mohamed Ali","Aya Hassan Sayed","Mohamed Ayman Mostafa","Alaa Nagy Ali","Salma Mostafa Hagag"};
		 System.out.printf("Hi %s, Please Choose an option:%n",fullname[u]);
		 Scanner sv =new Scanner(System.in);
		 System.out.println(" 1-List Courses. \n 2-View Course. \n 3-Register to a new course. \n 4- Grade Report. \n 5- Log out.");
		 int y= sv.nextInt();
		 if (y==1)
			 ListCourses(u); 
		 else if (y==2)
			 ViewCourse(u,2); 
	     else if (y==3)
	    	 Registertoanewcourse(u);
		 else if (y==4)
			 ViewCourse(u,4);
         else
        	 start();
						 
	 }
	 
	 
	 public static void ListCourses(int u) { 
		 Scanner sx =new Scanner(System.in);
		 System.out.println("1- Math 1 --> MTH1212 \n2- Programming Principles --> CMP1231 \n3- Circuits 2 --> ELC1213 \n4- Medical physics --> BMP6143 \n5- chemistry --> CHE7098");
		 System.out.println("\n -View Course. \n -Step back. \n -Log out.");
		 String x=sx.next();
		 String coursecode[] = {"view course","step back","log out"};
		 if(coursecode[0].equals(x))
		    ViewCourse(u,2);
		 else if(coursecode[1].equals(x))
			 mainpage(u);
		 else if(coursecode[2].equals(x))
			 start();
	 }
	 
	 public static void ViewCourse(int u ,int y) {
		 Scanner sv =new Scanner(System.in);
		 String coursecode[] = {"MTH1212","CMP1231","ELC1213","BMP6143","CHE7098"};
		 System.out.println("Please enter course code:"); 
		 String x=sv.next();
		 for(int i=0;i<coursecode.length;i++) {
		 if(coursecode[i].equals(x))
			 code(i,u,y);
		 }	 
	 }
	 
	 public static void code( int k,int u,int y) {
		 String coursename[] = {"Integration and Linear Algebra.","Computer Systems","ELectrical Curcuits","Biology and Medical physics","Chemistry"};
		 String coursecode[] = {"MTH1212","CMP1231","ELC1213","BMP6143","CHE7098"};
		 System.out.printf("Course name: %s%n",coursename[k]);
		 System.out.printf("Course code: %s%n",coursecode[k]);
		 materials(k,u,y);
		 
	 }
	 
	 
	 public static void materials(int k,int u,int y) {
		 //view courses
		if(k==0&&y==2) {
			System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf");
			 System.out.println("Assignments:");
		    assignmentsm(u);}
		else if(k==1&&y==2)
			{System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-Lec 3.pdf");
			 System.out.println("Assignments:");
		assignmentsc(u);}
		else if(k==2&&y==2)
			{System.out.println("1-Lec 1.pdf \n2-Sheet1.pdf \n3-Lec 2.pdf");
			 System.out.println("Assignments:");
		assignmentse(u);}
		else if(k==3&&y==2)
			{System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-sheet2.pdf");
			 System.out.println("Assignments:");
		assignmentsb(u);}
		else if(k==4&&y==2)
			{System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-Lec 3.pdf \n4-sheet3.pdf");
			 System.out.println("Assignments:");
		assignmentsh(u);}
		
		//register to a new course
		if(k==0&&y==3) {
			System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf");
			}
		else if(k==1&&y==3)
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-Lec 3.pdf");
			 }
		else if(k==2&&y==3)
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Sheet1.pdf \n3-Lec 2.pdf");
			 System.out.println("Assignments:");
		assignmentse(u);}
		else if(k==3&&y==3)
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-sheet2.pdf");
			 }
		else if(k==4&&y==3)
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-Lec 3.pdf \n4-sheet3.pdf");
			 }
		
		//Grade report
		if(k==0&&y==4) {
			System.out.println("Your Grades:");
			GradeReportm(u);
			}
		else if(k==1&&y==4)
			{System.out.println("Your Grades:");
			GradeReportc(u);
			 }
		else if(k==2&&y==4)
			{System.out.println("Your Grades:");
			GradeReporte(u);}
		else if(k==3&&y==4)
			{System.out.println("Your Grades:");
			GradeReportb(u);
			 }
		else if(k==4&&y==4)
			{System.out.println("Your Grades:");
			GradeReporth(u);
			 }
	 }
	 
	 
	 public static void assignmentsm(int u) {
		 if(u==0)
		     System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->Not responded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded."); 
		 assignments(u);
	 }
	 
	 
	 public static void assignmentsc(int u) {
		 if(u==0)
		     System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded ");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded"); 
		 assignments(u);
	 }
	 
	 public static void assignmentse(int u) {
		 if(u==0)
		     System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded ");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded"); 
		 assignments(u);
	 }
	 
	 public static void assignmentsb(int u) {
		 if(u==0)
		     System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded ");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded"); 
		 assignments(u);
	 }
	 
	 public static void assignmentsh(int u) {
		 if(u==0)
		     System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded ");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->Not responded"); 
		 assignments(u);
	 }
	 
	 
	 public static void assignments(int u) {		 		
		 Scanner sv =new Scanner(System.in);
		 System.out.println("Do you want to submit any Assignment?");
		 System.out.println("1- Yes.\n2- No. \n3-Log out ");
		 int a= sv.nextInt();
		 if(a==1) {
			 System.out.println("Please enter Assignment Number:");
		     int e= sv.nextInt();
		     System.out.println("Please enter assignment Solution:");
		     String m=sv.next();
		     System.out.println("Assignment is submitted successfully");
		     Afterfinishing(u);}
		 else if(a==2)
			 Afterfinishing(u);
		 else
			 start();
		 		 
	 }
	 
	 
	 public static void  Registertoanewcourse(int u) {
		 ViewCourse(u,3);
	 }
	 
	 public static void GradeReportm(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->10/10");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/10");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 public static void GradeReportc(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->10/10");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/10");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 public static void GradeReporte(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->10/10");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/10");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 public static void GradeReportb(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->10/10");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/10");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 public static void GradeReporth(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->10/10");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/10");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 
	 public static void Afterfinishing(int u) {
		 Scanner sv =new Scanner(System.in);
		 System.out.println("Do you want to Log out or go to main page?"); 
		 System.out.println("1- Log out. \n2- Main Page.");
		 int y= sv.nextInt();
		 if(y==1)
			 start();
		 else 
			 mainpage(u); 
	 }
}
