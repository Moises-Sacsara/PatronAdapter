package patronadapter;

public class AdaptadorBusquedaLocal implements ServicioBusquedaLibros{
    
    private ServicioBusquedaLocal servicioLocal;

    public AdaptadorBusquedaLocal(ServicioBusquedaLocal servicioLocal) {
        this.servicioLocal = servicioLocal;
    }

    @Override
    public String buscarLibro(String titulo) {
        return servicioLocal.buscarEnBaseDatos(titulo);
    }
}
