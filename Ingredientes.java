
//package atividadecozinha;

/**
 *
 * @author samir
 */
public abstract class Ingredientes {
    private String nomeIngrediente;
    private String dataValidade;
    
    public Ingredientes(String nomeIngrediente,String dataValidade){
        this.nomeIngrediente = nomeIngrediente;
        this.dataValidade = dataValidade;
    }
    
    public String getNomeIngrediente() {
        return nomeIngrediente;
    }
    public String getDataValidade(){
        return dataValidade;
    }
    
    public abstract String tipoDaCozinha();
    
    @Override
    public String toString() {
        return "Nome do Ingrediente : " + getNomeIngrediente()+ "/Data de Validade: " + getDataValidade();
    }
    
    
}
