public class Main {
    public static void main(String[] args) {
        // instances of PaletteWater and PaletteCremosa are created by passing values ​​to each xampo
        PaletaAgua paletaAgua=new PaletaAgua("Limon", 23, true);
        PaletaAgua paletaAgua1=new PaletaAgua("Guayaba", 20, true);
        PaletaCrema paletaCrema=new PaletaCrema("Oreo", 30, true);
        PaletaCrema paletaCrema1=new PaletaCrema("Fresa", 35, true);
        // the operations we want are performed for each one
        System.out.println("********************");
        paletaAgua.mostrarInformacion();
        paletaAgua.mostrarBaseAgua();
        paletaAgua.cambiarPrecio(0.0);
        paletaAgua.agregarComplemento("chamoy");
        paletaAgua.mostrarInformacion();
        System.out.println("********************");
        paletaAgua1.mostrarInformacion();
        paletaAgua1.mostrarBaseAgua();
        paletaAgua1.cambiarPrecio(0.0);
        paletaAgua1.agregarComplemento("Miguelito");
        paletaAgua1.mostrarInformacion();
        System.out.println("********************");
        paletaCrema.mostrarInformacion();
        paletaCrema.mostrarBaseCrema();
        paletaCrema.cambiarPrecio(0.0);
        paletaCrema.bañarEnChocolate("blanco");
        paletaCrema.mostrarInformacion();
        System.out.println("********************");
        paletaCrema1.mostrarInformacion();
        paletaCrema1.mostrarBaseCrema();
        paletaCrema1.cambiarPrecio(0.0);
        paletaCrema1.bañarEnChocolate("Amargo");
        paletaCrema1.mostrarInformacion();
        System.out.println("********************");

    }
}
