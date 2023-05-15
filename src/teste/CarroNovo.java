/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author alan
 */
public class CarroNovo extends Teste implements InterTaxa {

    private int taxa = 10;
    private String cor = "Metalica";

    public String getCor() {
        return cor;
    }

    public int getTaxa() {
        return taxa;
    }

    @Override
    public int taxacao(int valor) {

        valor += taxa;
        return valor;

    }

    @Override
    public String cor(Teste item) {
        return item.getCor();
    }

}
