/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Duy Tay
 */
public class GioHang {
    
   
    ArrayList<HangHoa> hangHoas = new ArrayList();
    IThanhToan hinhThucTT;
    
     public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
     public double thanhToan(int tienHang)
     {
         return hinhThucTT.thanhtoan(tienHang);
     }
      public void ThemHangHoa(HangHoa hanghoa)
    {
        hangHoas.add(hanghoa);
    }
      
      public void InDSHangHoa()
    {
        System.out.println("Danh Sách Hàng Hóa");
        for(int i = 0;i < hangHoas.size();i++)
        {
            System.out.println("hang hoa :" + (i+1) + "\n" +
                    "ten hang hoa :" + hangHoas.get(i).getTenHH() + " " +
                    "gia :" +hangHoas.get(i).getGia() + " " +
                    "mo ta :" + hangHoas.get(i).getMoTa());
        }
    }
    
    
}
