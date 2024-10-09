import java.util.Scanner;

public class hinhhoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Nhập thông tin hình vuông");
            System.out.println("2. Thoát");
            System.out.print("Chọn: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    HinhVuong hinhVuong = HinhVuong.nhapThongTin();
                    System.out.println("\nThông tin ");
                    hinhVuong.hienThiThongTin();
                } else if (choice == 2) {
                    System.out.println("finished");
                    break;
                } else {
                    System.out.println(" sai chọn lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập đúng so");
            }
        }

        scanner.close();
    }

}
