import java.util.Scanner;

public class Hdd {
    int gb500 = 600;
    int gb1000 = 1000;
    int gb2000 = 1800;
    public int hdd() {
        System.out.println("Виберіть ємкість HDD:");
        System.out.println("1)500Gb;  2)1Tb;  3)2Tb");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int hdd = 0;
        if (num == 1) {
            hdd=gb500;
        }
        if (num == 2){
            hdd=gb1000;
        }
        if (num == 3){
            hdd=gb2000;
        }
        return hdd;
    }

}
