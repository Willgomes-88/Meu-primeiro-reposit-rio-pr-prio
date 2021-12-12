import javax.swing.*;

public class Exercício02 {

    // Criar um programa que receba quatro notas e calcule a média aritmética, através de um método

    public static void main(String[] args) {
        // Criação de vetores e declaração das variáveis
        String[] entraNotas = new String[4];
        float[] notas = new float[4];
        float resultado ;
        int i;

        //Laço de repetição para a entrada das 4 notas
        for (i = 0; i < 4; i++) {

            entraNotas[i] = JOptionPane.showInputDialog(null, "Informe a nota número " + (i+1)  + ":", "CÁLCULO MÉDIA",
                    JOptionPane.QUESTION_MESSAGE);
            entraNotas[i] = entraNotas[i].replace(',','.');

            notas[i] = Float.parseFloat(entraNotas[i]);
        }
        // Cálculo da média através do método
        resultado = Metodos.calMedia(notas[0], notas[1], notas[2], notas[3]);

        //Saída informando as notas e a média
        JOptionPane.showMessageDialog(null, String.format("Nota 01: %.1f\nNota 02: %.1f\nNota 03: %.1f\nNota 04: %.1f\nMédia das Notas: %.2f",
                notas[0], notas[1], notas[2], notas[3], resultado),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
    }
}
