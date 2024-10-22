package patronadapter;

public class AdaptadorBusquedaEnLinea implements ServicioBusquedaLibros{
    
    private ServicioBusquedaEnLinea servicioEnLinea;

    public AdaptadorBusquedaEnLinea(ServicioBusquedaEnLinea servicioEnLinea) {
        this.servicioEnLinea = servicioEnLinea;
    }

    @Override
    public String buscarLibro(String titulo) {
        return servicioEnLinea.buscarEnLinea(titulo);
    }
    
}
