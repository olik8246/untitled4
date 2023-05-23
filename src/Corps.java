import java.util.Scanner;

public class Corps {
    int corsair = 2800;
    int nzxt = 4000;
    int fractal = 5000;
    public int corps() {
        System.out.println("Виберіть корпус:");
        System.out.println("1)Corsair Carbide Series 275R;  2)NZXT H510;  3)Fractal Design Meshify C");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int corps = 0;
        if (num == 1) {
            corps=corsair;
        }
        if (num == 2){
            corps=nzxt;
        }
        if (num == 3){
            corps=fractal;
        }
        return corps;
    }
}
