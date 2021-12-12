import javax.swing.*;

public class Exercício08 {

    /* Criar um programa que verifique se um número é primo ou não, através de um método.
    Número primo é divisível somente por 1 e por ele mesmo.*/

    public static void main(String[] args) {

        //Declaração de variáveis
        String entraValor;
        int valor;

        //Entrada dos valores
        entraValor = JOptionPane.showInputDialog(null,"Informe o valor: ","TESTE NUMERO PRIMO", JOptionPane.QUESTION_MESSAGE);
        valor = Integer.parseInt(entraValor);

        // Teste através do método
        Metodos.testeNumeroPrimo(valor);

    }
}
