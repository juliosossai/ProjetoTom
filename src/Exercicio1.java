import javax.swing.*;
import javax.xml.soap.Text;
import java.util.StringTokenizer;

/**
 * Created by juliosossai on 23/09/2014.
 */
public class Exercicio1 {

    public static void main(String[] args){

        double preco1 = 1.30;
        double preco12 = 1.00;
        double total = 0;
        int qtde = 0;

        qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantas maça vai comprar?"));

        if (qtde < 12) {
            total = (qtde * preco1);
        }

        if (qtde >= 12) {
            total = (qtde * preco12);
        }

        //System.out.println("Valor total da compra é "  + total);

        JOptionPane.showMessageDialog(null,"Valor total das " + qtde + " maçãs é " + total);

    }


}
