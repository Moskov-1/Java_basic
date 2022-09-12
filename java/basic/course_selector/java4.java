import java.util.Scanner;
class MyCourse{
	private String courseName;
	MyCourse(String s){
		courseName =s;
	}
}
class NameISNullException extends Exception{
	NameISNullException(String s){
		super(s);
	}
}
class NotStudentNameException extends Exception {
	NotStudentNameException(String s){
		super(s);
	}
}
class RedundentCourseException extends Exception{
	RedundentCourseException(String s){
		super(s);
	}
}
class courseException extends Exception{
	courseException(String s){
		super(s);
	}
}
class DefaultAmountException extends Exception{
	DefaultAmountException(String s){
		super(s);
	}
}
class NegativeNumberException extends Exception{
	NegativeNumberException(String s){
		super(s);
	}
}
class Students{
	private String studentName;
	private int roll;
	Students(String s,int roll){
		studentName = s;
		this.roll = roll;
	}
	void getStudentInfo(){
		System.out.println("roll: "+roll+"   "+studentName);
	}
}
class java4{
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Enter a whole number");
			sc.next();
		}
		
		return sc.nextInt();
	}
	public boolean check(String s,String arr[]){
		int size = arr.length;
		for(int i=0;i<size;i++){
			if(s.equalsIgnoreCase(arr[i])){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		java4 obj1 = new java4();
		String[] availableCourses = {"Math","English","Bangla","ICT","Science"};
		Scanner scan = new Scanner(System.in);
		String cName,sName="";
		int rolls=1000,cNumber=-1,sNumber=-1;
		System.out.println("Hello! please enter the number of students in class");
		while(sNumber<0){
			try{
				sNumber = scan.nextInt();
			}catch(Exception ex){
				System.out.println("Exception: "+ex);
				sNumber = java4.getInt();
			}
			if(sNumber<0){
				try{
					throw new NegativeNumberException("please enter a positive number");
				}catch(Exception ex){
					System.out.println("Exception: "+ex);
				}
			}
		}
		Students[] student = new Students[sNumber];
		System.out.println("The available courses for this class are :");
		int i=1;
		for(String m : availableCourses){
			System.out.println("no."+i+" "+m);
			i++;
		}
		System.out.println("Enter the number of COURSES for the class.\nMaximum 5 courses");
		while(cNumber<0){
			try{	
				cNumber = scan.nextInt();
			}catch(Exception ex){
				System.out.println("Exception: "+ex);
				cNumber = scan.nextInt();
			}if(cNumber<0){
				try{
					throw new NegativeNumberException("please enter a positive number");
				}catch(Exception ex){
					System.out.println("Exception: "+ex);
				}
			}if(cNumber>5){
				try{
					throw new DefaultAmountException("Maximum 5 courses available ");
				}catch(Exception ex){
					System.out.println("Exception: "+ex);
					cNumber=-1;
				}
			}
		}
		MyCourse[] course = new MyCourse[cNumber];
		System.out.println("Please enter the names of the courses");
		i=1;
		cName=scan.nextLine();
		String arr[] = new String[cNumber];
		boolean validCourse;
		CL: while( i<=cNumber ){
			validCourse=false;
			System.out.println(i+".No course: ");
			cName= scan.nextLine();
			for(String s: availableCourses){
				if(cName.equalsIgnoreCase(s)){
					validCourse = true;
					if(obj1.check(cName,arr)){
						try{
							throw new RedundentCourseException("Already in input");
						}catch(Exception ex){
							System.out.println("Exception: "+ex);
							
							continue CL;
						}
					}
					arr[i-1]=cName;
				}
			}
			if(!validCourse) {
					try{
						throw new courseException("not valid course{Math,Bangla,English,ICT,Science}");
					}catch(Exception ex){
						System.out.println("Exception: "+ex);
						continue CL;
					}
				}
			
			i++;
		}
		System.out.print("\033[H\033[2J");
		System.out.flush();
		//to continue from course --- student inputs --- marks ---- display
		nextL: for(int j=0;j<sNumber;j++){
			System.out.println("Enter name of "+(j+1)+" student");
			String input = scan.nextLine();
			rolls++;
			student[j] = new Students(input,rolls);
			System.out.print("\033[H\033[2J");
			System.out.flush();
			boolean test=false;
			char toTest[] = input.toCharArray(); 
			for(char c:toTest){
				if(!Character.isLetter(c) & c!=32 	){
					try{
						throw new NotStudentNameException("not a valid name");
					}catch(Exception ex){
						System.out.println("Exception: "+ex);
						j--;
						continue nextL;
					}
				}
			}
			if(input.isEmpty()){
				try{
					throw new NameISNullException("No name was entered .please try again");
				}catch(Exception ex){
					System.out.println("Exception: "+ex);
					j--;continue nextL;
				}
			}
						
		}
		System.out.println("----the courses are----");
		int noOfcourse=1;
		for(String m : arr){
			System.out.println(noOfcourse+"   "+m);
			noOfcourse++;
		}
		System.out.println("-----STUDENT INFO-----");
		for(Students m : student){
			m.getStudentInfo();
		} 
	}
}
