import javax.swing.*;

/**
 * Created by juliosossai on 23/09/2014.
 */
public class Exercicio2 {

    public static void main(String[] args){
        int numero;
        int a;

        numero = 0;
        a = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número?"));

        a = numero %2;

        if (a == 0 && numero > 0)  {
            JOptionPane.showMessageDialog(null, "O número "+numero+" é número par positivo.");
        } else if (a > 0 && numero > 0){
            JOptionPane.showMessageDialog(null, "O número "+numero+" é número impar positivo.");
        } else if (a == 0 && numero < 0){
            JOptionPane.showMessageDialog(null, "O número "+numero+" é número par e é número negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número "+numero+" é número impar e é número negativo.");
        }



    }
}
