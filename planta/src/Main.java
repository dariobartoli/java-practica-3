public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol("Pinito", 10.5,true, "Invierno","Pino", "Leñoso", 2.5, "Verde", "chiquitas");
        Flor flor = new Flor("Rosita", 0.25,true,"verano","rojos", 14, "verde claro", "Rosa", "Verano");
        Arbusto arbusto = new Arbusto("Arbustito", 0.55, true, "primavera", 0.8, false, "Matas", "Verdes", true);

        arbol.decirLoQueSoy();
        flor.decirLoQueSoy();
        arbusto.decirLoQueSoy();
    }
}