import java.util.Scanner;

class HinhVuong extends HinhChuNhat {
    public HinhVuong(double canh) throws IllegalArgumentException {
        super(canh, canh);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Cạnh: " + super.getChieuDai());
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }

    public static HinhVuong nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập cạnh : ");
                double canh = Double.parseDouble(scanner.nextLine());
                return new HinhVuong(canh);
            } catch (NumberFormatException e) {
                System.out.println(" sai nhap lại.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}