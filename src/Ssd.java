import java.util.Scanner;

public class Ssd {
    int gb120 = 800;
    int gb480 = 1200;
    int gb960 = 2500;
    int no = 0;

    public int ssd() {
        System.out.println("Виберіть ємкість SSD:");
        System.out.println("1)120Gb;  2)480Gb;  3)960Gb; 4)Непотрібно");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int ssd = 0;
        if (num == 1) {
            ssd=gb120;
        }
        if (num == 2){
            ssd=gb480;
        }
        if (num == 3){
            ssd=gb960;
        }
        if(num == 4){
            ssd=no;
        }
        return ssd;
    }
}
