package coordenadas_geograficas.com.example.coordenadas_geograficas;

public abstract class GeoPunto {
    //Definición de atributos
    private double longitud;
    private double latitud;

    private int longitudent;
    private int latitudent;

    public GeoPunto (double longitud, double latitud){
        longitudent = int (longitud*1E16);
        latitudent = int (latitud*1E16);
    }
    public String toString(){
        return "Longitud: " + longitud + ", Latitud: " + latitud;
    }

    /** distancia entre dos puntos. Se usa el punto1 y el pasado en la llamada
     * para hacer el cáclulo de la distancia de los dos puntos
     * @param punto para que se calcule la distancia.
     * @return la distnacia entre los dos puntos.
     */
    public double distancia (GeoPunto punto){
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

}
