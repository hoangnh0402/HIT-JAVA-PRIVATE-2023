package Bai_2;

import java.util.List;

public interface StudentService {
	void addStudent(Student student);

	void deleteStudent(int id);

	List<Student> searchStudent(String name);

	List<Student> sortedStudent();

	void showAllStudents();
}
