/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author alan
 */
public class MetodoTaxacao {

    public void metodoTaxa(Teste item) {
        System.out.println("A taxa é: " + item.getTaxa());

    }

    public void metodoCor(Teste item) {
        if (item.getCor() == "duco") {
            System.out.println("O carro é velho");
        } else {
            System.out.println("Carro novo");

        }
    }

}
