import javax.swing.*;

public class Exercício03 {

    // Criar um programa que receba dois valores e calcule o produto através de um método
    public static void main(String[] args) {

        //Declaração das Variáveis
        String entraValor1, entraValor2;
        float valor1, valor2, resultado;

        //Entrada de valores
        entraValor1 = JOptionPane.showInputDialog(null,"Informe o primeiro valor: ","CALCULO PRODUTO", JOptionPane.QUESTION_MESSAGE);
        entraValor1 = entraValor1.replace(',','.');

        valor1 = Float.parseFloat(entraValor1);

        entraValor2 = JOptionPane.showInputDialog(null,"Informe o segundo valor: ","CÁLCULO PRODUTO",JOptionPane.QUESTION_MESSAGE);
        entraValor2 = entraValor2.replace(',','.');

        valor2 = Float.parseFloat(entraValor2);

        //Cálculo do produto  através do método.
        resultado = Metodos.calcProduto(valor1, valor2);

        //Saída do resultado.
        JOptionPane.showMessageDialog(null,String.format("Primeiro valor informado: %.2f\nSegundo valor informado: %.2f\nValor do produto entre estes números: %.2f",
                valor1, valor2, resultado),"CÁLCULO PRODUTO",JOptionPane.INFORMATION_MESSAGE);







    }
}
