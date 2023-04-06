import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVienIT[] sinhVienITS = new SinhVienIT[500];
        SinhVienBiz[] sinhVienBizs = new SinhVienBiz[500];
        int chose;
        do {

            System.out.println("======CHÀO MỪNG BẠN ĐẾN VỚI TRANG QUẢN LÝ CỦA SINH VIÊN======");
            System.out.println("Mời bạn chọn chức năng thêm thông tin :\n " +
                    "1. Thêm thông tin sinh viên IT. \n " +
                    "2. Thêm thông tin sinh viên Biz. \n " +
                    "3. Hiện thị thông tin Bác sỹ. \n " +
                    "4. Hiển thị thông tin Bệnh nhân. \n " +
                    "5. Thoát ");

            chose = Integer.parseInt(sc.nextLine());
            if (chose == 5) break;
            while (chose <= 0 || 4 < chose) {
                System.out.println("Bạn chỉ được chọn từ 1 đến 4. \n " +
                        "Mời bạn chọn lại :  ");
                chose = Integer.parseInt(sc.nextLine());

            }

            switch (chose) {
                case 1:
                    System.out.println("Mời bạn nhập số lượng sinh viên cần thêm thông tin: ");
                    int numSVIT = Integer.parseInt(sc.nextLine());
                    while (numSVIT < 0) {
                        System.out.println(" Hãy nhập số >0 " +
                                "Mời bạn nhập lại : ");
                        numSVIT = Integer.parseInt(sc.nextLine());
                    }
                    for (int i = 0; i < numSVIT; i++) {

                        System.out.println("Mời bạn nhập Tên SV thứ " + i + 1 + " :  ");
                        String name = sc.nextLine();

                        System.out.println("Mời bạn nhập Ngành học : ");
                        String majors = sc.nextLine();

                        System.out.println("Mời bạn nhập điểm số JAVA: ");
                        double javascores = Double.parseDouble(sc.nextLine());

                        System.out.println("Mời bạn nhập điểm số HTML: ");
                        double htmlscores = Double.parseDouble(sc.nextLine());

                        System.out.println("Mời bạn nhập điểm số CSS: ");
                        double cssscores = Double.parseDouble(sc.nextLine());

                        SinhVienIT sinhVienIT = new SinhVienIT(name, majors, javascores, htmlscores, cssscores);
                        sinhVienITS[i] = sinhVienIT;
                    }
                    break;
                case 2:
                    System.out.println("Mời bạn nhập số lượng sinh viên cần thêm thông tin: ");
                    int numSVBiz = Integer.parseInt(sc.nextLine());
                    while (numSVBiz < 0) {
                        System.out.println(" Hãy nhập số >0 " +
                                "Mời bạn nhập lại : ");
                        numSVBiz = Integer.parseInt(sc.nextLine());
                    }
                    for (int i = 0; i < numSVBiz; i++) {

                        System.out.println("Mời bạn nhập Tên SV thứ " + i + 1 + " :  ");
                        String name = sc.nextLine();

                        System.out.println("Mời bạn nhập Ngành học : ");
                        String majors = sc.nextLine();

                        System.out.println("Mời bạn nhập điểm số Marketing: ");
                        double marketingscores = Double.parseDouble(sc.nextLine());

                        System.out.println("Mời bạn nhập điểm số Saless: ");
                        double salesscores = Double.parseDouble(sc.nextLine());




                        SinhVienBiz sinhVienBiz = new SinhVienBiz(name, majors, marketingscores, salesscores);
                        sinhVienBiz.getHocLuc();
                        sinhVienBizs[i] = sinhVienBiz;
                    }
                    break;
                case 3:
                    for (SinhVienIT it : sinhVienITS
                    ) {
                        if (it == null) break;
                        System.out.println(it);
                    }
                    sinhVienITS.toString();

                    break;

                case 4:
                    for (SinhVienBiz biz : sinhVienBizs
                    ) {
                        if (biz == null) break;
                        System.out.println(biz);
                    }
                    break;

            }

        } while (true);


        System.out.println("Cảm ơn các bạn đã điền các thông tin hữu ích .");


    }


}