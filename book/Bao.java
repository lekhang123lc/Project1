package book;
import java.util.Scanner;
import book.*;

public class Bao extends TaiLieu {
    private int type;
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBan;
    private String ngayPhatHanh;

    public static Bao add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu=input.nextLine();
        while( maTaiLieu == "" ) maTaiLieu=input.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String nhaXuatBan=input.nextLine();
        while( nhaXuatBan == "" ) nhaXuatBan=input.nextLine();
        System.out.print("Nhap so ban: ");
        int soBan=input.nextInt();
        System.out.print("Nhap ngay phat hanh: ");
        String ngayPhatHanh=input.nextLine();
        while( ngayPhatHanh == "" ) ngayPhatHanh=input.nextLine();

        return new Bao(maTaiLieu, nhaXuatBan, soBan, ngayPhatHanh);
    }

    public void showInfo(){
        System.out.println("Bao co ma la: "+maTaiLieu);
        System.out.println("- Nha xuat ban: "+nhaXuatBan);
        System.out.println("- So ban: "+soBan);
        System.out.println("- Ngay phat hanh: "+ngayPhatHanh);
        System.out.println("");
    }

    public Bao(String maTaiLieu, String nhaXuatBan, int soBan, String ngayPhatHanh) {
        type=3;
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBan = soBan;
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}