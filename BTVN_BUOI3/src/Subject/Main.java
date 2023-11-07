package Subject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Subject> danhSachMonHoc = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("===== Menu Quản Lý Tiết Học =====");
			System.out.println("1. Nhập 1 tiết học mới");
			System.out.println("2. Hiển thị danh sách tiết học");
			System.out.println("3. Sắp xếp môn học theo thời gian kết thúc tăng dần");
			System.out.println("4. Lựa chọn môn học");
			System.out.println("6. Thoát");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				themTietHocMoi();
				break;
			case 2:
				hienThiDanhSachTietHoc();
				break;
			case 3:
				sapXepMonHocTheoThoiGianKetThuc();
				break;
			case 4:
				luaChonMonHoc();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
			}
		}
	}

	private static void themTietHocMoi() {
		System.out.println("Nhập tên môn học: ");
		String subjectName = sc.nextLine();

		System.out.println("Nhập số lượng sinh viên: ");
		int studentCount = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhập thời gian bắt đầu (hh:mm): ");
		String timeStart = sc.nextLine();

		System.out.println("Nhập thời gian kết thúc (hh:mm): ");
		String timeEnd = sc.nextLine();

		String id = "MH" + String.format("%03d", danhSachMonHoc.size() + 1);
		Subject monHocMoi = new Subject(id, subjectName, studentCount, timeStart, timeEnd);
		danhSachMonHoc.add(monHocMoi);
		System.out.println("Tiết học mới đã được thêm thành công.");
	}

	private static void hienThiDanhSachTietHoc() {
		if (danhSachMonHoc.isEmpty()) {
			System.out.println("Danh sách tiết học trống rỗng.");
			return;
		}

		System.out.println("===== Danh Sách Tiết Học =====");
		System.out.printf("%-12s %-24s %-12s %-30s %s%n", "ID", "Môn học", "Số SV", "Thời gian bắt đầu",
				"Thời gian kết thúc");
		for (Subject monHoc : danhSachMonHoc) {
			monHoc.display();
		}
	}

	private static void sapXepMonHocTheoThoiGianKetThuc() {
		if (danhSachMonHoc.isEmpty()) {
			System.out.println("Danh sách tiết học trống rỗng.");
			return;
		}

		Collections.sort(danhSachMonHoc, new Comparator<Subject>() {
			@Override
			public int compare(Subject monHoc1, Subject monHoc2) {
				int gio1 = Integer.parseInt(monHoc1.getTimeEnd().split(":")[0]);
				int phut1 = Integer.parseInt(monHoc1.getTimeEnd().split(":")[1]);

				int gio2 = Integer.parseInt(monHoc2.getTimeEnd().split(":")[0]);
				int phut2 = Integer.parseInt(monHoc2.getTimeEnd().split(":")[1]);

				if (gio1 == gio2) {
					return phut1 - phut2;
				}
				return gio1 - gio2;
			}
		});
		System.out.println("Môn học đã được sắp xếp theo thời gian kết thúc tăng dần.");
	}

	private static void luaChonMonHoc() {
		System.out.println("Nhập thời gian bắt đầu (hh:mm): ");
		String gioBatDau = sc.nextLine();

		System.out.println("Nhập thời gian kết thúc (hh:mm): ");
		String gioKetThuc = sc.nextLine();

		List<Subject> monHocPhuHop = timMonHocPhuHop(gioBatDau, gioKetThuc);

		if (monHocPhuHop.isEmpty()) {
			System.out.println("Không có môn học phù hợp trong khoảng thời gian đã chọn.");
		} else {
			System.out.println("===== Danh Sách Môn Học Phù Hợp =====");
			System.out.printf("%-12s %-24s %-12s %-30s %s%n", "ID", "Môn học", "Số SV", "Thời gian bắt đầu",
					"Thời gian kết thúc");
			for (Subject monHoc : monHocPhuHop) {
				monHoc.display();
			}
		}
	}

	private static List<Subject> timMonHocPhuHop(String gioBatDau, String gioKetThuc) {
		List<Subject> monHocPhuHop = new ArrayList<>();

		for (Subject monHoc : danhSachMonHoc) {
			String start = monHoc.getTimeStart();
			String end = monHoc.getTimeEnd();

			if (compareTime(gioBatDau, start) >= 0 && compareTime(gioKetThuc, end) <= 0) {
				monHocPhuHop.add(monHoc);
			}
		}

		return monHocPhuHop;
	}

	private static int compareTime(String time1, String time2) {
		int gio1 = Integer.parseInt(time1.split(":")[0]);
		int phut1 = Integer.parseInt(time1.split(":")[1]);

		int gio2 = Integer.parseInt(time2.split(":")[0]);
		int phut2 = Integer.parseInt(time2.split(":")[1]);

		if (gio1 == gio2) {
			return phut1 - phut2;
		}
		return gio1 - gio2;
	}
}
