/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Duy Tay
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hang hoa 1
        HangHoa hanghoa1 = new HangHoa("BanhKem", 150000, "Sinh Nhật");
        //hang hoa 2
        HangHoa hanghoa2 = new HangHoa("SoCoLa", 5000000, "Mầu Nâu");
        
        //thêm vào mảng
        GioHang giohang = new GioHang();
        giohang.ThemHangHoa(hanghoa1);
        giohang.ThemHangHoa(hanghoa2);
        
        //in danh sach hang hoa
        giohang.InDSHangHoa();
        
        //thanh toan online
        giohang.setHinhThucTT(new ThanhToanOnline());
        System.out.println(giohang.thanhToan(hanghoa1.getGia()));
        //thanh toan COD
        giohang.setHinhThucTT(new ThanhToanCOD());
        System.out.println(giohang.thanhToan(hanghoa2.getGia()));
        
        // TODO code application logic here
    }
    
}
