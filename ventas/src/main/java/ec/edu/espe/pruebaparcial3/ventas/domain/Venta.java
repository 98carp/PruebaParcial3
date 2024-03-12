package ec.edu.espe.pruebaparcial3.ventas.domain;

import java.util.Date;

import ec.edu.espe.pruebaparcial3.ventas.external.dto.ProductoDto;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="venta")
@Builder
public class Venta {
    @Id
    private String id;

    private Date fechaVenta;
    private ProductoDto productoDto;
    private Float cantidad;
    private Float valorTotal;
}
