public class Diem {
    private double h;
    private double t;

    public void setDiem(double a, double b) {
        h=a; 
        t=b;     
    }
    public double getH (){
        return h;
    }
    public double getT (){
        return t;
    }
    public String toString() {
        return "Diem ("+h+","+t+")";
    }

    public double tinhKhoangCach(Diem a){
        double kq = Math.sqrt(Math.pow(this.h - a.h, 2) + Math.pow(this.t - a.t, 2));
        return kq;

    }
}
