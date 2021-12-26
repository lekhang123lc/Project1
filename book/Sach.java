package book;
import java.util.Scanner;
import book.*;

public class Sach extends TaiLieu {
    private int type;
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBan;
    private String tacGia;
    private int soTrang;

    public static Sach add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu=input.nextLine();
        while( maTaiLieu == "" ) maTaiLieu=input.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String nhaXuatBan=input.nextLine();
        while( nhaXuatBan == "" ) nhaXuatBan=input.nextLine();
        System.out.print("Nhap so ban: ");
        int soBan=input.nextInt();
        System.out.print("Nhap tac gia: ");
        String tacGia=input.nextLine();
        while( tacGia == "" ) tacGia=input.nextLine();
        System.out.print("Nhap so trang: ");
        int soTrang=input.nextInt();

        return new Sach(maTaiLieu, nhaXuatBan, soBan, tacGia, soTrang);
    }

    public void showInfo(){
        System.out.println("Sach co ma la: "+maTaiLieu);
        System.out.println("- Nha xuat ban: "+nhaXuatBan);
        System.out.println("- So ban: "+soBan);
        System.out.println("- Tac gia: "+tacGia);
        System.out.println("- So trang: "+soTrang);
        System.out.println("");
    }

    public Sach(String maTaiLieu, String nhaXuatBan, int soBan, String tacGia, int soTrang) {
        type=1;
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBan = soBan;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}