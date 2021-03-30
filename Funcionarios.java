//package atividadecozinha;

/**
 *
 * @author samir
 */
public class Funcionarios {
    private String nome;
    private String atividade;

    Funcionarios(String nome, String atividade) {
        this.nome = nome;
        this.atividade = atividade;
    }
    
     public String getNomeFuncionario() {
        return nome;
    }
      public String getAtividade() {
        return atividade;
    }
    
    @Override
    public String toString() {
        return getNomeFuncionario()+ "-Atividade:" + getAtividade();
    }
}
