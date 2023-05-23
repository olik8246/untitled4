import java.util.Scanner;

public class MotherBord {
    int asus = 2000;
    int gigabyte = 2200;
    int msi = 3000;

    public int motherBord() {
        System.out.println("Виберіть материнську плату:");
        System.out.println("1)ASUS PRIME Z370-A;  2)Gigabyte Z370 AORUS Gaming 7;  3)MSI Z370 GAMING M5");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int motherBord = 0;
        if (num == 1) {
            motherBord=asus;
        }
        if (num == 2){
            motherBord=gigabyte;
        }
        if (num == 3){
            motherBord=msi;
        }
        return motherBord;
    }
}
