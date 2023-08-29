package eje3.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cuota {
    private Integer numeroCuota;
    private Double montoTotalCuota;
    private Boolean pagada;
    private Date fechaVencimiento;
    private String formaPago;
}
