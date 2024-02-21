public class Flor extends Planta{
    private String colorPetalos;

    private int cantPetalos;
    private String colorPistillo;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor() {
    }

    public Flor(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, int cantPetalos, String colorPistillo, String variedadFlor, String estacionFlorece) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy una Flor");
    }
}
