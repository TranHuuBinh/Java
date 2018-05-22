package bai89;

public class NhanVien 
{
    private String MaNV;
    private String PhanXuong;
    private int SoSP;
    
    public NhanVien()
    {
        this.MaNV = null;
        this.PhanXuong = null;
        this.SoSP = 0;
    }
    
    public NhanVien(String v1, String v2, int v3)
    {
        this.MaNV = v1;
        this.PhanXuong = v2;
        this.SoSP = v3;
    }
    
    public void setMaNV(String value)
    {
        this.MaNV = value;
    }
    
    public void setPhanXuong(String value)
    {
        this.PhanXuong = value;
    }
    
    public void setSoSP(int value)
    {
        this.SoSP = value;
    }
    
    public String getMaNV()
    {
        return MaNV;
    }
    
    public String getPhanXuong()
    {
        return PhanXuong;
    }
    
    public int getSoSP()
    {
        return SoSP;
    }
    
    public int getChuan()
    {
        if (getPhanXuong() == "A")
            return 300;
        else
            return 500;
    }
    
    public boolean VuotChuan()
    {
        if (getSoSP() > getChuan())
            return true;
        else
            return false;
    }
    
    public double TinhLuong()
    {
        if (VuotChuan() == true)
            return (getChuan()*20000) + (((getSoSP()-getChuan())*30000));
        else
            return getSoSP()*20000;
    }
    
    @Override
    public String toString()
    {
        return getMaNV();
    }
}
