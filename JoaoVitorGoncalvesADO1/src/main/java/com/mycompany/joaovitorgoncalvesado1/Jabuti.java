/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joaovitorgoncalvesado1;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author João Vitor
 */
public class Jabuti {
    private String nome;
    private int peso;

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }
    private String humor;

    public Jabuti(String nome, int peso, String humor) {
        this.nome = nome;
        this.peso = peso;
        
    }
    public Jabuti(){
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void dormir(){
        System.out.println(" O " + this.getNome() + " está dormindo no momento");
    }
    public void humor(){
        switch(this.getHumor()){
            case "feliz":
                System.out.println(" O Jabuti" + this.getNome() + "Está feliz!!!");
                break;
            case "triste":
                System.out.println(" O Jabuti " + this.getNome() + " está triste. Anime ele!");
                break;
        }
    }
    public void verificarPeso(){
        if(getPeso() > 12){
            System.out.println("O jabuti " + getNome() + " está acima do peso ");
        }
        else if(getPeso() < 6){
            System.out.println("O jabuti " + getNome() + " está abaixo do peso ");
        }
        else{
            System.out.println("O jabuti " + getNome() + " está no peso ideal ");
        }
    }
}
