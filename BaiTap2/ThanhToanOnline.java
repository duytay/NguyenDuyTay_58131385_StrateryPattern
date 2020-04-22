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
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhtoan(int tienHang) {
        if(tienHang < 1000000)
           return tienHang - tienHang*0.05;
        return tienHang - tienHang*0.07;
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
