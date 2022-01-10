package hust.project.repo;

public class Week1_12 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        
        String lines[] = args.split("\\r?\\n");
        //System.out.println("Nhap chieu cao cua tam giac hinh sao trong khoang tu 2 den 10:");
        int h = Integer.valueOf(lines[0]);
        if(h < 2 || h > 10){
            return "Chieu cao khong hop le, vui long nhap lai trong khoang tu 2 den 10";
        }
        output.append("Nhap 1 neu ban muon in ra tam giac xuoi, va bat ky so nao khac neu ban muon in ra tam giac nguoc\n");
        int type = Integer.valueOf(lines[1]);
        if ( type == 1 ){
            for(int i=1;i<=h;i++){
                for(int j=1;j<=i;j++)
                    output.append("*");
                output.append("\n");
            }
        }
        else{
            for(int i=1;i<=h;i++){
                for(int j=h;j>=i;j--)
                    output.append("*");
                output.append("\n");
            }
        }
        
        return output.toString();
    }
}