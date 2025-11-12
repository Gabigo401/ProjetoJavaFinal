/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author AMD
 */
public class Bebida extends Alimento implements Imposto_Alcool{
      public boolean alcolico;

    public Bebida(boolean alcolico, String nome, double preço) {
        super(nome, preço);
        this.alcolico = alcolico;
    }

    public boolean isAlcolico() {
        return alcolico;
    }

    public void setAlcolico(boolean alcolico) {
        this.alcolico = alcolico;
    }

    @Override
    public double calcularImpostoAlcool() {
        if(alcolico){
            return getPreço() * 0.10;
        }else{
            return 0.0;
        }
    }
    
    public double getPrecoComImposto() {
    return getPreço() + calcularImpostoAlcool();
    }
}
