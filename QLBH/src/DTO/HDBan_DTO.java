/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author My PC
 */
public class HDBan_DTO {
    private String MaHDBan;
    private String MaNhanVien;
    private String NgayBan;
    private String MaKhach;
    private float TongTien;

    /**
     * @param maHDBan
     * @param MaNhanVien
     * @param NgayBan
     * @param MaKhach
     * @param TongTien
     */
    public HDBan_DTO(String maHDBan, String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        this.MaHDBan = maHDBan;
        this.MaNhanVien = MaNhanVien;
        this.NgayBan = NgayBan;
        this.MaKhach = MaKhach;
        this.TongTien = TongTien;
    }
    
    public String getMaHDBan() {
        return MaHDBan;
    }

    /**
     * @param MaHDBan the MaHDBan to set
     */
    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    /**
     * @return the MaNhanVien
     */
    public String getMaNhanVien() {
        return MaNhanVien;
    }

    /**
     * @param MaNhanVien the MaNhanVien to set
     */
    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    /**
     * @return the NgayBan
     */
    public String getNgayBan() {
        return NgayBan;
    }

    /**
     * @param NgayBan the NgayBan to set
     */
    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    /**
     * @return the MaKhach
     */
    public String getMaKhach() {
        return MaKhach;
    }

    /**
     * @param MaKhach the MaKhach to set
     */
    public void setMaKhach(String MaKhach) {
        this.MaKhach = MaKhach;
    }

    /**
     * @return the TongTien
     */
    public float getTongTien() {
        return TongTien;
    }

    /**
     * @param TongTien the TongTien to set
     */
    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }
}
