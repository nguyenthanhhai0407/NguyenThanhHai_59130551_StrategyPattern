/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context cxt=new context();
        cxt.setTinhtoan(new Cong());
        System.out.println("Tổng 75 + 12 là: "+cxt.tinh(75, 12));
        cxt.setTinhtoan(new Tru());
        System.out.println("Hiệu 54 - 78 là: "+cxt.tinh(54, 78));
    }
    
}
