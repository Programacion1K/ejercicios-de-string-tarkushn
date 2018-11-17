import javax.swing.*;

public class Reloj {

    private int horas;
    private int minutos;
    private int segundos;
    private static char simbolo=':';
    private static int numeroRelojes=0;

    public Reloj(){
        this(0,0,0);

    }

    public Reloj(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        numeroRelojes++;
    }


    public static void  cambiaSeparador(char c){
        simbolo=c;


    }

    public static String esValida (int horas, int minutos, int segundos) {
        String salida="";
        if (horas>=24 || minutos>=60 || segundos>=60){
            salida+="La hora no es valida";

        } else {
            salida+="Es valida";
        }
        return salida;
    }

    public  String devuelveHora(){
        String salida="";
        salida+=(this.horas<10?"0":"")+horas;
        salida+=simbolo;
        salida+=(this.minutos<10?"0":"")+minutos;
        salida+=simbolo;
        salida+=(this.segundos<10?"0":"")+segundos;
        return salida;

    }

    public static int totalRelojes(){
        return numeroRelojes;

    }



    public void leeHora(){
        int horas= Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas: "));
        int minutos= Integer.parseInt(JOptionPane.showInputDialog("Introduce los minutos: "));
        int segundos= Integer.parseInt(JOptionPane.showInputDialog("Introduce los segundos: "));

        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;


    }

    public void sumaTiempo(int sumaHoras, int sumaMinutos, int sumaSegundos){
        int totalSegundos=sumaSegundos+segundos;
        if (totalSegundos>59){
            segundos=totalSegundos%60;
        } else {
            this.segundos=totalSegundos;
        }
        int minutosSobrantes=totalSegundos/60;
        int totalMinutos=(sumaMinutos+minutos+minutosSobrantes);
        this.minutos=totalMinutos%60;
        int horasSobrantes=totalMinutos/60;
        int totalHoras=sumaHoras+horas+horasSobrantes;
        this.horas=totalHoras%24;


    }


}



