public class Main{

    public static void main(String[] args) {
        
        Vocabolo vocabolario = new Vocabolo();

        try{

            //vocabolario.processaRiga("Oggi ho mangiato, che dici, mangi pure tu oggi?");

            vocabolario.processaRiga(null);

        } catch (EmptyStringException e){

            System.err.println(e.getMessage());

        }
        
        
        System.out.println(vocabolario);
    }

}