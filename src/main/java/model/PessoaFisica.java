package model;

import javax.swing.JOptionPane;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String rg;
    private double salario;
    
    public PessoaFisica() {
        this("", "", "", "", "", 0);
    }
    
    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String rg, double salario) {
        super(nome);
        super(endereco);
        super(telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }
    
    // **Métodos Getters**

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }

    // **Métodos Setters**

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setSalario(String salario) {
        this.salario = Double.parseDouble(salario);
    }
    
    public void leitura() {	
        super.leitura();
        setCpf(JOptionPane.showInputDialog("Digite o CPF"));	
        setRg(JOptionPane.showInputDialog("Digite o RG"));	
        setSalario(JOptionPane.showInputDialog("Digite o salario"));	
    }
}
