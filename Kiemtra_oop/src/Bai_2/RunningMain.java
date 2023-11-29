package Bai_2;
import java.util.Scanner;
import java.util.List;
public class RunningMain {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Thêm sinh viên");
			System.out.println("2. Xóa sinh viên");
			System.out.println("3. Tìm sinh viên");
			System.out.println("4. Sắp xếp danh sách sinh viên");
			System.out.println("5. Hiển thị danh sách sinh viên");
			System.out.println("0. Thoát");

			System.out.print("Chọn chức năng: ");
			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:	
				System.out.print("Nhập tên sinh viên: ");
				String name = sc.nextLine();
				System.out.print("Nhập tuổi sinh viên: ");
				short age = sc.nextShort();
				sc.nextLine(); 
				System.out.print("Nhập địa chỉ sinh viên (quận): ");
				String district = sc.nextLine();
				System.out.print("Nhập địa chỉ sinh viên (thành phố): ");
				String city = sc.nextLine();
				System.out.print("Nhập điểm số sinh viên: ");
				double score = sc.nextDouble();
				sc.nextLine(); 

				Address address = new Address(district, city);
				Student student = new Student(name, age, address, score);
				studentService.addStudent(student);
				System.out.println("Sinh viên đã được thêm vào danh sách.");
				break;
			case 2:
				System.out.print("Nhập ID sinh viên cần xóa: ");
				int idToDelete = sc.nextInt();
				sc.nextLine(); 
				studentService.deleteStudent(idToDelete);
				System.out.println("Sinh viên có ID " + idToDelete + " đã được xóa.");
				break;
			case 3:
				System.out.print("Nhập tên sinh viên cần tìm: ");
				String nameToSearch = sc.nextLine();

				List<Student> searchResult = studentService.searchStudent(nameToSearch);
				System.out.println("Kết quả tìm kiếm:");
				for (Student students : searchResult) {
				    System.out.println(students);
				}
				break;
			case 4:
				List<Student> sortedStudents = studentService.sortedStudent();
				System.out.println("Danh sách sinh viên sau khi sắp xếp:");
				for (Student studenta : sortedStudents) {
				    System.out.println(studenta);
				}
				break;
			case 5:
				System.out.println("Danh sách sinh viên:");
				studentService.showAllStudents();
				break;
			case 0:
				System.out.println("Kết thúc chương trình.");
				System.exit(0);
				break;
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}
}
