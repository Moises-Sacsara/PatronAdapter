package patronadapter;

public class PatronAdapter {

    public static void main(String[] args) {
     
        ServicioBusquedaEnLinea servicioEnLinea = new ServicioBusquedaEnLinea();
        SistemaGestionBiblioteca sistemaEnLinea = new SistemaGestionBiblioteca(new AdaptadorBusquedaEnLinea(servicioEnLinea));
        sistemaEnLinea.buscar("El Loro");

        
        ServicioBusquedaLocal servicioLocal = new ServicioBusquedaLocal();
        SistemaGestionBiblioteca sistemaLocal = new SistemaGestionBiblioteca(new AdaptadorBusquedaLocal(servicioLocal));
        sistemaLocal.buscar("1993");
    }
    
}
