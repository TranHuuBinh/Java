package BLL;

import java.util.ArrayList;
import DTO.*;
import DAL.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author My PC
 */
public class BLL {
    //NV    
    public static ArrayList<NhanVien_DTO> NhanVienArray(){
        return NhanVien_DAL.getAll();
    }
    
    public static DefaultTableModel NhanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Nhân Viên");
        model.addColumn("Tên Nhân Viên");
        model.addColumn("Giới tính");
        model.addColumn("Địa chỉ");
        model.addColumn("Điện thoại");
        model.addColumn("Ngày sinh");
        try{
            for(int i = 0; i < NhanVienArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(NhanVienArray().get(i).getMaNhanVien());
                h.add(NhanVienArray().get(i).getTenNhanVien());
                h.add(NhanVienArray().get(i).getGioiTinh());
                h.add(NhanVienArray().get(i).getDiaChi());
                h.add(NhanVienArray().get(i).getDienThoai());
                h.add(NhanVienArray().get(i).getNgaySinh());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Error" + ex);
            return null;
        }
    }
    
    public static int InsertNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVien_DAL.Insert(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int UpdateNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVien_DAL.Update(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int DeleteNhanVien(String MaNhanVien){
        return NhanVien_DAL.Delete(MaNhanVien);
    }
    
    //Hang
    
    public static ArrayList<Hang_DTO> HangArray(){
        return Hang_DAL.getAll();
    }
    
    public static DefaultTableModel HangModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Hàng");
        model.addColumn("Tên hàng");
        model.addColumn("Số lượng");
        model.addColumn("Đơn giá nhập");
        model.addColumn("Đơn giá bán");
        model.addColumn("Ghi chú");
        try{
            for(int i = 0; i < HangArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(HangArray().get(i).getMaHang());
                h.add(HangArray().get(i).getTenHang());
                h.add(String.valueOf(HangArray().get(i).getSoLuong()));
                h.add(String.valueOf(HangArray().get(i).getDonGiaNhap()));
                h.add(String.valueOf(HangArray().get(i).getDonGiaBan()));
                h.add(HangArray().get(i).getGhiChu());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static int InsertHang(String MaHang,String TenHang, float SoLuong,float DonGiaNhap,float DonGiaBan,String GhiChu){
        try{
            return Hang_DAL.Insert(MaHang, TenHang, SoLuong, DonGiaNhap, DonGiaBan, GhiChu);
        } catch (Exception e){
            System.out.println("Error !" + e);
            return 0;
        }
    }
    
    public static int UpdateHang(String MaHang,String TenHang, float SoLuong,float DonGiaNhap,float DonGiaBan,String GhiChu){
        try{
            return Hang_DAL.Update(MaHang, TenHang, SoLuong, DonGiaNhap, DonGiaBan, GhiChu);
        } catch (Exception e){
            System.out.println("Error !" + e);
            return 0;
        }
    }
    
    public static int DeleteHang(String MaHang){
        try {
            return Hang_DAL.Delete(MaHang);
        } catch (Exception e) {
            System.out.println("Error !" + e);
            return 0;
        }
    }
    
    //KH
    
    public static ArrayList<Khach_DTO> KhachArray(){
        return Khach_DAL.getAll();
    }
    
    public static DefaultTableModel KhachModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Khách");
            model.addColumn("Tên khách");
            model.addColumn("Địa chỉ");
            model.addColumn("Điện thoại");
            for(int i = 0; i < KhachArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(KhachArray().get(i).getMaKhach());
                h.add(KhachArray().get(i).getTenKhach());
                h.add(KhachArray().get(i).getDiaChi());
                h.add(KhachArray().get(i).getDienThoai());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static int InsertKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return Khach_DAL.Insert(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int UpdateKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return Khach_DAL.Update(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int DeleteKhach(String MaKhach){
        return Khach_DAL.Delete(MaKhach);
    }
    
    //HDBan
    
    public static ArrayList<HDBan_DTO> HDBanArray(){
        return HDBan_DAL.getAll();
    }
    
    public static DefaultTableModel HDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Hàng");
            model.addColumn("Tên hàng");
            model.addColumn("Số lượng");
            model.addColumn("Đơn giá");
            model.addColumn("Thành tiền");
            for(int i = 0; i < HDBanArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(HDBanArray().get(i).getMaHDBan());
                h.add(HDBanArray().get(i).getMaNhanVien());
                h.add(HDBanArray().get(i).getNgayBan());
                h.add(HDBanArray().get(i).getMaKhach());
                h.add(String.valueOf(HDBanArray().get(i).getTongTien()));
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }    
    
    public static String TenNVHDBan(String MaNhanVien){
        return NhanVien_DAL.TenNhanVien(MaNhanVien);
    }
    
    public static String TenKhachHDBan(String MaKhach){
        return Khach_DAL.TenKhach(MaKhach);
    }
    
    public static String DTKhachHDBan(String MaKhach){
        return Khach_DAL.DienThoai(MaKhach);
    }
    
    public static String DCKhachHDBan(String MaKhach){
        return Khach_DAL.DiaChi(MaKhach);
    }
    
    public static String TenHangHDBan(String MaHang){
        return Hang_DAL.TenHang(MaHang);
    }
    
    public static String DonGiaHDBan(String MaHang){
        return Hang_DAL.DonGia(MaHang);
    }
    
    public static int InsertHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBan_DAL.Insert(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int UpdateHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBan_DAL.Update(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int DeleteHDBan(String MaHDBan){
        return HDBan_DAL.Delete(MaHDBan);
    }
    
    public static int InsertChiTietHDBan(String MaHDBan, String MaHang, float SoLuong,float DonGia,float ThanhTien){
        return CTHDBan_DAL.Insert(MaHDBan, MaHang, SoLuong, DonGia, ThanhTien);
    }
    
    //FindHD
    
    public static DefaultTableModel TimHDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã HĐB");
            model.addColumn("Mã nhân viên");
            model.addColumn("Ngày bán");
            model.addColumn("Tên khách");
            model.addColumn("Tổng tiền");
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static ArrayList<HDBan_DTO> FindHD(String MaHoaDon,String MaNhanVien,String MaKhachHang){
        return HDBan_DAL.findHD(MaHoaDon, MaNhanVien, MaHoaDon);
    }
    
    //FindHang
    
    public static DefaultTableModel TimHangModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Hàng");
            model.addColumn("Tên Hàng");
            model.addColumn("Đơn Giá Nhập");
            model.addColumn("Đơn Giá Bán");
            model.addColumn("Ghi Chú");
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static ArrayList<Hang_DTO> FindHang(String MaHang,String TenHang){
        return Hang_DAL.findHang(MaHang, TenHang);
    }
}
