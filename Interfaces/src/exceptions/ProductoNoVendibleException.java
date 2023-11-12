package exceptions;

public class ProductoNoVendibleException extends Exception {
    public ProductoNoVendibleException(String mensaje){
        super(mensaje);
    }
}
