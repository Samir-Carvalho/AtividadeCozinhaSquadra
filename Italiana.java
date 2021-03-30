//package atividadecozinha;

/**
 *
 * @author samir
 */
public class Italiana extends Ingredientes{
    
    public Italiana(String nomeIngrediente, String dataValidade) {
        super(nomeIngrediente, dataValidade);
    }
    
    @Override
    public String tipoDaCozinha() {
        return "Cozinha Italiana";
    }
}
