/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai27;

/**
 *
 * @author FPTSHOP
 */
public abstract class HangHoa {

    protected String MaHang, TenHang;
    protected double SoLuongTon, DonGia;

    // Phương thức trừu tượng (abstract)
    abstract double SoLuongTon();
    
//    abstract String DanhGiaMucDo();

    abstract double VAT();

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public double getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(double SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    protected void Xuat() {
        System.out.print(getMaHang() + " - " + getTenHang() + " - " + getSoLuongTon() + " - " + getDonGia() + " - ");
    }
}
