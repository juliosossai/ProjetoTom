import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by juliosossai on 06/10/2014.
 */
public class Exercicio15 {
    public static void main(String[] args){
        List<Integer> vetor = new ArrayList<Integer>();
        int continua;
        int auxiliar=0;
        int contador=0;

        do {
            vetor.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número:")));
            continua = JOptionPane.showConfirmDialog(null,"Continuar digitando?",null,JOptionPane.YES_NO_OPTION);
            contador++;
        }while (continua == 0);

        for (int i = 0; i < vetor.size() ; i++) {
            for (int j = 0; j < vetor.size() ; j++) {

                if (vetor.get(i) < vetor.get(j)){
                    auxiliar = vetor.get(j);
                    vetor.set(vetor.indexOf(vetor.get(j)), vetor.get(i));
                    vetor.set(vetor.indexOf(vetor.get(i)), auxiliar);
                }
            }
        }

        System.out.println();
        for (Integer nome : vetor) {
            System.out.println(nome);
        }

    }
}
