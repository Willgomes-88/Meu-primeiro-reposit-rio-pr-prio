import javax.swing.*;

public class Exercício05 {

    // Criar um programa que mostre o maior valor entre dois números usando um método do tipo void (sem retorno)
    public static void main(String[] args) {

            // declaração das variáveis
            String entraValor1, entraValor2;
            int valor1, valor2;

            // Entrada de valores
            entraValor1 = JOptionPane.showInputDialog(null,"Informe o valor do primeiro número: ","MAIOR VALOR",
                    JOptionPane.QUESTION_MESSAGE);
            valor1 = Integer.parseInt(entraValor1);

            entraValor2 = JOptionPane.showInputDialog(null,"Informe o valor do segundo número: ","MAIOR VALOR",
                    JOptionPane.QUESTION_MESSAGE);
            valor2 = Integer.parseInt(entraValor2);

            // Processamento da condição usando o método.
            Metodos.maiorValor(valor1, valor2);

    }
}
