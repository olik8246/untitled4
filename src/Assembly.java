import java.util.Scanner;

public class Assembly {
    int yes = 700;
    int no = 0;
    public int assembly() {
        System.out.println("Зборка компютера 700 грн:");
        System.out.println("1)Так;  2)Ні");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int assembly = 0;
        if (num == 1) {
            assembly=yes;
        }
        if (num == 2){
            assembly=no;
        }

        return assembly;
    }
}
