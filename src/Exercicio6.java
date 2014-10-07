import javax.swing.*;

/**
 * Created by juliosossai on 25/09/2014.
 */
public class Exercicio6 {

    public static void main(String[] args){
        double vlrFabrica;
        double percDist;
        double percImp;
        double custoCons;

        vlrFabrica = 0;
        percDist = 28;
        percImp = 45;
        custoCons = 0;

        vlrFabrica = Integer.parseInt(JOptionPane.showInputDialog("Digite o custo da fábrica"));

        custoCons = ((vlrFabrica*((percDist/100)+1))*((percImp/100)+1));

        JOptionPane.showMessageDialog(null,"Custo ao Consumidor é de "+custoCons);
    }
}
