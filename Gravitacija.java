import java.util.*;

public class Gravitacija {

    public static final double GRAVITACIJSKA_KONSTANTA = 6.674 * Math.pow(10, -11);
    public static final double MASA_ZEMLJE = 5.972 * Math.pow(10, 24);
    public static final double POLMER_ZEMLJE = 6.371 * Math.pow(10, 6);

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double visina = sc.nextDouble();
        // Student B doda staticno double metodo izracunaj(visina)
        // Student C doda staticno void metodo izpis()
        double gravPospesek = izracunaj(visina);
        izpis(gravPospesek);
    }

    public static double izracunaj(double visina){
        return (GRAVITACIJSKA_KONSTANTA * MASA_ZEMLJE) / Math.pow((POLMER_ZEMLJE + visina), 2);
    }
    
    public static void izpis(double gravPospesek) {
        // izpis vrednosti
        System.out.println(gravPospesek);
    }
}