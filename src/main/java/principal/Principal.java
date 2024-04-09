package principal;
import model.Cliente;
import model.PessoaFisica;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.leitura();
        cliente.imprimir();
        
        
        PessoaFisica pf = new PessoaFisica();
        
        pf.leitura();
        pf.imprimir();
    }
}
