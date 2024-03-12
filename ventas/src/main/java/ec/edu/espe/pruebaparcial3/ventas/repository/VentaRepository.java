package ec.edu.espe.pruebaparcial3.ventas.repository;

import ec.edu.espe.pruebaparcial3.ventas.domain.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  VentaRepository extends MongoRepository<Venta,String> {

}
