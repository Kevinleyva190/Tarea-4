public class perro {
    private String nombre;
    private int edad;
    private String color;
    private double peso;
    private String raza;

    public perro() {
        this.nombre = "";
        this.edad = 0;
        this.color = "";
        this.peso = 0.0;
        this.raza = "";
    }

    public perro(String nombre, int edad, String color, double peso, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getColor() {
        return this.color;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getRaza() {
        return this.raza;
    }

    public String ladrar() {
        return "Guau";
    }

    public String dormir() {
        return "Zzzzzzz";
    }

    public String correr(double distancia) {
        return this.nombre + " corrió " + distancia + " metros";
    }

    @Override
    public String toString() {
        return "perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
    public boolean comer(){
        System.out.print(nombre+ " esta comiendo:");
        boolean resul= Math.random()>0.51;
        return resul;
    }
    public boolean mordida(){
        System.out.print(nombre+" a mordido: ");
        boolean resul1= Math.random()>0.51;
        return resul1;
    }
    public boolean venir(){
        System.out.print(nombre+ " ha venido: ");
        boolean resul2= Math.random()>0.51;
    return resul2;
    }
}
