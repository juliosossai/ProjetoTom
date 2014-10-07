import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by juliosossai on 26/09/2014.
 */
public class Exercicio9 {
    public static void main(String[] args){
        String horaIni;
        String horaFin;
        int duracaoh;
        int duracaom;
        String hrp;
        String mmp;

        duracaoh = 0;
        duracaom = 0;

        horaIni = JOptionPane.showInputDialog("Digite a hora de entrada no formato hh:mm");
        horaFin = JOptionPane.showInputDialog("Digite a hora de sa´da no formato hh:mm");

        duracaoh = (Integer.parseInt(horaFin.substring(0,2))-Integer.parseInt(horaIni.substring(0,2)))*60;
        duracaom = duracaoh+(Integer.parseInt(horaFin.substring(3,5))-Integer.parseInt(horaIni.substring(3,5)));

        duracaoh = (duracaom/60);
        duracaom = duracaom %60;

        if (String.valueOf(duracaoh).length() == 1){
           hrp = "0"+duracaoh;
        } else {
           hrp = ""+duracaoh;
        }
        if (String.valueOf(duracaom).length() == 1){
           mmp = "0"+duracaom;
        } else {
           mmp = ""+duracaom;
        }

        JOptionPane.showMessageDialog(null,"Duração da Palestra foi de "+hrp+":"+mmp);

    }
}
