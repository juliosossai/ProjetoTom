import javax.swing.*;

/**
 * Created by juliosossai on 06/10/2014.
 */
public class Exercicio13 {
    public static void main(String[] args){
        int[] vetor = new int[2] ;
        int auxiliar;

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número"));
        }

        for (int i = 0; i < vetor.length ; i++) {
            for (int j = 0; j < vetor.length ; j++) {
                if (vetor[i] < vetor[j]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
