package coordenadas_geograficas.com.example.coordenadas_geograficas;

/**
 * Created by Victor on 07/02/2018.
 */

public class Principal {
    public static void main(String[] main) {
        GeoPuntoAlt punto1;
        GeoPuntoAlt punto2;
        double resultado;
        Object lista[4];

        lista[0] = new

        punto1 = new GeoPuntoAlt(-5.9591776, 37.3914105, 50); //sevilla
        punto2 = new GeoPuntoAlt(-6.2684345, 36.5008762, 300); //cadiz

        System.out.println("Punto1: "+punto1);
        System.out.println("Punto2: "+punto2);

        resultado= punto1.distancia2(punto2);
        System.out.println("Distancia entre Sevilla y Cadiz: "+ resultado/1000);


    }
}
