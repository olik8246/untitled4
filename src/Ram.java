import java.util.Scanner;

public class Ram {
    int gb4= 800;
    int gb8=1600;
    int gb16=2200;
    public int ram() {
        System.out.println("Виберіть кількість орперативної памяті:");
        System.out.println("1)4Gb;  2)8Gb;  3)16Gb");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int ram = 0;
        if (num == 1) {
            ram=gb4;
        }
        if (num == 2){
            ram=gb8;
        }
        if (num == 3){
            ram=gb16;
        }
        return ram;
    }
}
