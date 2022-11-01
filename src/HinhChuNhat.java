public class HinhChuNhat {
    private Diem upLeft;
    private Diem dnRight;

    
    public HinhChuNhat(){
        nhapDiem();
    }
    public HinhChuNhat(Diem upLeft,Diem dnRight){
        this.upLeft = upLeft;
        this.dnRight = dnRight;
    }

    public void nhapDiem(){
        System.out.println("Nhap diem Tren Trai: ");
        upLeft = new Diem();
        System.out.println("Nhap diem Duoi Phai: ");
        dnRight = new Diem();
    }

 
    public double getChieuDai(){
        Diem b = new Diem(dnRight.getH(),upLeft.getT());
        return upLeft.tinhKhoangCach(b);
    }
    public double getChieuRong(){
        Diem b = new Diem(dnRight.getH(), upLeft.getT());
        return dnRight.tinhKhoangCach(b);
    }
    public double tinhDienTich(){
        return  getChieuDai() * getChieuRong();
    }
    public double tinhChuVi(){
        return  (getChieuDai() + getChieuRong())*2;
    }
    public String toString(){
        return "Toa Do 4 Diem cua Hinh Chu Nhat: \n("+upLeft.getH()+","+upLeft.getT()+") ("+dnRight.getH()+","+upLeft.getT()+")\n("+dnRight.getT()+","+upLeft.getH()+") ("+dnRight.getH()+","+dnRight.getT()+")";
    }

}
