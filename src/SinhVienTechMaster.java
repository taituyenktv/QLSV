public abstract class SinhVienTechMaster {
    protected String name;
    protected String majors;

    public SinhVienTechMaster(String name, String majors) {
        this.name = name;
        this.majors = majors;

    }


    public abstract Double getDiem();


    public  String getHocLuc(){
        String rank = "";
        if (getDiem() < 5) {
            rank="Học lực Yếu ";
        } else if (5 <= getDiem() && getDiem() < 6.5) {
            rank="Học lực Trung bình";
        } else if (6.5 <= getDiem() && getDiem() < 7.5) {
            rank="Học lực Khá";
        } else if (7.5 <= getDiem() && getDiem() < 10) {
            rank="Học lực Giỏi";
        }
        return rank;

    }
    // cái này bây giờ ko cần nữa :v
//    public void show(){
//        System.out.println("Họ và tên: "+name+ "" +
//                ", Ngành học:  "+majors+
//                ", Điểm: "+getDiem()+
//                ", "+getHocLuc());
//
//    }

    @Override
    public String toString() {
        return "SinhVienTechMaster{" +
                "name='" + name + '\'' +
                ", majors='" + majors + '\'' +
                '}';
    }
}
