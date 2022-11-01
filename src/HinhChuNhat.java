public class HinhChuNhat {
    private Diem upLeft = new Diem();
    private Diem dnRight = new Diem();

    
 
    public void setDiemUpLeft(int a,int b){
        upLeft.setDiem(a, b);
    }
    public void setDiemDnRight(int a,int b){
        dnRight.setDiem(a, b);
    }
    public double getChieuDai(){
        DoanThang w = new DoanThang();
        w.setDiem1(this.upLeft.getH(), this.upLeft.getT());
        w.setDiem2(this.dnRight.getH(), this.upLeft.getT());
        return w.doDaiDoanThang();
    }
    public double getChieuRong(){
        DoanThang h = new DoanThang();
        h.setDiem1(this.dnRight.getH(), this.upLeft.getT());
        h.setDiem2(this.dnRight.getH(),this.dnRight.getT());
        return h.doDaiDoanThang();
    }
    public double tinhDienTich(){
        
        double kq = getChieuDai() * getChieuRong();
        return kq;
    }
    public double tinhChuVi(){
        
        double kq = (getChieuDai() + getChieuRong())*2;
        return kq;
    }
    public String toString(){
        return "Toa Do 4 Diem cua Hinh Chu Nhat: \n("+upLeft.getH()+","+upLeft.getT()+") ("+dnRight.getH()+","+upLeft.getT()+")\n("+dnRight.getT()+","+upLeft.getH()+") ("+dnRight.getH()+","+dnRight.getT()+")";
    }

}
