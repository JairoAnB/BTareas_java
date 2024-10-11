import java.util.Date;

public class Pelicula {
    private String titulo;
    private Date fechaEstreno;
    private boolean fueArrendada;


    public Pelicula() {
    }

    public Pelicula(String titulo, Date fechaEstreno, boolean fueArrendada) {
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.fueArrendada = fueArrendada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public boolean isFueArrendada() {
        return fueArrendada;
    }

    public void setFueArrendada(boolean fueArrendada) {
        this.fueArrendada = fueArrendada;
    }
}
