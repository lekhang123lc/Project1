package book;
import java.util.Scanner;
import book.*;

public class TaiLieu {
    private int type;
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBan;

    public static TaiLieu add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu=input.nextLine();
        System.out.print("\nNhap nha xuat ban: ");
        String nhaXuatBan=input.nextLine();
        System.out.print("\nNhap so ban: ");
        int soBan=input.nextInt();

        return new TaiLieu(maTaiLieu, nhaXuatBan, soBan);
    }
    
    public void showInfo(){

    }

    public TaiLieu() {

    }

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBan) {
        type=0;
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBan = soBan;
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
}