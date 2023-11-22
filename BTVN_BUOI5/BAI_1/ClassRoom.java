package BAI_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassRoom {
	public static ArrayList<Student> students = new ArrayList<>();

	public static void test() {
		students.add(new Student("A", 19, new Address("B", "C", "D"), "KTPM01", 3.0f));
		students.add(new Student("E", 19, new Address("F", "G", "H"), "KTPM01", 3.1f));
		students.add(new Student("J", 19, new Address("K", "L", "M"), "KTPM01", 3.2f));
	}

	public static void sortByGpa() {
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student sv1, Student sv2) {
				float ans = sv1.getGpa() - sv2.getGpa();
				return Float.compare(ans, 0);
			}
		});
	}

	public static void inputList() {
		for (int i = 1; i <= 555; i++) {
			Student student = new Student();
			student.input();
			System.out.println();
			students.add(student);
			if (student.getId() == 555) {
				break;
			}
		}
	}
	
	public static void outputList() {
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-5s | %-20s | %-20s | %-10s | %-5s | %-10s | %-5s |\n", "Name", "Age", "Commune",
                "District", "City", "ID", "Class", "GPA");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
        for (Student student : students) {
            student.output();
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
    }

    public static boolean removeByID(Scanner scan, Student student, int removeID) {
        if (student.getId() == removeID) {
            return true;
        }
        return false;
    }

	public static void main(String[] args) {
		test();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Nhập thông tin sinh viên");
			System.out.println("2. In ra thông tin sinh viên");
			System.out.println("3. Sắp xếp danh sách sinh viên theo điểm GPA");
			System.out.println("4. Xóa sinh viên theo mã SV");
			System.out.println("5. Thoát chương trình");

			System.out.print("Chọn chức năng (1-5): ");
			int luaChon = sc.nextInt();
			
			  switch (luaChon) {
              case 1: {
                  inputList();
                  break;
              }
              case 2: {
                  outputList();
                  break;
              }
              case 3: {
                  sortByGpa();
                  System.out.println("Sorted");
                  break;
              }
              case 4: {
                  System.out.print("Input ID whose student you want to remove: ");
                  int removeID = sc.nextInt();
                  sc.nextLine();
                  for (int i = 0; i < students.size(); i++) {
                      if (removeByID(sc, students.get(i), removeID) == true) {
                          students.remove(students.get(i));
                      }
                  }
                  break;
              }

              case 5: {
                  sc.close();
                  System.out.println("Exited");
                  return;
              }

              default:
                  break;
          }
		}
	}
}
