package ec.edu.espe.pruebaparcial3.ventas.external.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductoDto {
    private String codigoUnico;
    private String nombre;
    private Float precio;
}
