/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai27;

/**
 *
 * @author FPTSHOP
 */
public class ThucPham extends HangHoa {

    private String NgaySX, NgayHH, Nhacungcap;

    public String getNgayHH() {
        return NgayHH;
    }

    public void setNgayHH(String NgayHH) {
        this.NgayHH = NgayHH;
    }

    public String getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(String NgaySX) {
        this.NgaySX = NgaySX;
    }

    public String getNhacungcap() {
        return Nhacungcap;
    }

    public void setNhacungcap(String Nhacungcap) {
        this.Nhacungcap = Nhacungcap;
    }

    public double SoLuongTon() {
        return SoLuongTon;
    }

    public double VAT() {
        return 0.05;
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getNgaySX() + " - " + getNgayHH() + " - " + getNhacungcap());
    }
}
