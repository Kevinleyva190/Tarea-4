public class Main {
    public static void main(String[] args) {
        perro perro= new perro("fido", 1, "negro", 5,"chihuahua");
        System.out.println(perro.toString());
        System.out.println(perro.comer());
        System.out.println(perro.mordida());
        System.out.println(perro.venir());
        Gato gato= new Gato("Pelusa",1,"blanco",3.5,"Gato casero");
        System.out.println(gato.toString());
        System.out.println(gato.comer());
        System.out.println(gato.mordida());
        System.out.println(gato.Escalo());

    }
}