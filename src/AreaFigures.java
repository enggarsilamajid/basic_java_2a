import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
      //  System.out.println("Type of shape : ");
        Scanner input = new Scanner(System.in);
        String bentuk = input.nextLine();
        if (bentuk.equals("square")) {
        //    System.out.println("square");
          //  System.out.println("side :");
            double sisi = Double.parseDouble(input.nextLine());
            double luas = sisi*sisi;
            System.out.println(luas);
        } else if (bentuk.equals("rectangle")) {
        //    System.out.println("rectangle");
          //  System.out.println("length :");
            double panjang = Double.parseDouble(input.nextLine());
          //  System.out.println("widht :");
            double lebar = Double.parseDouble(input.nextLine());
            double luas = panjang * lebar;
            System.out.println(luas);
        } else if (bentuk.equals("circle")) {
        //    System.out.println("circle");
          //  System.out.println("radius :");
            double rad = Double.parseDouble(input.nextLine());
            double luas = Math.PI*rad*rad;
            System.out.println(luas);
        } else {
        //    System.out.println("triangle");
         //   System.out.println("side :");
            double alas = Double.parseDouble(input.nextLine());
         //   System.out.println("height :");
            double tinggi = Double.parseDouble(input.nextLine());
            double luas = 0.5*alas*tinggi;
            System.out.println(luas);
        }
    }
}
