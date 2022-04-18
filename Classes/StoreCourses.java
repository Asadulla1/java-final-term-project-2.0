package Classes;
import java.util.*;
public class StoreCourses extends Registration{
	Scanner sc = new Scanner(System.in);
	String storeCourses[] = new String[3];
	public void setCourses(){
		System.out.println("You Can take 3 course at a time.Type Your Preferred courses Name:");
		for(int i=0;i<3;i++){
            String Courses = sc.nextLine();
            storeCourses[i] = Courses;
        }
	}
	
	public void showRegisteredCourses (){
        System.out.println("*********************Your Selected Courses ********************");
        for(int i=0;i<storeCourses.length;i++){
            System.out.println((i+1)+". "+storeCourses[i]);
        }
		System.out.println("***************************************************************");
    }
	
}