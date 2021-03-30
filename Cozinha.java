//package atividadecozinha;

import java.util.ArrayList;
    
/**
 *
 * @author samir
 */
public class Cozinha {
    
    private final int horaAbertura;
    private final int horaFechamento;
    private final String pratoPrincipal;
    
    private ArrayList<Ingredientes> ingrediente;
    private ArrayList<Funcionarios> funcionario;
    
    public Cozinha(int horaAbertura, int horaFechamento, String pratoPrincipal) {
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        ingrediente = new ArrayList<>();
        funcionario = new ArrayList<>();
    }
    

    void listaDeIngredientes(Ingredientes i) {
        ingrediente.add(i);
    }
    void listaDeFuncionarios(Funcionarios func) {
        funcionario.add(func);
    }
    
    public void imprimirFuncionarios(){
        System.out.println("Lista de Funcionarios da Cozinha: ");
        for (Funcionarios f: funcionario) {
            System.out.print(f+", ");
        }
        System.out.println("\n");
    }
    
    public void imprimirListaCozinha() {
        imprimirFuncionarios();
        System.out.println("Horario de Abertura da Cozinha: " + this.horaAbertura + " horas");
        System.out.println("Horario de Fechamento da Cozinha: " + this.horaFechamento + " horas");
        System.out.println("Prato Principal: " + this.pratoPrincipal);
        
        
        boolean tipoDaCozinha = false;
        
        for (Ingredientes i : ingrediente) {
            if (tipoDaCozinha == false) {
                
                System.out.println(i.tipoDaCozinha()+"\n");
                tipoDaCozinha = true;
            }
            System.out.println(i);
        }
        System.out.println("\n===============================================================");
    }
    
}
