package ec.edu.espe.pruebaparcial3.productos.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductoReq
{
    private String codigoUnico;
    private String nombre;
    private String descripcion;
    private Float precio;
    private Float existencia;
}
