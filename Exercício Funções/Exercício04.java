import javax.swing.*;

public class Exercício04 {

    // Criar um programa que receba um grau e converta para radianos através de um método
    public static void main(String[] args) {

        //Declaração de variáveis
        String entraValor;
        int valor;
        double conversao;

        //Entrada de dados
        entraValor = JOptionPane.showInputDialog(null,"Informe o valor do ângulo: ","CONVERSÃO PARA RADIANOS",JOptionPane.QUESTION_MESSAGE);
        valor = Integer.parseInt(entraValor);

        // Cálculo da conversão através do método
        conversao = Metodos.calcRadiano(valor);

        //Saída do resultado
        JOptionPane.showMessageDialog(null,String.format("Valor do ângulo informado: %dº\nValor em graus para radianos: %.4f",valor, conversao),"RESULTADO",
                JOptionPane.INFORMATION_MESSAGE);






    }
}
