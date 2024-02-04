/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai27;

import java.util.*;

/**
 *
 * @author FPTSHOP
 */
public class QuanLyHangHoa {

    ArrayList<HangHoa> mang;
    Scanner kb = new Scanner(System.in);

    public QuanLyHangHoa() {
        mang = new ArrayList<>();
    }

    void Menu() {
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap");
            System.out.println("2. Xuat");
            System.out.println("Moi ban chon: ");
            chon = kb.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai..!");
            }
        } while (chon != 0);
    }

    void Nhap() {
        int chon;
        System.out.println("1 - Thuc pham");
        System.out.println("2 - Dien may");
        System.out.println("3 - Sanh su");
        System.out.println("Moi ban chon: ");
        chon = kb.nextInt();
        switch (chon) {
            case 1:
                HangHoa hh = new ThucPham(); // Down - casting
                NhapThongTinChung(hh);

                // Nhập ngày sản xuất
                ThucPham tam = (ThucPham) hh;
                boolean flag;
                do {
                    flag = false;
                    System.out.println("Nhap ngay san xuat: ");
                    tam.setNgaySX(kb.nextLine());
                    String[] mangNgaySX = tam.getNgaySX().split("/");
                    if (mangNgaySX.length != 3 || tam.getNgaySX().length() != 10) {
                        System.out.println("Nhap sai. Vui long nhap lai..!");
                        flag = true;
                    }
                } while (flag == true);
                // Nhập ngày hết hạn
                do {
                    flag = false;
                    System.out.println("Nhap ngay het han: ");
                    tam.setNgayHH(kb.nextLine());
                    String[] mangNgayHH = tam.getNgayHH().split("/");
                    if (mangNgayHH.length != 3 || tam.getNgayHH().length() != 10) {
                        System.out.println("Nhap sai. Vui long nhap lai..!");
                        flag = true;
                    }
                } while (flag == true);
                System.out.println("Nhap nha cung cap: ");
                tam.setNhacungcap(kb.nextLine());
                mang.add(hh);
                break;
            case 2:
                hh = new DienMay();
                NhapThongTinChung(hh);
                // Nhập thời gian bảo hành
                DienMay tam1 = (DienMay) hh;
                do {
                    flag = false;
                    try {
                        System.out.println("Nhap thoi gian bao hanh: ");
                        tam1.setThoiGianBaoHanh(kb.nextInt());
                        if (tam1.getThoiGianBaoHanh() < 0) {
                            throw new Exception();
                        }
                    } catch (Exception loi) {
                        System.out.println("Thoi gian bao hanh phai la so nguyen");
                        flag = true;
                        kb.nextLine();
                    }
                } while (flag == true);
                // Nhập công suất
                do {
                    flag = false;
                    try {
                        System.out.println("Nhap cong suat: ");
                        tam1.setCongSuat(kb.nextDouble());
                        if (tam1.getCongSuat() < 0) {
                            throw new Exception();
                        }
                    } catch (Exception loi) {
                        System.out.println("Cong suat phai la so thuc");
                        flag = true;
                        kb.nextLine();
                    }
                } while (flag == true);
                mang.add(hh);
                break;
            case 3:
                hh = new SanhSu();
                NhapThongTinChung(hh);
                // Nhập nhà sản xuất
                System.out.println("Nhap nha san xuat: ");
                SanhSu tam2 = (SanhSu) hh;
                tam2.setNhaSanXuat(kb.nextLine());
                // Nhập ngày nhập kho
                do {
                    flag = false;
                    System.out.println("Nhap ngay nhap kho: ");
                    tam2.setNgayNhapKho(kb.nextLine());
                    String[] mangNgayNhapKho = tam2.getNgayNhapKho().split("/");
                    if (mangNgayNhapKho.length != 3 || tam2.getNgayNhapKho().length() != 10) {
                        System.out.println("Nhap sai. Vui long nhap lai..!");
                        flag = true;
                    }
                } while (flag == true);
                mang.add(hh);
        }
    }

    void NhapThongTinChung(HangHoa hh) {
        boolean flag;
        // Nhập mã hàng
        String tam_MaHang;
        do {
            flag = false;
            System.out.println("Nhap ma hang: ");
            tam_MaHang = kb.nextLine();
            // Kiểm tra trống
            if (tam_MaHang.length() == 0) {
                System.out.println("Ma hang khong duoc de trong..!");
                flag = true;
            }
            // Kiểm tra trùng
            for (int i = 0; i < mang.size(); i++) {
                if (mang.get(i).getMaHang().equalsIgnoreCase(tam_MaHang)) {
                    System.out.println("Ma hang khong duoc trung..!");
                    flag = true;
                }
            }
        } while (flag == true);
        hh.setMaHang(tam_MaHang);
        // Nhập tên hàng
        String tam_TenHang;
        do {
            flag = false;
            System.out.println("Nhap ten hang: ");
            tam_TenHang = kb.nextLine();
            // Kiểm tra trống
            if (tam_TenHang.length() == 0) {
                System.out.println("Ten hang khong duoc de trong..!");
                flag = true;
            }
        } while (flag == true);
        hh.setTenHang(tam_TenHang);
        // Nhập số lượng tồn
        do {
            flag = false;
            try {
                System.out.println("Nhap so luong ton: ");
                hh.setSoLuongTon(kb.nextDouble());
                if (hh.getSoLuongTon() < 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                System.out.println("So luong ton phai la so thuc");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
        //Nhập đơn giá
        do {
            flag = false;
            try {
                System.out.println("Nhap don gia: ");
                hh.setDonGia(kb.nextDouble());
                if (hh.getDonGia() < 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                System.out.println("Don gia phai la so thuc");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
    }

    void Xuat() {
        for (int i = 0; i < mang.size(); i++) {
            mang.get(i).Xuat();
        }
    }
}
