package Bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentServiceImpl implements StudentService {
	private List<Student> students = new ArrayList<>();

	@Override
	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public void deleteStudent(int id) {
		students.removeIf(student -> student.getId() == id);
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getName().contains(name)) {
				result.add(student);
			}
		}
		return result;
	}

	@Override
	public List<Student> sortedStudent() {
		List<Student> sortedStudents = new ArrayList<>(students);
		Collections.sort(sortedStudents, (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
		return sortedStudents;
	}

	@Override
	public void showAllStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
