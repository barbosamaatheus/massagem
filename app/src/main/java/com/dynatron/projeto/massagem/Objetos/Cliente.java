package com.dynatron.projeto.massagem.Objetos;

/**
 * Created by User on 13/07/2018.
 */

public class Cliente {

    private String nome;
    private String endereço;
    private String telefone;
    private String numTotal;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.numTotal = "0";

    }

    public Cliente(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public Cliente(String nome, String endereço, String numTotal, String numMes) {
        this.nome = nome;
        this.endereço = endereço;
        this.numTotal = numTotal;

    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                ", numTotal='" + numTotal + '\'' +
                '}';
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNumTotal() {
        return numTotal;
    }

    public void setNumTotal(String numTotal) {
        this.numTotal = numTotal;
    }

}
