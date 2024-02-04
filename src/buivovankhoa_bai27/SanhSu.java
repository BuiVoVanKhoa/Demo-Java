/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai27;

/**
 *
 * @author FPTSHOP
 */
public class SanhSu extends HangHoa {

    private String NhaSanXuat, NgayNhapKho;

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }

    public String getNgayNhapKho() {
        return NgayNhapKho;
    }

    public void setNgayNhapKho(String NgayNhapKho) {
        this.NgayNhapKho = NgayNhapKho;
    }

    public double SoLuongTon() {
        return SoLuongTon;
    }

    public double VAT() {
        return 0.1;
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getNhaSanXuat() + " - " + getNgayNhapKho());
    }
}
