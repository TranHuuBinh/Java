package DTO;

/**
 *
 * @author My PC
 */
public class NhanVien_DTO 
{
    private String MaNhanVien;
    private String TenNhanVien;
    private String GioiTinh;
    private String DiaChi;
    private String DienThoai;
    private String NgaySinh;

    /**
     * @param MaNhanVien
     * @param TenNhanVien
     * @param GioiTinh
     * @param DiaChi
     * @param DienThoai
     * @param NgaySinh
     */
    public NhanVien_DTO(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.NgaySinh = NgaySinh;
    }
    
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
     * @return the TenNhanVien
     */
    public String getTenNhanVien() {
        return TenNhanVien;
    }

    /**
     * @param TenNhanVien the TenNhanVien to set
     */
    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    /**
     * @return the GioiTinh
     */
    public String getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
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

    /**
     * @return the NgaySinh
     */
    public String getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
}
