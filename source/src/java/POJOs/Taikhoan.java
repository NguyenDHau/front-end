package POJOs;
// Generated Sep 24, 2013 9:20:03 AM by Hibernate Tools 3.2.1.GA

/**
 * Taikhoan generated by hbm2java
 */
public class Taikhoan  implements java.io.Serializable {


     private int mataikhoan;
     private Loaitaikhoan loaitaikhoan;
     private String tentruycap;
     private String matkhau;
     private String hoten;
     private Integer trangthai;

    public Taikhoan() {
    }

	
    public Taikhoan(int mataikhoan) {
        this.mataikhoan = mataikhoan;
    }
    public Taikhoan(int mataikhoan, Loaitaikhoan loaitaikhoan, String tentruycap, String matkhau, String hoten, Integer trangthai) {
       this.mataikhoan = mataikhoan;
       this.loaitaikhoan = loaitaikhoan;
       this.tentruycap = tentruycap;
       this.matkhau = matkhau;
       this.hoten = hoten;
       this.trangthai = trangthai;
    }
   
    public int getMataikhoan() {
        return this.mataikhoan;
    }
    
    public void setMataikhoan(int mataikhoan) {
        this.mataikhoan = mataikhoan;
    }
    public Loaitaikhoan getLoaitaikhoan() {
        return this.loaitaikhoan;
    }
    
    public void setLoaitaikhoan(Loaitaikhoan loaitaikhoan) {
        this.loaitaikhoan = loaitaikhoan;
    }
    public String getTentruycap() {
        return this.tentruycap;
    }
    
    public void setTentruycap(String tentruycap) {
        this.tentruycap = tentruycap;
    }
    public String getMatkhau() {
        return this.matkhau;
    }
    
    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public Integer getTrangthai() {
        return this.trangthai;
    }
    
    public void setTrangthai(Integer trangthai) {
        this.trangthai = trangthai;
    }




}


