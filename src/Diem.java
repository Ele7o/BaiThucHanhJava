import java.util.InputMismatchException;
import java.util.Scanner;

public class Diem {
    private double h;
    private double t;


    public Diem(){
       nhapDiem();
       
    }
    public Diem(double a,double b){
        h = a;
        t = b;
    }
    public void nhapDiem(){
        Scanner scan = new Scanner(System.in);
        boolean  ck = false;
        do{
            try{
                System.out.print("Nhap Toa Do diem : \nHoanh Do: ");
                h = scan.nextDouble();   
                System.out.print("Tung Do: ");
                t = scan.nextDouble();
                System.out.println("");
                
            }catch(InputMismatchException e){
                System.out.println("Nhap sai vui long nhap lai");
                nhapDiem();
            }
    
        }while(ck);
   
    }
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
        return "Diem ("+h+","+t+")\n";
    }

    public double tinhKhoangCach(Diem a){
        double kq = Math.sqrt(Math.pow(this.h - a.h, 2) + Math.pow(this.t - a.t, 2));
        return kq;

    }
}
