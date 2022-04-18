package Classes;
import java.util.*;
public class Registration extends Student{
	String studentProgram[] = new String[200];
	private String cseCoursesForSlot1[] = new String[]{"Object oriented Analysis and Design",
	"Software Quality and Testing",
	"Advance Computer Network",
	"Network Security",
	"Data warehouse and Data Mining",
	"Advance Database Management",
	"Linear Programming"
	};
	private String cseCoursesForSlot2[] = new String[]{"optoelectronic Devices",
	"Cellular Mobile Comminucation",
	"Microwave Engineering",
	"Robotics Engineering",
	"Software Engineering",
	"Introduction to Animation"
	};
	private String cseCoursesForSlot3[] = new String[]{"Data Comminucation",
	"Biomechanics Devices",
	"Computer Graphics",
	"Principles of Economics",
	"Digital Signal Processing"
	};
	private String cseCoursesForSlot4[] = new String[]{"Introduction to Engineering Studies",
	"Physics",
	"Chemistry",
	"Basic Mechanical Engineering",
	"Algorithm",
	"Data Structure"	
	};
	private String eeeCoursesForSlot1[]=new String[]{
		"Electrical Properties",
		"Power System Analysis",
		"Principle of Comminucation",
		"Analog Electronics"
	};
private String eeeCoursesForSlot2[] = new String[]{
	"Electric Circuit",
	"Electric Devices",
	"Electric Mechanics",
	"Engineering Shop"
};
private String eeeCoursesForSlot3[] = new String[]{
	"Basic Mechanical Engineering",
	"English Writting Skills",
	"Bangladesh Studies",
	"Principle of Accounting"
};
private String eeeCoursesForSlot4[] = new String[]{
	"Introduction to Enginnering",
	"Integral Calculus",
	"Physics",
	"Chemistry"
};
	boolean flag = false;
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter Your Program:");
	
	Scanner sc = new Scanner(System.in);
	public void setStudentProgram(Student s){
		for(int i=0;i<studentProgram.length;i++){
			if(studentProgram[i]==null){
				studentProgram[i]= s.getId();
				//System.out.println("Student Id: "+ s.getId());
				break;
			}
		}
	}
	public void showAvailableCoursesForCseSlot1(){
			for(int i=0;i<cseCoursesForSlot1.length;i++){
				System.out.println((i+1)+"."+" "+cseCoursesForSlot1[i]);
			}	
		}
		//Cse slot for 2
	public void showAvailableCoursesForCseSlot2(){
			for(int i=0;i<cseCoursesForSlot2.length;i++){
				System.out.println((i+1)+"."+" "+cseCoursesForSlot2[i]);
			}	
		}
		//cse slot for 3
	public void showAvailableCoursesForCseSlot3(){
			for(int i=0;i<cseCoursesForSlot3.length;i++){
				System.out.println((i+1)+"."+" "+cseCoursesForSlot3[i]);
			}	
		}	
	public void showAvailableCoursesForCseSlot4(){
			for(int i=0;i<cseCoursesForSlot4.length;i++){
				System.out.println((i+1)+"."+" "+cseCoursesForSlot4[i]);
			}	
		}
	public void showAvailableCoursesForEeeSlot1(){
			for(int i=0;i<eeeCoursesForSlot1.length;i++){
				System.out.println((i+1)+"."+" "+eeeCoursesForSlot1[i]);
			}	
		}
		public void showAvailableCoursesForEeeSlot2(){
			for(int i=0;i<eeeCoursesForSlot2.length;i++){
				System.out.println((i+1)+"."+" "+eeeCoursesForSlot2[i]);
			}	
		}
		public void showAvailableCoursesForEeeSlot3(){
			for(int i=0;i<eeeCoursesForSlot3.length;i++){
				System.out.println((i+1)+"."+" "+eeeCoursesForSlot3[i]);
			}	
		}
		public void showAvailableCoursesForEeeSlot4(){
			for(int i=0;i<eeeCoursesForSlot4.length;i++){
				System.out.println((i+1)+"."+" "+eeeCoursesForSlot4[i]);
			}	
		}
		/*
		if(flag){
			System.out.println("CSE is selected");
		}
		*/
	//}
	 
	
}