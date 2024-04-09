package model;

import javax.swing.JOptionPane;

public class Cliente {
    String nome;
    String endereco;
    String telefone;
    
    public Cliente() {
        this("", "", "");
    }
    
    public Cliente (String nome, String endereco, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }
    
     // **Métodos Getters**

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    // **Métodos Setters**

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void leitura() {	
        setNome(JOptionPane.showInputDialog("Digite o nome"));	
        setEndereco(JOptionPane.showInputDialog("Digite o endereco"));	
        setTelefone(JOptionPane.showInputDialog("Digite o telefone"));	
    }	
    public void imprimir() {		
        JOptionPane.showMessageDialog(null,"O nom é " + getNome() +"\nEndereco: " + getEndereco() + "\nTelefone: " + getTelefone());	
    }	
}
