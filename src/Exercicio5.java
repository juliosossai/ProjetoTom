import javax.swing.*;

/**
 * Created by juliosossai on 24/09/2014.
 */
public class Exercicio5 {

    public static void main(String[] args){

        int tabuada;
        int vezes;
        int x;

        tabuada = 0;
        vezes = 0;
        x = 0;


        do {
            tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada que precisa"));

            if (tabuada > 1 && tabuada < 10){
                x=x+1;
            } else {
                JOptionPane.showMessageDialog(null, "Numero não aceito, ecolha de 1 a 10");
                x = 0;
            }
        } while (x != 1);


        if (tabuada>=1 && tabuada<=10){
            for (int i=0; i<10; i++){
                int resutado=0;
                vezes = vezes+1;
                resutado = tabuada*vezes;

                System.out.println(tabuada+"X"+vezes+"="+resutado);

                resutado = 0;
            }
        }
    }
}
