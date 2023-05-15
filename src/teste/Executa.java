/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author alan
 */
public class Executa {
    
    public static void main(String[] args) {
        CarroNovo carroNovo = new CarroNovo();
        
        CarroVelho carroVelho = new CarroVelho();
        
        MetodoTaxacao metodoTaxacao = new MetodoTaxacao();
        metodoTaxacao.metodoTaxa(carroNovo);
        metodoTaxacao.metodoTaxa(carroVelho);
        metodoTaxacao.metodoCor(carroVelho);
        metodoTaxacao.metodoCor(carroNovo);
    }
    
}
