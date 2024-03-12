package ec.edu.espe.pruebaparcial3.productos.dao;

import ec.edu.espe.pruebaparcial3.productos.domain.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  ProductoRepository extends MongoRepository<Producto,String> {

    Producto findByCodigoUnico(String codigoUnico);
}
