/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Duy Tay
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context c = new Context();
        //Cong
        c.setTinhToan(new Cong());
        System.out.println(c.tinh(75f,12f));
        
        //tru
        c.setTinhToan(new Tru());
        System.out.print(c.tinh(54f, 78f));
        //System.out.println("hello");
        h t sửa file ne :)
    }
    
}
