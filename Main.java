import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Vocabolo vocabolario = new Vocabolo();

        System.out.print("Inserire la stringa da processare, inserisci 'exit' per terminare l'input: ");
            
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        while(!str.equalsIgnoreCase("exit")){

            try{

                vocabolario.processaRiga(str);

            } catch (EmptyStringException e){

                System.err.println(e.getMessage());

            }

            str = input.nextLine();

        }

        System.out.println("\n---RISULTATI---\n");

        System.out.println(vocabolario);

        input.close();

    }

}