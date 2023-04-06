public class SinhVienBiz extends SinhVienTechMaster {
    public double marketingscores, salesscores;


    public SinhVienBiz(String name, String majors, double marketingscores, double salesscores) {
        super(name, majors);
        this.marketingscores = marketingscores;
        this.salesscores = salesscores;
    }

    @Override
    public Double getDiem() {
        return (2 * marketingscores + salesscores) / 3;
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" +

                " Học sinh : " + name +
                ", Ngành học : " + majors +
                ", Điểm Marketing là: " + marketingscores +
                ", Điểm Sale là: " + salesscores +
                ", Điểm Trung bình = "+getDiem()+ " " +
                super.getHocLuc() +
                '}';
    }
}
