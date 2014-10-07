import javax.swing.*;
import javax.swing.text.StringContent;
import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

/**
 * Created by juliosossai on 26/09/2014.
 */
public class Exercicio10 {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<String>();

        int x;
        String retornoNomes;
        x = 0;
        retornoNomes = "";

        do {
            nomes.add(showInputDialog("Digite um nome"));
            if (x == 0){
               x = JOptionPane.showConfirmDialog(null, "Deseja digitar outro nome?", null, JOptionPane.YES_NO_OPTION);
            }
        } while (x != 1);

        char letra =  JOptionPane.showInputDialog("Digite uma letra.").charAt(0);

        for (int i = 0; i < nomes.size() ; i++) {
            if (nomes.get(i).charAt(0) == letra){
                System.out.println(nomes.get(i));

                retornoNomes = retornoNomes + nomes.get(i)+" |" ;
            }

        }

        JOptionPane.showMessageDialog(null, retornoNomes);

    }
}
