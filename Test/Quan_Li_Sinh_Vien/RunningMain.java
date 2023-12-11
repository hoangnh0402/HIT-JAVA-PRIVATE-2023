package Quan_Li_Sinh_Vien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunningMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo danh sách lớp học
        List<Classroom> classrooms = new ArrayList<>();

        // Tạo 3 lớp học
        classrooms.add(new Classroom("IT101", "Java Programming", 1000.0, "2023-01-01", 20));
        classrooms.add(new Classroom("IT102", "Web Development", 1200.0, "2023-02-01", 15));
        classrooms.add(new Classroom("IT103", "Data Science", 1500.0, "2023-03-01", 25));

        // Sinh ngẫu nhiên danh sách học viên cho từng lớp
        for (Classroom classroom : classrooms) {
            classroom.generateRandomStudents(20);
        }

        // In danh sách từng lớp học
        System.out.println("Danh sách lớp học:");
        for (Classroom classroom : classrooms) {
            System.out.println("Lớp " + classroom.getClass_id() + ":");
            classroom.printStudent(classroom.getStudents());
        }

        // In số lượng thống kê trong từng lớp học
        System.out.println("\nSố lượng thống kê trong từng lớp học:");
        for (Classroom classroom : classrooms) {
            System.out.println("Lớp " + classroom.getClass_id() + ": " + classroom.getStudents().size() + " học viên");
        }

        // Sắp xếp danh sách lớp theo tên
        System.out.println("\nDanh sách lớp học sau khi sắp xếp theo tên:");
        for (Classroom classroom : classrooms) {
            classroom.sortClassListByName();
            System.out.println("Lớp " + classroom.getClass_id() + ":");
            classroom.printStudent(classroom.getStudents());
        }

        // Yêu cầu người dùng nhập tên để tìm kiếm
        System.out.print("\nNhập tên học viên cần tìm kiếm: ");
        String searchName = sc.nextLine();

        // Thực hiện tìm kiếm học viên theo tên trong từng lớp học
        for (Classroom classroom : classrooms) {
            Student foundStudent = classroom.searchStudentByName(searchName);

            // Hiển thị kết quả tìm kiếm
            if (foundStudent != null) {
                System.out.println("\nHọc viên có tên '" + searchName + "' trong lớp " + classroom.getClass_id() + ":");
                System.out.println(foundStudent);
            } else {
                System.out.println("\nKhông tìm thấy học viên có tên '" + searchName + "' trong lớp " + classroom.getClass_id() + ".");
            }
        }
    }
}
