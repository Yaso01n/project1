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
	 if(username[0].equals(s) && password[0]==d ) {
	 System.out.println("logging in successfully \n");
	 mainpage(0);
	 }
	 else if(username[1].equals(s) && password[1]==d ) {
		 System.out.println("logging in successfully \n");
		 mainpage(1);
		 }
	 else if(username[2].equals(s) && password[2]==d ) {
		 System.out.println("logging in successfully \n");
		 mainpage(2);
		 }
	 else if(username[3].equals(s) && password[3]==d ) {
		 System.out.println("logging in successfully \n");
		 mainpage(3);
		 }
	 else if(username[4].equals(s) && password[4]==d ) {
		 System.out.println("logging in successfully \n");
		 mainpage(4);
		 }
	 else
	 {
     System.out.println("Invalid user name or password,please try again. \n");
     start();
	 }
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
		 System.out.println("\n 1-View Course. \n 2-Step back. \n 3-Log out.");
		 int x=sx.nextInt();
		 if(x==1)
		    ViewCourse(u,2);
		 else if(x==2)
			 mainpage(u);
		 else if(x==3)
			 start();
	 }
	 
	 public static void ViewCourse(int u ,int y) {
		 Scanner sv =new Scanner(System.in);
		 String coursecode[] = {"MTH1212","CMP1231","ELC1213","BMP6143","CHE7098"};
		 System.out.println("Please enter course code:"); 
		 String x=sv.next();
		 if(coursecode[0].equals(x))
			 code(0,u,y);
		 else   if(coursecode[1].equals(x))
			 code(1,u,y);
		 else   if(coursecode[2].equals(x))
			 code(2,u,y);
		 else   if(coursecode[3].equals(x))
			 code(3,u,y);
		 else	if(coursecode[4].equals(x))
				code(4,u,y);
		 else {
		 System.out.println("Course not found. \n1-Try again. \n2-Log out.");
		 int p=sv.nextInt();
		 if(p==1)
		 mainpage(u);
		 else if(p==2)
			 start();
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
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-Lec 3.pdf");
			 System.out.println("Assignments:");
		assignmentsc(u);}
		else if(k==2&&y==2)
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Sheet1.pdf \n3-Lec 2.pdf");
			 System.out.println("Assignments:");
		assignmentse(u);}
		else if(k==3&&y==2)
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-sheet2.pdf");
			 System.out.println("Assignments:");
		assignmentsb(u);}
		else if(k==4&&y==2)
			{System.out.println("Materials:");
			System.out.println("1-Lec 1.pdf \n2-Lec 2.pdf \n3-Lec 3.pdf \n4-sheet3.pdf");
			 System.out.println("Assignments:");
		assignmentsh(u);}
		
		
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
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded."); 
		 assignments(u);
	 }
	 
	 public static void GradeReportm(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->15/15 \n 2- Task 2 -->Not graded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/15. \n 2- Task 2 -->10/20");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/20");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded yet. \n 2- Task 2 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->14/15. \n 2- Task 2 -->Not graded.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 public static void assignmentsc(int u) {
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
	 
	 public static void GradeReportc(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->Not graded yet. \n 2- Task 2 -->10/10");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/10");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 public static void assignmentse(int u) {
		 if(u==0)
		     System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done \n 3-Task 3 -->done ");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done. \n 3-Task 3 -->Not responded");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done"); 
		 assignments(u);
	 }
	 
	 public static void GradeReporte(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded. \n 3-Task 3 -->9/10");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->10/10 \n 3-Task 3 -->Not graded.");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/10 \n 3-Task 3 -->7/10");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->8/10 \n 3-Task 3 -->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded. \n 3-Task 3 -->Not graded yet.");
		 Afterfinishing(u);	 		
	 }
	 
	 
	 public static void assignmentsb(int u) {
		 if(u==0)
		     System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->done \n 3-Task 3 -->Not responded ");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not responded. \n 2- Task 2 -->Not responded. \n 3-Task 3 -->done.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->done. \n 2- Task 2 -->done. \n 3-Task 3 -->Not responded"); 
		 assignments(u);
	 }
	 
	 public static void GradeReportb(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded. \n3-Task 3 --> 10/17");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->Not graded yet.  \n3-Task 3 --> Not graded.");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->19/25  \n3-Task 3 -->Not graded. ");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded.  \n3-Task 3 --> 15/17");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->24/25  \n3-Task 3 --> Not graded.");
		 Afterfinishing(u);	 		
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
	 
	 public static void GradeReporth(int u) {
		 if(u==0)
			 System.out.println(" 1- Task 1 -->5/10 \n 2- Task 2 -->Not graded. \n Task 3-->Not graded yet.");
		 else if(u==1)
			 System.out.println(" 1- Task 1 -->9/10. \n 2- Task 2 -->10/20 \n Task 3-->Not graded.");
		 else if(u==2)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->7/20 \n Task 3-->Not graded.");
		 else if(u==3)
			 System.out.println(" 1- Task 1 -->Not graded. \n 2- Task 2 -->Not graded. \n Task 3-->Not graded.");
		 else if(u==4)
			 System.out.println(" 1- Task 1 -->4/10. \n 2- Task 2 -->Not graded. \n Task 3-->Not graded.");
		 Afterfinishing(u);	 		
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
		 Scanner sv =new Scanner(System.in);
		 String coursecode[] = {"MTH2245","CTP1231"};
		 System.out.println("Please enter course code:"); 
		 String x=sv.next();
		 if(coursecode[0].equals(x) || coursecode[1].equals(x))
		 {
			 System.out.println("Registered correctly.");
		     Afterfinishing(u);	 
	      }
		 else {
		 System.out.println("Course not found. \n1-Try again. \n2-Log out.");
		 int p=sv.nextInt();
		 if(p==1)
		 mainpage(u);
		 else if(p==2)
			 start();
		 }
		 
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
