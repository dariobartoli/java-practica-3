public class Arbusto extends Planta{
    private Double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, Double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePoda) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePoda = sePoda;
    }

    public Double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(Double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un Arbusto");
    }
}
