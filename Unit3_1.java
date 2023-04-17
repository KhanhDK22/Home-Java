import java.util.Scanner;

class SACH {

    public String ma, ten, tg, loai, nxb;
    public int trang, tap, gia;

    public SACH(){
        this.ma = ma; this.ten = ten; this.tg = tg; this.trang = trang; this.loai = loai; this.nxb = nxb; this.tap = tap; this.gia = gia;
    }
    
    public void NHAPSACH() /*throws IOException*/ {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Khai bao thong tin cuon sach--------- ");
        System.out.println(" ");        

        System.out.print("Nhap vao ma sach: "); ma = sc.nextLine();
        System.out.println(" ");
        System.out.print("Nhap vao ten sach: "); ten = sc.nextLine();
        System.out.println(" ");
        System.out.print("Nhap vao ten tac gia: "); tg = sc.nextLine();
        System.out.println(" ");
        System.out.print("Nhap vao so trang sach: "); trang = sc.nextInt();
                                                                sc.nextLine();
        System.out.println(" ");
        System.out.print("Nhap vao loai sach: "); loai = sc.nextLine();
        System.out.println(" ");
        System.out.print("Nhap vao nha xuat ban: "); nxb = sc.nextLine();
        System.out.println(" ");
        System.out.print("Nhap vao so tap: "); tap = sc.nextInt();
        System.out.println(" ");
        System.out.print("Nhap vao gia sach: "); gia = sc.nextInt();
        System.out.println(" ");
        sc.close();
    }

    public void INSACH()/* throws IOException */{
        System.out.println("----------Thong tin sach vua nhap----------");
        System.out.println(" ");
        System.out.println("Ma sach: " + ma );
        System.out.println("Ten sach: " + ten );
        System.out.println("Tac gia: " + tg );
        System.out.println("So trang: " + trang );
        System.out.println("The loai sach: " + loai );
        System.out.println("Nha xuat ban: " + nxb );
        System.out.println("So tap sach: " + tap );
        System.out.println("Gia sach: " + gia + " VND");
        System.out.println(" ");
    } 
  
} 


public class Unit3_1 {
    public static void main(String[]args) /*throws IOException */{
        SACH sa = new SACH();
        sa.NHAPSACH();
        sa.INSACH();
    }
}
