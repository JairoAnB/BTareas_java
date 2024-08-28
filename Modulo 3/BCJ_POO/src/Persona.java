public class Persona {

    private String Nombre;
    private int Edad;
    private double peso;
    private double altura;

    public Persona() {
    }
    public Persona(String nombre, int edad, double peso, double altura) {
        Nombre = nombre;
        Edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona[" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ']';
    }
}