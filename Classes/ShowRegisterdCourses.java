package Classes;
public class ShowRegisterdCourses extends Registration2{
	public void showRegistration(){
		for(int i=0;i<setRegistration.length;i++){
            if(setRegistration[i] != null){
                System.out.println(setRegistration[i]);
            }
            else {
                break;
            }
        }
	}
}