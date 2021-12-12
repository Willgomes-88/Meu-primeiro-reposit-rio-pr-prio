import javax.swing.*;

public class Exercício07 {

    /*Criar um programa que retorne o fatorial de um número, usando um método que receba
    um valor e retorne o fatorial desse valor.
    Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120*/

    public static void main(String[] args) {

        //Declaração das variáveis
        String entraValor;
        int valor, resultado;

        // Entrada de dados
        entraValor = JOptionPane.showInputDialog(null,"Informe o valor do número a ser fatorado: ","FATORIAL",
                JOptionPane.QUESTION_MESSAGE);

        valor = Integer.parseInt(entraValor);

        // Cálculo através do método
        resultado = Metodos.calcFatorial(valor);

        //Saída do resultado
        JOptionPane.showMessageDialog(null,"Resultado do numero fatorado: " +resultado,"RESULTADO",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
