import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHocVien {
    private List<HocVien> hocVien = new ArrayList<HocVien>();
    private List <String> hVien = new ArrayList<String>();
    
    
    public List getSlimListHocVien(){
        return hocVien;
    }
    public List getSlimListHv(){
        return hVien;
    }
    public void getListHocVien(){
        System.out.println("Danh Sach Hoc Sinh");
        System.out.println("Co Tong Cong: "+ hocVien.size());
        HocVien a = new HocVien();
        for(int i= 0;i< hocVien.size();i++){
            if(i==0){
                System.out.printf("%12s  %20s    %12s   %12s\n", "Mã Sinh Viên", "Tên Sinh Viên", "Giới Tính", "Ngày Sinh");
            }
            System.out.printf("%12s  %20s    %12s   %12s\n",hocVien.get(i).maSV , hocVien.get(i).hoTenSV, hocVien.get(i).sexSV, a.getDate().format(hocVien.get(i).ngaySinhSV));
        }
    }

    public void themHocVien(String hoTenSV,Date nSinhSV, boolean sexSV){
        HocVien a = new HocVien();
        a.dienThongTinSV(hoTenSV,nSinhSV,sexSV);
        hocVien.add(a) ;
        hVien.add(hoTenSV);
    }
    public void themHocVien(){
        HocVien a = new HocVien();
        a.dienThongTinSV();
        hocVien.add(a);
        System.out.print(hocVien);
        hVien.add(a.hoTenSV);
        System.out.print(hVien);
        
    }
    //Search with Name
    public void xemThongTinHocVien(){
        System.out.print("Nhap Ten Sinh Vien Ban Muon Tim: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(hVien);
        if(hVien.contains(name) == true){
            int id = -1;
            
            for(int i = 0;i<hVien.size();i++){
                String a = hVien.get(i).toString();
                id++;
                if(a.equals(name)){
                    break;
                }
                
            }
            System.out.print(hocVien.get(id));
        }
        else
            System.out.println("Hoc Sinh Khong Ton Tai");
    }
    //Search with id
    public void xemThongTinHocVien2(){
        
        System.out.print("Nhap Ma Sinh Vien Ban Muon Tim: ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        //Chuyển sang dùng vòng lặp thay vì trycatch lỗi
        try{
            System.out.print(hocVien.get(id));
        }catch(Exception e){
            System.out.print("Hoc Sinh Khong Ton Tai\n");
        }
      

    }
    //Delete with Name
    public void xoaHocVien(){
        //Bổ sung sau kiểm tra thêm mã sv vì có thể có trùng tên
        System.out.print("Nhap Ten Sinh Vien Ban Muon Xoa: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(hVien);
        if(hVien.contains(name) == true){
            int id = -1;
            
            for(int i = 0;i<hVien.size();i++){
                String a = hVien.get(i).toString();
                System.out.println(hVien.get(i));
                id++;
                if(a.equals(name)){
                    break;
                }
                
            }
            hocVien.remove(id);
            hVien.remove(id);
        }
        System.out.println("Hoc Vien: "+name+" Đã được xoá");
        
    }
    //Delete with ID
    public void xoaHocVien2(){
        //Bổ sung sau vì phương thức này sau khi xóa thì Index trong List không trùng với Id Sinh Vien
        System.out.print("Nhap Ma Sinh Vien Ban Muon Xoa: ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        //Chuyển sang dùng vòng lặp thay vì trycatch lỗi
        try{
            hocVien.remove(id);
            hVien.remove(id);
        }catch(Exception e){
            System.out.print("Hoc Sinh Khong Ton Tai\n");
        }
      

    }

    public void dienDiemSV(){
        HocVien a = new HocVien();
        a.dienDiemSV();
    }
    
}
