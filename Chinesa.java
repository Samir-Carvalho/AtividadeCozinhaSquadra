//package atividadecozinha;

/**
 *
 * @author samir
 */
public class Chinesa extends Ingredientes {
    
    public Chinesa(String nomeIngrediente, String dataValidade) {
        super(nomeIngrediente, dataValidade);
    }
    
    @Override
    public String tipoDaCozinha() {
        return "Cozinha Chinesa";
    }
}
