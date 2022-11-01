

public class DoanThang {
    private Diem a ; // Điểm đầu đoạn thẳng
    private Diem b ; // Điểm cuối đoạn thẳng
    private Diem c ; // Trung điểm đoạn thẳng

    public DoanThang(){
        nhapDoanThang();
    }
    public DoanThang(Diem a,Diem b){
        this.a = a;
        this.b = b;
    }

    public void nhapDoanThang(){
        System.out.println("Nhap diem thu nhat: ");
        a = new Diem();
        System.out.println("Nhap diem thu hai: ");
        b= new Diem();
    }

    public String toString(){
        return "Toa Do Doan Thang: [("+a.getH()+","+a.getT()+"),("+b.getH()+","+b.getT()+")]";
    }

    public String toaDoTrungDiem(){
        c = new Diem((this.a.getH()+this.b.getH())/2,(this.a.getT()+this.b.getT())/2);
        return "Toa do trung diem: "+c.toString();
    }
    public boolean isSongSong(DoanThang x){
        double a = (this.a.getH() - this.b.getH())/(this.a.getT() - this.b.getT());
        double b = (x.a.getH()- x.b.getH())/(x.a.getT() - x.b.getT());
        System.out.print("Doan thang thu nhat co song song voi Doan thang thu hai: ");
        if(a==b){
            
            return true;
        }
            
        else
            return false;

    }
}
