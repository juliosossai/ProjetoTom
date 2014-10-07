import javax.swing.*;

/**
 * Created by juliosossai on 24/09/2014.
 */
public class Exercicio3 {

    public static void main(String[] args){
        int idade;

        idade = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        if (idade >= 5 && idade <=7){
            JOptionPane.showMessageDialog(null, "Nadador infantil A");
        }
        else if (idade >= 8 && idade <=10){
            JOptionPane.showMessageDialog(null, "Nadador infantil B");
        }
        else if (idade >= 11 && idade <=13){
            JOptionPane.showMessageDialog(null, "Nadador juvenil A");
        }
        else if (idade >= 14 && idade <=17){
            JOptionPane.showMessageDialog(null, "Nadador juvenil B");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nadador adulto");
        }

    }
}
