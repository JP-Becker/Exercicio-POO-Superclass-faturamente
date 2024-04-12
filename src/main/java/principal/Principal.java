package principal;
import java.util.*;
import javax.swing.*;
import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        while(true) {
            String tipo = JOptionPane.showInputDialog( "Digite PF para Pessoa Fisica ou PJ para jurídica (ou Sair para encerrar)");
            
            if (tipo.equalsIgnoreCase("Sair")) {
                break;
            }
            
            String nome = JOptionPane.showInputDialog("Nome:");
            double rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento:"));
        
            if (tipo.equalsIgnoreCase("PF")) {
                clientes.add(new PessoaFisica(nome, rendimento));
            } else if (tipo.equalsIgnoreCase("PJ")) {
                clientes.add(new PessoaJuridica(nome, rendimento));
            }
        }
        Cliente clienteMaiorRendimento = clientes.get(0);
            for (Cliente c : clientes) {
                if (c.rendimento > clienteMaiorRendimento.rendimento) {
                    clienteMaiorRendimento = c;
                }
            }
            JOptionPane.showMessageDialog(null, "Cliente com maior rendimento atual: " + clienteMaiorRendimento.nome);
    }
}
