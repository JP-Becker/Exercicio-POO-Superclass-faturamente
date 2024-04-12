package model;

public abstract class Cliente {
    public String nome;
    public double rendimento;
    
    public Cliente(String nome, double rendimento) {
        this.nome = nome;
        this.rendimento = rendimento;
    }
}
