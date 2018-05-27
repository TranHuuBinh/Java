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
public class Hang_DTO {
    private String MaHang;
    private String TenHang;
    private float SoLuong;
    private float DonGiaNhap;
    private float DonGiaBan;
    private String GhiChu;

    /**
     * @param MaHang
     * @param TenHang
     * @param SoLuong
     * @param DonGiaNhap
     * @param DonGiaBan
     * @param GhiChu
     */
    public Hang_DTO(String MaHang, String TenHang,float SoLuong,float DonGiaNhap,float DonGiaBan,String GhiChu){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.SoLuong = SoLuong;
        this.DonGiaBan = DonGiaBan;
        this.DonGiaNhap = DonGiaNhap;
        this.GhiChu = GhiChu;
    }
    
    public String getMaHang() {
        return MaHang;
    }

    /**
     * @param MaHang the MaHang to set
     */
    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    /**
     * @return the TenHang
     */
    public String getTenHang() {
        return TenHang;
    }

    /**
     * @param TenHang the TenHang to set
     */
    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    /**
     * @return the SoLuong
     */
    public float getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
    }

    /**
     * @return the DonGiaNhap
     */
    public float getDonGiaNhap() {
        return DonGiaNhap;
    }

    /**
     * @param DonGiaNhap the DonGiaNhap to set
     */
    public void setDonGiaNhap(float DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    /**
     * @return the DonGiaBan
     */
    public float getDonGiaBan() {
        return DonGiaBan;
    }

    /**
     * @param DonGiaBan the DonGiaBan to set
     */
    public void setDonGiaBan(float DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}
