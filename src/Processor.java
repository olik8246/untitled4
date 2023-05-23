import java.util.Scanner;
public class Processor {
    int i5_1=3400;
    int i3_3=2400;
    int i7_3=3400;

     public int processor() {
         System.out.println("Виберіть процессор:");
         System.out.println("1)i5-3;  2)i3-3;  3)i7-3");
         Scanner num1 = new Scanner(System.in);
         int num = num1.nextInt();
         int processor = 0;
         if (num == 1) {
            processor=i5_1;
        }
         if (num == 2){
            processor=i3_3;
        }
         if (num == 3){
            processor=i7_3;
        }
         return processor;

    }
}
