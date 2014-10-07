import javax.swing.*;
import javax.xml.soap.Text;

/**
 * Created by juliosossai on 25/09/2014.
 */
public class Exercicio8 {
    public static void main(String[] args){
        int ano;
        int mes;
        int dia;
        int resut;
        String x;

        ano = 0;
        mes = 0;
        dia = 0;
        resut = 0;

        x = JOptionPane.showInputDialog("Digite sua idade em ano, mes e dia");

        ano = Integer.parseInt(x.substring(0,2));
        mes = Integer.parseInt(x.substring(2,4));
        dia = Integer.parseInt(x.substring(4,6));

        resut = ((ano * 365) + (mes * 30) + dia);

        JOptionPane.showMessageDialog(null,"Você tem "+resut);
    }
}
