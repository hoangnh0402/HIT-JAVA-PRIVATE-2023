package Quan_Li_Sinh_Vien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Classroom {

	protected String class_id;
	protected String course_id;
	protected double course_fee;
	protected String creationDate;
	protected int maxStudent;
	protected List<Student> students;

	// Constructor không tham số
	public Classroom() {

	}

	// Constructor có tham số
	public Classroom(String class_id, String course_id, double course_fee, String creationDate, int maxStudent) {

		this.class_id = class_id;
		this.course_id = course_id;
		this.course_fee = course_fee;
		this.creationDate = creationDate;
		this.maxStudent = maxStudent;
		this.students = new ArrayList<>();
	}

	// Getter and setter
	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public double getCourse_fee() {
		return course_fee;
	}

	public void setCourse_fee(double course_fee) {
		this.course_fee = course_fee;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public int getMaxStudent() {
		return maxStudent;
	}

	public void setMaxStudent(int maxStudent) {
		this.maxStudent = maxStudent;
	}

	// Other methods
	public String toString() {
		return "Classroom [class_id=" + class_id + ", course_id=" + course_id + ", course_fee=" + course_fee
				+ ", creationDate=" + creationDate + ", maxStudent=" + maxStudent + "]";
	}

	public double totalFee() {
		return course_fee * maxStudent;
	}

	public void addStudent(Student student) {
		if (students.size() < maxStudent) {
			students.add(student);
		}
	}
	public void generateRandomStudents(int n) {
        String[] studentFullNames = {"Nguyễn Huy Hoàng", "Trần Tuấn Anh", "Lương Thái Sơn", "Đào Duy Chiến", "Nguyễn Thành Đạt", "Nguyễn Diệu Linh"};
        String[] addresses = {"Phú Thọ", "Nghệ An", "Hải Phòng", "Thanh Hóa", "Hải Dương", "Phú Thọ"};
        String[] zaloPhones = {"0123", "0456", "07897", "023545", "0402", "2004", "080604", "13456", "9766354"};

        for (int i = 0; i < n; i++) {
            Student student = new Student(class_id, course_id, course_fee, creationDate, maxStudent,
                    "sv" + i + 1, studentFullNames[i % studentFullNames.length],
                    addresses[i % addresses.length], zaloPhones[i % zaloPhones.length]);
            addStudent(student);
        }
    }
	public static void printStudent(List<Student> list) {
		for (Student p : list) {
			System.out.println(p);
		}
	}

	public List<Student> getStudents() {
		return students;
	}

	public void printClassStatistics() {
		System.out.println("Số lượng thống kê trong từng lớp học:");
		for (Student student : students) {
			System.out.println("Lớp " + class_id + ": " + students.size() + " học viên");
		}
	}

	public void sortClassListByName() {
		Collections.sort(students, Comparator.comparing(Student::getStudent_fullName, String.CASE_INSENSITIVE_ORDER));
	}

	public Student searchStudentByName(String searchName) {
		for (Student student : students) {
			if (student.getStudent_fullName().equalsIgnoreCase(searchName)) {
				return student; // Trả về học viên nếu tên trùng khớp (không phân biệt chữ hoa chữ thường)
			}
		}
		return null; // Trả về null nếu không tìm thấy học viên có tên trùng khớp
	}
}
