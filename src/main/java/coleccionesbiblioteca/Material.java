package coleccionesbiblioteca;

public abstract class Material implements Catalogable {

    protected String codigo;
    protected String titulo;
    protected int anio;
    protected boolean disponible;

    public Material(String codigo, String titulo, int anio, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {

        return anio;

    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public abstract String getTipo();

    public void mostrarInfo() {

        String estado;

        if (disponible) {
            estado = "Disponible";
        } else {
            estado = "Prestado";
        }

        System.out.println(
                " [" + getTipo() + "] "
                        + titulo
                        + " (" + anio + ") - "
                        + estado
        );

    }

}
