package coordenadas_geograficas.com.example.coordenadas_geograficas;

/**
 * Created by Victor on 08/02/2018.
 */

public class GeoPuntoAlt extends GeoPunto {

    private double altura; //nuevo atributo para almacenar la altura
    private double d;

    public GeoPuntoAlt(double rlongitud, double rlatitud, double altura) {
        super(rlongitud, rlatitud);
        this.altura = altura;
    }

    public double distancia2 (GeoPuntoAlt punto){
        System.out.println("Distancia2");
        d = Math.sqrt(Math.pow(super.distancia(punto),(2))+ Math.pow((altura-punto.altura),(2)));
        d=d/1000;
        return d;
    }
}
