package core;

import java.io.File;

public class Persiste {
    public static File partida = new File(System.getProperty("user.home")+"\\FairyQuest\\"+Engine.nombreJugador+".csv");
    public static boolean partidaExiste = partida.exists();
}
