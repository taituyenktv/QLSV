public class SinhVienIT extends SinhVienTechMaster {
    private double javascores, htmlscores, cssscores;


    public SinhVienIT(String name, String majors, double javascores, double htmlscores, double cssscores) {
        super(name, majors);
        this.javascores = javascores;
        this.htmlscores = htmlscores;
        this.cssscores = cssscores;
    }


    @Override
    public Double getDiem() {
        return (javascores * 2 + htmlscores + cssscores) / 4;
    }

    @Override
    public String toString() {
        return "SinhVienIT{" +
                " Học sinh : " + name +
                ", Ngành học :'" + majors +
                ", Điểm java là: " + javascores +
                ", Điểm HTML là: " + htmlscores +
                ", Điểm CSS là: " + cssscores +
                ", Điểm Trung bình = "+getDiem()+ " " +
                super.getHocLuc() +
                '}';
    }
}

