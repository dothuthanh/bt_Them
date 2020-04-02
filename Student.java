public class Student extends Peson {
    private int maSinhVien = 32340705;
    private int diemTb;
    private String email = "thanh.do.codegym@gmail.com";
    public Student(){

    }

    public Student(int maSinhVien, int diemTb, String email) {
        this.maSinhVien = maSinhVien;
        this.diemTb = diemTb;
        this.email = email;
    }

    public Student(String name, boolean gioiTinh, String diaChi, String ngaySinh, int maSinhVien, int diemTb, String email) {
        super(name, gioiTinh, diaChi, ngaySinh);
        this.maSinhVien = maSinhVien;
        this.diemTb = diemTb;
        this.email = email;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public int getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(int diemTb) {
        this.diemTb = diemTb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean getTB(){
        return diemTb > 8.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien=" + maSinhVien +
                ", diemTb=" + diemTb +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}' + super.toString();
    }
}
