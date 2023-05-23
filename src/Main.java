import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Processor numProcessor = new Processor();
        int priseProcessor = numProcessor.processor();
        MotherBord numMotherBord = new MotherBord();
        int priseMotherBord =numMotherBord.motherBord();
        Ram numRam =new Ram();
        int priseRam = numRam.ram();
        VideoCard numVideoCard = new VideoCard();
        int priseVideoCard = numVideoCard.videoCard();
        Cooling numCooling = new Cooling();
        int priseCooling = numCooling.cooling();
        Corps numCorps = new Corps();
        int priseCorps = numCorps.corps();
        Hdd numHdd = new Hdd();
        int priseHdd = numHdd.hdd();
        Assembly numAssembly = new Assembly();
        int priseAssembly = numAssembly.assembly();

        int sum = priseProcessor+priseAssembly+priseCooling+priseHdd+priseCorps+priseVideoCard+priseRam+priseMotherBord;

        System.out.println("Вартість компютера:" + sum);





    }


}
