package eje3.model;

import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Poliza {
    private Integer numeroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer cantidadCuotas;
    private String formaPago;
    private Double montoTotalAsegurado;
    private Boolean incluyeGranizo;
    private Double montoMaximoGranizo;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<Cuota> cuotas;
}
