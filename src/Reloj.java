import javax.swing.*;

public class Reloj {

    private int horas;
    private int minutos;
    private int segundos;
    private static char Simbolo=':';
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
        Simbolo=c;


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
        salida+=Simbolo;
        salida+=(this.minutos<10?"0":"")+minutos;
        salida+=Simbolo;
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

    public void sumaTiempo(int SumaHoras, int SumaMinutos, int SumaSegundos){
        int totalSegundos=SumaSegundos+segundos;
        this.segundos=totalSegundos%60;
        int MinutosSobrantes=(this.segundos+SumaSegundos)/60;
        int totalMinutos=(SumaMinutos+minutos+MinutosSobrantes);
        this.minutos=totalMinutos%60;
        int HorasSobrantes=totalMinutos/60;
        int totalHoras=SumaHoras+horas+HorasSobrantes;
        this.horas=totalHoras%24;


    }


}



