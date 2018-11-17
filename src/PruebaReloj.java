/*
 * PruebaReloj
 *
 * Versión: 7-oct-2016
 *
 */


/**
 *
 * @author Miguel-David Orrico Teruel
 */
public class PruebaReloj {

    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Reloj reloj1;
        Reloj reloj2;
        Reloj reloj3;
        reloj1=new Reloj();
        reloj2=new Reloj(3,45,5);
        System.out.println("Un reloj tiene la hora:"+reloj1.devuelveHora());
        System.out.println("El otro tiene la hora:"+reloj2.devuelveHora());
        // System.out.println("Tenemos "+Reloj.totalRelojes()+" relojes");
        System.out.println("Cambiamos el separador a -");
        Reloj.cambiaSeparador('-');
        System.out.println("El otro tiene la hora:"+reloj2.devuelveHora());
        System.out.println("Leemos una hora");
        reloj3=new Reloj();
        reloj3.leeHora();
        System.out.println("Y la escribimos");
        System.out.println("El reloj leído tiene la hora: "+reloj3.devuelveHora());

        System.out.println("Sumamos 6:34:50 a la hora leída");
        reloj3.sumaTiempo(6, 34, 50);
        System.out.println("Ahora el reloj leído tiene la hora:"
                +reloj3.devuelveHora());
        System.out.println("Tenemos "+Reloj.totalRelojes()+" relojes");
        System.out.println("La hora 23:70:34 ¿Es válida?"
                +Reloj.esValida(23, 70, 34));

        while(true){
            Thread.sleep(1000);
            reloj3.sumaTiempo(0,0,1);
            System.out.println(reloj3.devuelveHora());
        }
    }

}
