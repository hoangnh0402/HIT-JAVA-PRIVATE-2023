package Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vegetable> danhSachRauCu = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Menu Quản Lý Rau Củ =====");
            System.out.println("1. Nhập loại rau củ mới");
            System.out.println("2. Hiển thị danh sách rau củ");
            System.out.println("3. Sắp xếp rau củ theo giá bán tăng dần");
            System.out.println("4. Nhóm rau củ theo đơn vị tính");
            System.out.println("5. Tìm kiếm rau củ theo tên");
            System.out.println("6. Thoát");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    themRauCuMoi();
                    break;
                case 2:
                    hienThiDanhSachRauCu();
                    break;
                case 3:
                    sapXepRauCuTheoGiaBan();
                    break;
                case 4:
                    nhomRauCuTheoDonViTinh();
                    break;
                case 5:
                    timKiemRauCuTheoTen();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void themRauCuMoi() {
        System.out.println("Nhập ID: ");
        String id = sc.nextLine();

        for (Vegetable rauCu : danhSachRauCu) {
            if (rauCu.getId().equals(id)) {
                System.out.println("ID đã tồn tại. Không thể thêm rau củ mới.");
                return;
            }
        }

        System.out.println("Nhập tên rau củ: ");
        String ten = sc.nextLine();

        System.out.println("Nhập đơn vị tính: ");
        String donViTinh = sc.nextLine();

        System.out.println("Nhập số lượng đã bán: ");
        int quantinySold = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập giảm giá (%): ");
        int sale = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập giá bán: ");
        double price = sc.nextDouble();
        sc.nextLine();

        Vegetable rauCuMoi = new Vegetable(id, ten, donViTinh, quantinySold, sale, price);
        danhSachRauCu.add(rauCuMoi);
        System.out.println("Rau củ mới đã được thêm thành công.");
    }

    private static void hienThiDanhSachRauCu() {
        if (danhSachRauCu.isEmpty()) {
            System.out.println("Danh sách rau củ trống rỗng.");
            return;
        }

        System.out.println("===== Danh Sách Rau Củ =====");
        System.out.printf("%-12s %-25s %-12s %-18s %-8s %-15s  %-20s%n", "ID", "Tên", "Đơn vị tính", "Số lượng đã bán", "Giảm giá (%)", "Giá bán", "Doanh thu");
        for (Vegetable rauCu : danhSachRauCu) {
            rauCu.display();
        }
    }

    private static void sapXepRauCuTheoGiaBan() {
        if (danhSachRauCu.isEmpty()) {
            System.out.println("Danh sách rau củ trống rỗng.");
            return;
        }

        Collections.sort(danhSachRauCu, Comparator.comparing(Vegetable::getPrice));
        System.out.println("Rau củ đã được sắp xếp theo giá bán tăng dần.");
    }

    private static void nhomRauCuTheoDonViTinh() {
        if (danhSachRauCu.isEmpty()) {
            System.out.println("Danh sách rau củ trống rỗng.");
            return;
        }

        Collections.sort(danhSachRauCu, Comparator.comparing(Vegetable::getUnit).thenComparing(Vegetable::getPrice));
        
        System.out.println("Rau củ đã được nhóm theo đơn vị tính và sắp xếp theo giá bán tăng dần.");
    }

    private static void timKiemRauCuTheoTen() {
        System.out.println("Nhập tên rau củ cần tìm: ");
        String tenCanTim = sc.nextLine();

        System.out.println("===== Kết quả tìm kiếm =====");
        System.out.printf("%-12s %-25s %-12s %-18s %-8s %-15s  %-20s%n", "ID", "Tên", "Đơn vị tính", "Số lượng đã bán", "Giảm giá (%)", "Giá bán", "Doanh thu");
        for (Vegetable rauCu : danhSachRauCu) {
            if (rauCu.getName().contains(tenCanTim)) {
                rauCu.display();
            }
        }
    }
}
