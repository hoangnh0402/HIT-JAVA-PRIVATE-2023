package Quan_Li_Sinh_Vien;

import java.util.List;

public interface ABCTrainningService {
	double totalFee();
	void addStudent(Student student);
	void generateRandomStudents(Classroom classroom,int numStudents);
	void printStudent(List<Student> list);
	List<Student> getStudents();
	void printClassStatistics();
	void sortClassListByName();
	void searchStudentByName(String searchName);
}
