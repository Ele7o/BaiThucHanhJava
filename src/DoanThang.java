public class DoanThang {
    Diem a = new Diem(); // Điểm đầu đoạn thẳng
    Diem b = new Diem(); // Điểm cuối đoạn thẳng
    Diem c = new Diem(); // Trung điểm đoạn thẳng

    public void setDiem1(double d,double e){
        this.a.setDiem(d, e);
    }
    public void setDiem2(double d,double e){
        this.b.setDiem(d, e);
    }
    public String toString(){
        return "Toa Do Doan Thang: [("+a.getH()+","+a.getT()+"),("+b.getH()+","+b.getT()+")]";
    }
    public Double doDaiDoanThang(){
        double kq = this.a.tinhKhoangCach(b);
        return kq;
    }
    public String toDoTrungDiem(){
        double x = (this.a.getH()+this.b.getH())/2;
        double y = (this.a.getT()+this.b.getT())/2;
        
        this.c.setDiem(x, y);
        return this.c.toString();
    }
    public boolean ktSongSong(DoanThang x){
        double a = (this.a.getH() - this.b.getH())/(this.a.getT() - this.b.getT());
        double b = (x.a.getH()- x.b.getH())/(x.a.getT() - x.b.getT());
        if(a==b){
            return true;
        }
        else
            return false;

    }
}
