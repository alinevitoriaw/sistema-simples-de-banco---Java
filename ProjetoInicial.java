package projeto.inicial;

import Cadastro.Pessoa;

public class ProjetoInicial {

    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa("Aline", 19, 400, 123456789);
        System.out.println(novaPessoa.getNome());
        novaPessoa.setNome("Aline");
    }
    
}
