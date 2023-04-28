import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class GestionIPS {
    public static void main(String[] args) {
        String archivo = "Zonas_wifi.csv";


        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;

            // Leer línea por línea del archivo de texto
            int n = 100;
            // Lee 
            while ((linea = lector.readLine()) != null && --n>0) {
                System.out.println(linea);
            }


            // Cerrar el lector
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
