/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kissteria;

/**
 *
 * @author jacks
 */
public class Mistico extends Personagem {
    private int inteligencia;
    private int recuperacao;

    public Mistico(String nome, int pontosVida, int pontosAtaque, int pontosDefesa, String tipoPersonagem,
                   int inteligencia, int recuperacao) {
        super(nome, pontosVida, pontosAtaque, pontosDefesa, tipoPersonagem);
        this.inteligencia = inteligencia;
        this.recuperacao = recuperacao;
    }

    @Override
    public void atacar(Personagem adversario) {
        int dano = inteligencia - adversario.pontosDefesa;
        adversario.pontosVida -= dano;
        this.pontosVida += recuperacao; // Mistico recupera pontos de vida ao atacar
    }
     public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getRecuperacao() {
        return recuperacao;
    }

    public void setRecuperacao(int recuperacao) {
        this.recuperacao = recuperacao;
    }
}
