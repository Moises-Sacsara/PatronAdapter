package patronadapter;

public class SistemaGestionBiblioteca {
    private ServicioBusquedaLibros servicioBusqueda;

    public SistemaGestionBiblioteca(ServicioBusquedaLibros servicioBusqueda) {
        this.servicioBusqueda = servicioBusqueda;
    }

    public void buscar(String titulo) {
        String resultado = servicioBusqueda.buscarLibro(titulo);
        System.out.println(resultado);
    }
}
