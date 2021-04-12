import java.util.*;

public class Vocabolo {
    
    LinkedHashMap<String, Integer> vocaboli;

    public Vocabolo(){

        this.vocaboli = new LinkedHashMap<String, Integer>();

    }

    public void processaRiga(String riga) throws EmptyStringException {
        // 'riga' è una riga di testo
                                                // NOTA: e se ci fossero parole con l'apostrofo?
    
        if(riga==null){

            throw new EmptyStringException();

        } else{

            String[] parole = riga.split("\\W+");      // NOTA: e se riga valesse null?

            for(int i=0; i<parole.length; i++){

                parole[i] = parole[i].toLowerCase();

            }

            for (int i=0; i<parole.length; i++) {
        
                String parola = parole[i];

                if (vocaboli.containsKey(parola)) {
            
                    Integer valorePrecedente = vocaboli.get(parola);

                    vocaboli.put(parola, valorePrecedente+1);
            
                } else {
            
                    vocaboli.put(parola, 1);

                }

            }

        }
            
        
    }

    public String toString(){

        String output = "";
        
        // estraggo tutte le chiavi dal mio vocabolario

        Set<String> chiavi = vocaboli.keySet();

        // Costruisco un ciclo che consudera tutte le chiavi

        for(String chiave : chiavi){ //foreach

            // stampo il valore associato alla chiave

            output += chiave + "\t("+ vocaboli.get(chiave)+ " occorrenze)\n"; 

        }

        return output;

    }
}
