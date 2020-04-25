/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat ns = new SimpleDateFormat("dd-MM-yyyy");
        SinhVien sv1 = new SinhVien("Nguyễn Thanh Hải", ns.parse("11-12-1999"), 7.0f);
        SinhVien sv2 = new SinhVien("Võ Thuật", ns.parse("21-12-1999"), 9.0f);
        SinhVien sv3 = new SinhVien("Lê Văn Nam", ns.parse("23-07-1999"), 6.5f);
        SinhVien sv4 = new SinhVien("Nguyễn Long", ns.parse("23-07-1999"), 10.0f);
        
        
        QLSV DanhSachSV = new QLSV();
        DanhSachSV.themSV(sv1);
        DanhSachSV.themSV(sv2);
        DanhSachSV.themSV(sv3);
        DanhSachSV.themSV(sv4);
        
        
        DanhSachSV.setSoSanh(new SoSanhTheoTen());
        DanhSachSV.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo tên là:"+"\n");
        DanhSachSV.inDS();
        
        DanhSachSV.setSoSanh(new SoSanhTheoDiem());
        DanhSachSV.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo điểm là:"+"\n");
        DanhSachSV.inDS();
    }
    
}
