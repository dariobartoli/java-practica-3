public class Arbol extends Planta{
    private String variedad;
    private String tipoDeTronco;
    private double radioDelTronco;
    private String color;
    private String tipoDeHojas;

    public Arbol() {
    }

    public Arbol(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String variedad, String tipoDeTronco, double radioDelTronco, String color, String tipoDeHojas) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDelTronco = radioDelTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public double getRadioDelTronco() {
        return radioDelTronco;
    }

    public void setRadioDelTronco(double radioDelTronco) {
        this.radioDelTronco = radioDelTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy una Árbol");
    }

}
