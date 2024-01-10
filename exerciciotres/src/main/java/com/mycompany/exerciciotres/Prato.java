/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciotres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael.Evaristo
 */
public class Prato {
    private String nome;
    private String tipoCozinha;
    private String tipoPrato;
    private int calorias;
    private List<Integer> classificacoes;

    public Prato(String nome, String tipoCozinha, String tipoPrato, int calorias) {
        this.nome = nome;
        this.tipoCozinha = tipoCozinha;
        this.tipoPrato = tipoPrato;
        this.calorias = calorias;
        this.classificacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }

    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public String getTipoPrato() {
        return tipoPrato;
    }

    public void setTipoPrato(String tipoPrato) {
        this.tipoPrato = tipoPrato;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public List<Integer> getClassificacoes() {
        return classificacoes;
    }

    public void setClassificacoes(List<Integer> classificacoes) {
        this.classificacoes = classificacoes;
    }

    public void atribuirClassificacao(int classificacao) {
        if (classificacao >= 0 && classificacao <= 5) {
            this.classificacoes.add(classificacao);
            System.out.println("Classificação " + classificacao + " estrelas atribuída com sucesso.");
        } else {
            System.out.println("A classificação deve ser um valor entre 0 e 5 estrelas.");
        }
    }

    public double calcularClassificacaoMedia() {
        if (this.classificacoes.isEmpty()) {
            return 0;
        } else {
            double soma = 0;
            for (int classificacao : this.classificacoes) {
                soma += classificacao;
            }
            return soma / this.classificacoes.size();
        }
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s\nTipo de Prato: %s\nTipo de Cozinha: %s\nCalorias: %d\nClassificações: %s\nClassificação Média: %.2f",
                nome, tipoPrato, tipoCozinha, calorias, classificacoes, calcularClassificacaoMedia());
    }
}
