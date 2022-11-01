import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class HocVien {
    int maSV;
    String hoTenSV;
    Date ngaySinhSV;
    boolean sexSV ;
    Double diem[];
    private static int maSVCount = -1;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    void dienThongTinSV(){
        maSVCount++;
        boolean b = false;
        Scanner scan = new Scanner(System.in);
        QLHocVien a = new QLHocVien();
       
        do{
            maSV = maSVCount;
            System.out.print("Nhap Ten Sinh Vien: ");
            hoTenSV = scan.nextLine();
            
            System.out.print("Nhap Ngay Sinh (dd/MM/yyyy): ");
            String getDate = scan.nextLine();
            try {
                ngaySinhSV = new SimpleDateFormat("dd/MM/yyyy").parse(getDate);
            } catch (ParseException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            try{
                System.out.print("Nhap gioi tinh (0.Nam | 1. Nu) :");
                int sex = scan.nextInt();

                if(sex == 1){
                    sexSV = true;
                    System.out.println("Ban Chon Gioi Tinh Nu");
                }
                else if(sex == 0){
                    sexSV = false;
                    System.out.println("Ban Chon Gioi Tinh Nam");
                }

            }catch (InputMismatchException e){
                System.out.println("Nhap Sai");
            }
            
        }while (b);
    }
    void dienThongTinSV(String hoTenSV,Date nSinhSV,boolean sexSV){
        maSV = maSVCount++;
        this.hoTenSV = hoTenSV;
        ngaySinhSV = nSinhSV;
        this.sexSV = sexSV;

    }
   
    public int getMaSV(){
        return maSV;
    }
    public String getTenSV(){
        return hoTenSV;
    }
    public SimpleDateFormat getDate(){
        return dateFormat;
    }
    public String toString(){

        return "Ma Sinh Vien: "+maSV+"\nHo ten Sinh Vien: "+hoTenSV+"\nNgay Sinh: "+dateFormat.format(ngaySinhSV)+"\nGioi Tinh: "+sexSV+"\nDiem So: "+diem+"\n";
    }
    void dienDiemSV(){
        QLHocVien a  = new QLHocVien();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Sinh Vien Can Nhap Diem: ");
        String name = scan.nextLine();
        if(a.getSlimListHv().contains(name) == true){
            int id = -1;
            for(int i = 0;i<a.getSlimListHv().size();i++){
                
                if(a.getSlimListHv().get(i).toString().equals(name)){
                    id = i;
                    break;
                }
                id++;
            }
            System.out.print(a.getSlimListHocVien().get(id));
            
        }
    }
}
