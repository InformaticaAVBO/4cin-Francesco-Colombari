import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Campionato {
    Squadra[] elenco;
    
    public Campionato(String fname) throws FileNotFoundException{
        
        File f = new File(fname);
        Scanner leggi = new Scanner(f);
        
        int i=0;
        while (leggi.hasnextline()) {
            String s = leggi.nextLine();
            String[] ss= s.split(",");
            elenco [i]= new Squadra(ss[0], Integer.parseInt(ss[1]), i, i, i, i);
            if (++i>=20)break;
        }
        leggi.close();    
    }
    
    public Squadra getSquadra(int i){
        return elenco[i];
    }
    
    public Squadra getSquadraByName(String nome){
        
    }
    
}
