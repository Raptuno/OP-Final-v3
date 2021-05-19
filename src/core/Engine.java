package core;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Engine {
    public static List<String> hadasPorRescatar = new ArrayList<>();
    public static List<String> hadasRescatadas = new ArrayList<>();
    public static String[] nombreHada = { //No copié los nombres de las driadas de Terraria, no, para nada...
            "Alalia",
            "Alura",
            "Ariella",
            "Caelia",
            "Calista"
    }
            ; // Fin nombres hadas
    
    //Nombre y atributos del jugador
    public static int saludJugador = 100;
    public static String nombreJugador = new String();
    public static int PoderJugador = 10;
    
    //Nombre y atributos del mago
    public static String nombreMago = "Drelas"; //Referencia a Skyrim
    public static int saludMago = 1000;
    public static int poderMago = hadasPorRescatar.size();
    
    //Inicializadores
    
    //Hadas Por Rescatar
    private static void hprInit(String nombre){
    
    }
}
