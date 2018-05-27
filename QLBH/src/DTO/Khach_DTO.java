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
public class Khach_DTO {
    private String MaKhach;
    private String TenKhach;
    private String DiaChi;
    private String DienThoai;

    /**
     * @param MaKhach
     * @param TenKhach
     * @param DiaChi
     * @param DienThoai
     */
    public Khach_DTO(String MaKhach,String TenKhach, String DiaChi, String DienThoai){
        this.MaKhach = MaKhach;
        this.TenKhach = TenKhach;
        this.DienThoai = DienThoai;
        this.DiaChi = DiaChi;
    }
    
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
     * @return the TenKhach
     */
    public String getTenKhach() {
        return TenKhach;
    }

    /**
     * @param TenKhach the TenKhach to set
     */
    public void setTenKhach(String TenKhach) {
        this.TenKhach = TenKhach;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the DienThoai
     */
    public String getDienThoai() {
        return DienThoai;
    }

    /**
     * @param DienThoai the DienThoai to set
     */
    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
}
}
