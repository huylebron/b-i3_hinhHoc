import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) throws IllegalArgumentException {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng ko am va phai lon hon 0");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public void hienThiThongTin() {
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }

    public static HinhChuNhat nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        double dai, rong;
        while (true) {
            try {
                System.out.print("Nhập chiều dài: ");
                dai = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập chiều rộng: ");
                rong = Double.parseDouble(scanner.nextLine());
                return new HinhChuNhat(dai, rong);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
}