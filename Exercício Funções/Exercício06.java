import javax.swing.*;

public class Exercício06 {

    /*Criar um programa que receba um número que corresponda a um mês do 1º trimestre e
    escreva o mês correspondente; caso o usuário digite o número fora do intervalo deverá
    aparecer inválido, mas utilizando um método do tipo void.*/

    public static void main(String[] args) {

        //Declaração de variáveis
        String entraValor;
        int valor;

        //Entrada do valor
        entraValor = JOptionPane.showInputDialog(null,"Informe o número correspondente a um  mês do primeiro trimestre : ",
                "INFORMAR MÊS",JOptionPane.QUESTION_MESSAGE);

        valor = Integer.parseInt(entraValor);

        // Verificação e saída de dados usando o método
        Metodos.informaMes(valor);



    }
}
