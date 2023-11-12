package interfaces;

import clases.Producto;
import exceptions.ProductoNoVendibleException;

@FunctionalInterface
public interface Filtrable {
boolean cumpleFiltro(Producto producto) throws ProductoNoVendibleException;;
}
