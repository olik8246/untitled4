import java.util.Scanner;

public class VideoCard {
    int rtx3080 = 45000;
    int gtx1060 = 4500;
    int gtx1660 = 13000;
    public int videoCard() {
        System.out.println("Виберіть відеокарту:");
        System.out.println("1)NVIDIA GeForce RTX 3080;  2)Gigabyte PCI-Ex GeForce GTX 1060 3072MB;  3)NVIDIA GeForce GTX 1660 Ti");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        int videoCard = 0;
        if (num == 1) {
            videoCard=rtx3080;
        }
        if (num == 2){
            videoCard=gtx1060;
        }
        if (num == 3){
            videoCard=gtx1660;
        }
        return videoCard;
    }
}
