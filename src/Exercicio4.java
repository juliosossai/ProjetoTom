import javax.swing.*;

/**
 * Created by juliosossai on 24/09/2014.
 */
public class Exercicio4 {

    public static void main(String[] args){

        int tabuada;
        int vezes;

        tabuada = 0;
        vezes = 0;

        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada que precisa"));

        for (int i=0; i<10; i++){
            int resutado=0;
            vezes = vezes+1;
            resutado = tabuada*vezes;

            System.out.println(tabuada+"X"+vezes+"="+resutado);

            resutado = 0;
        }

    }
}
