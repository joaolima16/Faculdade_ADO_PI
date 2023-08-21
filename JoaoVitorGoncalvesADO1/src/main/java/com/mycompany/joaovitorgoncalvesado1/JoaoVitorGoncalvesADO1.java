/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joaovitorgoncalvesado1;

/**
 *
 * @author João Vitor
 */
public class JoaoVitorGoncalvesADO1 {

    public static void main(String[] args) {
        Jabuti jose = new Jabuti();
        jose.setNome("jose");
        jose.setHumor("triste");
        jose.dormir();
        jose.humor();
        jose.setPeso(15);
        jose.verificarPeso();
        Jabuti joao = new Jabuti("joao", 12, "feliz");
        joao.verificarPeso();
        joao.humor();
        
    }
}
