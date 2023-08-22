//Palette class name
class Paleta{
    // class attributes
    private String sabor;
    private double precio;
    // create the constructor
    public Paleta(String sabor,double precio){
        this.sabor=sabor;
        this.precio=precio;
    }
    //create the get and set methods of the flavor and price attributes
    public String getSabor(){
        return sabor;
    }
    public void setSabor(String sabor){
        this.sabor=sabor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInformacion(){
        System.out.println("Sabor: "+sabor);
        System.out.println("Precio: $"+precio);
    }
     // create the method changePrice()
     void cambiarPrecio(double cantidad){
        precio+=cantidad;
    }
    public void condimentos(){

    }
}