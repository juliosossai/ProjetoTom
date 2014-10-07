import javax.swing.*;

/**
 * Created by juliosossai on 25/09/2014.
 */
public class Exercicio7 {
    public static void main(String[] args){

        int dia;
        int mes;
        int ano;

        dia = 0;
        mes = 0;
        ano = 0;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias"));

        mes = (dia/365)*12;
        ano = dia/365;

        JOptionPane.showMessageDialog(null,"Você tem "+ano+" ano "+ mes+" meses e "+dia);




    }
}
