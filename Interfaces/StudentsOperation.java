package Interfaces;
import Classes.*;
public interface StudentsOperation{
	void insertStudent(Student s);
	void removeStudent(Student s);
	Student getStudent(String name);
	void ShowAllStudents();
}
