/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai27;

/**
 *
 * @author FPTSHOP
 */
public class DienMay extends HangHoa {

    private int ThoiGianBaoHanh;
    private double CongSuat;

    public int getThoiGianBaoHanh() {
        return ThoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int ThoiGianBaoHanh) {
        this.ThoiGianBaoHanh = ThoiGianBaoHanh;
    }

    public double getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(double CongSuat) {
        this.CongSuat = CongSuat;
    }

    public double SoLuongTon() {
        return SoLuongTon;
    }

    public double VAT() {
        return 0.1;
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(getThoiGianBaoHanh() + " - " + getCongSuat());
    }
}
