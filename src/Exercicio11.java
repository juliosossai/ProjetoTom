import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

/**
 * Created by juliosossai on 29/09/2014.
 */
public class Exercicio11 {
    public static void main(String[] args){

        char buscaNro;
        int contador=0;

        String vetor[] = new String[30];

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = String.valueOf(i*3);
            System.out.println(vetor[i]);
        }

        buscaNro = JOptionPane.showInputDialog("Qual numero deseja contar? ").charAt(0);

        for (int i = 0; i < vetor.length ; i++) {
            for (int j = 0; j < vetor[i].length() ; j++) {
                if (vetor[i].charAt(j) == buscaNro){
                    contador++;
                }
            }
        }

        System.out.println("O nÃºmero "+buscaNro +" aparece "+ contador+ " vez(es)");
    }

}
