package Classes;
public class Student{
	private String name;
	private String id;
	private String program;
	private String session;
	public Student(){};
	public Student(String name,String id, String program,String session){
		this.name = name;
		this.id = id;
		this.program = program;
		this.session = session;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setProgram(String program){
		this.program = program;
	}
	public String getProgram(){
		return program;
	}
	public void setSession(String session){
		this.session = session;
	}
	public String getSession(){
		return session;
	}
}