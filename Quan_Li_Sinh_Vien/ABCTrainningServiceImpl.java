package Quan_Li_Sinh_Vien;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ABCTrainningServiceImpl implements ABCTrainningService {
	private List<Student> students;

	// Constructor
	public ABCTrainningServiceImpl(List<Student> students) {
		if (students != null) {
			this.students = students;
		} else {
			this.students = new ArrayList<>();
		}
	}

	@Override
	public double totalFee() {
		// Assuming course_fee and maxStudent are properties of a specific class, adjust
		// accordingly
		return students.get(0).getCourse_fee() * students.get(0).getMaxStudent();
	}

	@Override
	public void addStudent(Student student) {
		if (students.size() < students.get(0).getMaxStudent()) {
			students.add(student);
		}
	}

	@Override
	public void generateRandomStudents(Classroom classroom, int numStudents) {
		String[] studentFullNames = { "Nguyễn Huy Hoàng", "Trần Tuấn Anh", "Lương Thái Sơn", "Đào Duy Chiến",
				"Nguyễn Thành Đạt", "Nguyễn Diệu Linh" };
		String[] addresses = { "Phú Thọ", "Nghệ An", "Hải Phòng", "Thanh Hóa", "Hải Dương", "Phú Thọ" };
		String[] zaloPhones = { "0123", "0456", "07897", "023545", "0402", "2004", "080604", "13456", "9766354" };

		for (int i = 0; i < numStudents; i++) {
			Student student = new Student(classroom.getClass_id(), classroom.getCourse_id(), classroom.getCourse_fee(),
					classroom.getCreationDate(), classroom.getMaxStudent(), "sv" + (i + 1), "Student " + (i + 1),
					"Address " + (i + 1), "Zalo " + (i + 1));
			addStudent(student);
		}
	}

	@Override
	public void printStudent(List<Student> list) {
		if (list != null) {
			for (Student student : list) {
				System.out.println(student);
			}
		} else {
			System.out.println("Danh sách sinh viên là null.");
		}
	}

	@Override
	public List<Student> getStudents() {
		return students;
	}

	@Override
	public void printClassStatistics() {
		System.out.println("Số lượng thống kê trong từng lớp học:");
		for (Student student : students) {
			System.out.println("Lớp " + student.getClass_id() + ": " + students.size() + " học viên");
		}
	}

	@Override
	public void sortClassListByName() {
		Collections.sort(students, Comparator.comparing(Student::getStudent_fullName, String.CASE_INSENSITIVE_ORDER));
	}

	@Override
	public void searchStudentByName(String searchName) {
		for (Student student : students) {
			if (student.getStudent_fullName().equalsIgnoreCase(searchName)) {
				System.out.println("Found student: " + student);
				return;
			}
		}
		System.out.println("Student with name '" + searchName + "' not found.");
	}
}
