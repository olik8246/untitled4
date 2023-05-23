import java.util.Scanner;

public class Cooling {
    int coolerMaster = 2000;
    int noctua = 4000;
    int corsairHydroSeries = 5800;
    public int cooling() {
        System.out.println("Виберіть охолодження:");
        System.out.println("1)Cooler Master Hyper 212 RGB;  2)Noctua NH-D15;  3)Corsair Hydro Series H100i RGB Platinum");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int cooling = 0;
        if (num == 1) {
            cooling=coolerMaster;
        }
        if (num == 2){
            cooling=noctua;
        }
        if (num == 3){
            cooling=corsairHydroSeries;
        }
        return cooling;
    }
}
