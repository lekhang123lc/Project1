package book;
import java.util.Scanner;
import book.*;

public class TapChi extends TaiLieu {
    private int type;
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBan;
    private String soPhatHanh;
    private int thangPhatHanh;

    public static TapChi add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu=input.nextLine();
        while( maTaiLieu == "" ) maTaiLieu=input.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String nhaXuatBan=input.nextLine();
        while( nhaXuatBan == "" ) nhaXuatBan=input.nextLine();
        System.out.print("Nhap so ban: ");
        int soBan=input.nextInt();
        System.out.print("Nhap so phat hanh: ");
        String soPhatHanh=input.nextLine();
        while( soPhatHanh == "" ) soPhatHanh=input.nextLine();
        System.out.print("Nhap thang phat hanh: ");
        int thangPhatHanh=input.nextInt();

        return new TapChi(maTaiLieu, nhaXuatBan, soBan, soPhatHanh, thangPhatHanh);
    }

    public void showInfo(){
        System.out.println("Tap chi co ma la: "+maTaiLieu);
        System.out.println("- Nha xuat ban: "+nhaXuatBan);
        System.out.println("- So ban: "+soBan);
        System.out.println("- So phat hanh: "+soPhatHanh);
        System.out.println("- Thang phat hanh: "+thangPhatHanh);
        System.out.println("");
    }

    public TapChi(String maTaiLieu, String nhaXuatBan, int soBan, String soPhatHanh, int thangPhatHanh) {
        type=2;
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBan = soBan;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
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

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}