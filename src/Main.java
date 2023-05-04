import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GameProgress gameProgress1 = new GameProgress(98, 150, 3, 345);
        GameProgress gameProgress2 = new GameProgress(85, 103, 3, 158.6);
        GameProgress gameProgress3 = new GameProgress(74, 112, 4, 187);

        GameProgress.saveGame("C:\\Users\\B\\Desktop\\Games1\\savegames\\save1.dat", gameProgress1);
        GameProgress.saveGame("C:\\Users\\B\\Desktop\\Games1\\savegames\\save2.dat", gameProgress2);
        GameProgress.saveGame("C:\\Users\\B\\Desktop\\Games1\\savegames\\save3.dat", gameProgress3);

        GameProgress.zipFile("C:\\Users\\B\\Desktop\\Games1\\savegames\\zip.gameProgress1",
                "C:\\Users\\B\\Desktop\\Games1\\savegames\\save1.dat");
        GameProgress.zipFile("C:\\Users\\B\\Desktop\\Games1\\savegames\\zip.gameProgress2",
                "C:\\Users\\B\\Desktop\\Games1\\savegames\\save2.dat");
        GameProgress.zipFile("C:\\Users\\B\\Desktop\\Games1\\savegames\\zip.gameProgress3",
                "C:\\Users\\B\\Desktop\\Games1\\savegames\\save3.dat");

    }
}