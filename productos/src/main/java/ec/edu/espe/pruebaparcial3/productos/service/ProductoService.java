package ec.edu.espe.pruebaparcial3.productos.service;

import ec.edu.espe.pruebaparcial3.productos.dao.ProductoRepository;
import ec.edu.espe.pruebaparcial3.productos.domain.Producto;
import ec.edu.espe.pruebaparcial3.productos.dto.ProductoReq;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Transactional
    public Producto crearProducto(ProductoReq productoReq){
        Producto producto=this.transformProductoReq(productoReq);
        Producto productotemp=this.productoRepository.findByCodigoUnico(productoReq.getCodigoUnico());

        if (productotemp == null) {
            return this.productoRepository.save(producto);
        } else {
            throw new RuntimeException("Producto con ese código ya existe");
        }

    }

    private Producto transformProductoReq(ProductoReq productoReq) {
        Producto producto=Producto.builder()
                            .codigoUnico(productoReq.getCodigoUnico())
                            .nombre(productoReq.getNombre())
                .descripcion(productoReq.getDescripcion())
                .precio(productoReq.getPrecio())
                .existencia(productoReq.getExistencia())
                .build();
        return producto;


    }
}
