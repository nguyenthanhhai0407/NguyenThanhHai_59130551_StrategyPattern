/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hangHoa1 = new HangHoa("Xe Hơi", 550055000, "Xe Ô Tô Honda HRV - Đỏ");
        HangHoa hangHoa2 = new HangHoa("Xe Moto", 45000000, "Xe Máy Nhập Khẩu Yamaha R15v3 - Đen Nhám");
        HangHoa hangHoa3 = new HangHoa("Máy Máy Điện", 22000000, "Xe Máy Điện VinFast Ludo - Trắng");
        
        GioHang gh1 = new GioHang();
        gh1.themHH(hangHoa1);
        gh1.themHH(hangHoa2);
        gh1.themHH(hangHoa3);
        gh1.setHinhThucTT(new ThanhToanCOD());
        gh1.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên COD là: "+gh1.getThanhToan(gh1.getTienHang())+"\n");
        
        GioHang gh2 = new GioHang();
        gh2.themHH(hangHoa1);
        gh2.themHH(hangHoa2);
        gh2.themHH(hangHoa3);
        gh2.setHinhThucTT(new ThanhToanOnline());
        gh2.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên Online là: "+gh2.getThanhToan(gh2.getTienHang())+"\n");
    }
    
}
