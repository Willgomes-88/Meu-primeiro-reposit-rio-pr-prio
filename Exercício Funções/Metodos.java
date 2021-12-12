import javax.swing.*;

public class Metodos {

    // Método do exercício 01 (Dobro)
    public static float calcDobro(float num){
        return num*2;

    }

    // Método do exercício 2 (Média)
    public static float calMedia(float num1 , float num2, float num3, float num4){

        return (num1 + num2 + num3 + num4) /4;

    }

    //Método do exercício 3 (Produto)
    public static float calcProduto(float num1, float num2){

        return num1 * num2;
    }

    //Método do exercício 4 (Conversor Radianos)
    public static double calcRadiano(int num1){

        return num1 * Math.PI / 180;
    }

    //Método do exercício 5 (Maior Valor)
    public static void maiorValor(int num1, int num2){

        int maior = Math.max(num1, num2);  // (Retorna o maio valor entre os números declarados )

        //int maior = (num1>num2) ? num1 : num2; //(Operador Condicional)

        JOptionPane.showMessageDialog(null,"Maior número entre entre eles: " + maior);

        }

    // Método do exercício 6 (Informar o mês)
    public static void informaMes(int num){

        switch (num){
            case 1:
                JOptionPane.showMessageDialog(null,"Janeiro","MÊS",JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:
                JOptionPane.showMessageDialog(null,"Fevereiro","MÊS",JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null,"Março","MÊS",JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null,"O valor não corresponde a nenhum mês do primeiro trimestre","ERRO",
                        JOptionPane.ERROR_MESSAGE);
        }
    }

    //Método do exercício 7 (fatorial)
    public static int calcFatorial(int num){
        int i, fat=num;

       for(i=num-1;i>=1;i--){
           fat *= i;
             }

       return fat;
        }

        //Método do exercício 8 (Número Primo)

    public static void testeNumeroPrimo(int num){
        int i, contador=0;

        for (i=1;i<=num;i++){

             if(num % i ==0){
            contador ++;    }
        }

        if (contador==2) {
            JOptionPane.showMessageDialog(null,"Número informado: "+num+ "\nO número informado É primo.","RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            JOptionPane.showMessageDialog(null,"Número informado: "+num+ "\nO número informado NÃO é primo.","RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

