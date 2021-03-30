//package atividadecozinha;

/**
 *
 * @author samir
 */
public class AtividadeCozinha {


    public static void main(String[] args) {
        cozinhaMineira();
        cozinhaChinesa();
        cozinhaItaliana();
    }
    
    private static void cozinhaMineira(){
        Cozinha cozinhaMineira = new Cozinha(14,20,"Feijoada");
        
        Ingredientes ingredienteMineira = new Mineira("Feijão","20/08/2020");
        cozinhaMineira.listaDeIngredientes(ingredienteMineira);
        
        ingredienteMineira = new Mineira("Farinha","02/09/2020");
        cozinhaMineira.listaDeIngredientes(ingredienteMineira);
        
        ingredienteMineira = new Mineira("Arroz","10/11/2020");
        cozinhaMineira.listaDeIngredientes(ingredienteMineira);
        
        ingredienteMineira = new Mineira("Carne de Porco","03/04/2020");
        cozinhaMineira.listaDeIngredientes(ingredienteMineira);
        
        ingredienteMineira = new Mineira("Linguiça","04/04/2020");
        cozinhaMineira.listaDeIngredientes(ingredienteMineira);
        
        Funcionarios func = new Funcionarios("Samir","Chefe de Cozinha");
        cozinhaMineira.listaDeFuncionarios(func);
        func = new Funcionarios("Pedro","Cozinheiro");
        cozinhaMineira.listaDeFuncionarios(func);
        func = new Funcionarios("Carol","Cozinheira");
        cozinhaMineira.listaDeFuncionarios(func);
        func = new Funcionarios("Leo","Ajudante");
        cozinhaMineira.listaDeFuncionarios(func);
        
        cozinhaMineira.imprimirListaCozinha();
    }
    
    
    private static void cozinhaChinesa(){
        Cozinha cozinhaChinesa = new Cozinha(10,21,"Yakissoba");
        
        Ingredientes ingredienteComidaChinhesa = new Chinesa("Champignon","10/08/2021");
        cozinhaChinesa.listaDeIngredientes(ingredienteComidaChinhesa);
        
        ingredienteComidaChinhesa = new Chinesa("Brócolis","15/04/2020");
        cozinhaChinesa.listaDeIngredientes(ingredienteComidaChinhesa);
        
        ingredienteComidaChinhesa = new Chinesa("Macarrão","10/01/2021");
        cozinhaChinesa.listaDeIngredientes(ingredienteComidaChinhesa);
        
        ingredienteComidaChinhesa = new Chinesa("Carne","05/04/2020");
        cozinhaChinesa.listaDeIngredientes(ingredienteComidaChinhesa);
        
        Funcionarios func = new Funcionarios("Samir","Chefe de Cozinha");
        cozinhaChinesa.listaDeFuncionarios(func);
        func = new Funcionarios("Vitoria","Cozinheira");
        cozinhaChinesa.listaDeFuncionarios(func);
        func = new Funcionarios("Sandro","Ajudante");
        cozinhaChinesa.listaDeFuncionarios(func);
        cozinhaChinesa.imprimirListaCozinha();
    }
    
    
    private static void cozinhaItaliana(){
        Cozinha cozinhaItaliana = new Cozinha(13,22,"Yakissoba");
        
        Ingredientes ingredienteComidaItaliana = new Italiana("Molho","20/08/2020");
        cozinhaItaliana.listaDeIngredientes(ingredienteComidaItaliana);
        
        ingredienteComidaItaliana = new Italiana("Macarrão","24/05/2020");
        cozinhaItaliana.listaDeIngredientes(ingredienteComidaItaliana);
        
        ingredienteComidaItaliana = new Italiana("Carne","06/05/2020");
        cozinhaItaliana.listaDeIngredientes(ingredienteComidaItaliana);
        
        Funcionarios func = new Funcionarios("Samir","Chefe de Cozinha");
        cozinhaItaliana.listaDeFuncionarios(func);
        func = new Funcionarios("Vi","Cozinheiro");
        cozinhaItaliana.listaDeFuncionarios(func);
        
        cozinhaItaliana.imprimirListaCozinha();
    }
}
