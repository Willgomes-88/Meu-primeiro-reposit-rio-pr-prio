import javax.swing.*;

public class Exercício01 {

    // Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro, através de um método.

    public static void main(String[] args) {

        // Criação das variáveis
        String entraValor;
        float valor, resultado;

        // Entrada de dados
        entraValor = JOptionPane.showInputDialog(null,"Informe o valor:","CÁLCULO DOBRO",JOptionPane.QUESTION_MESSAGE);
        entraValor = entraValor.replace(',','.');
        valor = Float.parseFloat(entraValor);

        // Cálculo usando o método
        resultado =  Metodos.calcDobro(valor);

        // Saída do resultado
        JOptionPane.showMessageDialog(null,String.format("O dobro do valor é %.2f",resultado),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);

    }

}
