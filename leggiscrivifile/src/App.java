import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        
        System.out.print("Inserisci il nome del file di input: ");
        String nomeFileIn = scannerInput.nextLine();
        
        System.out.print("Inserisci il nome del file di output: ");
        String nomeFileOut = scannerInput.nextLine();
            scannerInput.close(); 
        
        // garantisce che gli oggetti vengano chiusi automaticamente, anche in caso di eccezioni.
        try (
            Scanner leggiFile = new Scanner(new File(nomeFileIn));
            
            FileWriter myWriter = new FileWriter(nomeFileOut)
        ) {
            
            int conteggioRighe = 0;
            
            while (leggiFile.hasNextLine()) {
                String riga = leggiFile.nextLine();
                
                myWriter.write(riga);
                myWriter.write(System.lineSeparator()); 
                conteggioRighe++;
            }
            System.out.println("Il file è stato copiato");
            System.out.println("Copiato " + conteggioRighe + " righe da '" + nomeFileIn + "' a '" + nomeFileOut + "'.");

        } catch (IOException e) {
            System.err.println("\n❌ Errore durante l'operazione sui file: " + e.getMessage());
        }
    }
}
