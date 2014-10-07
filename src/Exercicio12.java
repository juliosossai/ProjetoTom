import javax.swing.*;

/**
 * Created by juliosossai on 06/10/2014.
 */
public class Exercicio12 {
    public static void main(String[] args){
        int contador=0;
        String resultado = "";
        String vetor[] = new String[50];

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite um número");

            if (JOptionPane.showConfirmDialog(null,"Cadastrar mais numeros?",null,JOptionPane.YES_NO_OPTION) == 1){
                break;
            }
            contador++;
        }

        for (int i = 0; i <contador ; i++) {
            for (int j = i+1; j <=contador ; j++) {
                if (vetor[i].equals(vetor[j])){
                    resultado = resultado + ", "+j;
                }
            }
            if (resultado != ""){
                System.out.println("O numero "+vetor[i]+" repete nas posições: "+i+resultado );
                resultado = "";
            }
        }

    }
}
