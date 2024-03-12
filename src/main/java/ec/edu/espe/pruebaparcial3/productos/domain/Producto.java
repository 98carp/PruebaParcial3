package ec.edu.espe.pruebaparcial3.productos.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="producto")
@Builder
public class Producto {
    @Id
    private String id;
    @Indexed(unique = true)
    private String codigoUnico;
    private String nombre;
    private String descripcion;
    private Float precio;
    private Float existencia;

}
