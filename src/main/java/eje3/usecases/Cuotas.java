package eje3.usecases;

import eje3.model.Cuota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Cuotas {
    public static final ArrayList<Cuota> CUOTAS_3_PAGAS_1_IMPAGA_SIN_VENCER = new ArrayList<>(Arrays.asList(
            new Cuota(1, 2000.0, true, new Date(2023, 6, 20), "credito"),
            new Cuota(2, 2000.0, true, new Date(2023, 7, 20), "debito"),
            new Cuota(3, 2000.0, true, new Date(2023, 8, 20), "debito"),
            new Cuota(4, 2000.0, false, new Date(2023, 9, 20), "credito")
    ));
    public static final ArrayList<Cuota> CUOTAS_2_PAGAS_1_IMPAGA_VENCIDA = new ArrayList<>(Arrays.asList(
            new Cuota(1, 2000.0, true, new Date(2023, 6, 18), "credito"),
            new Cuota(2, 2000.0, true, new Date(2023, 7, 18), "credito"),
            new Cuota(3, 2000.0, false, new Date(2023, 8, 18), "debito")
    ));
    public static final ArrayList<Cuota> CUOTAS_4_PAGAS_SIN_VENCER = new ArrayList<>(Arrays.asList(
            new Cuota(1, 2000.0, true, new Date(2023, 6, 13), "credito"),
            new Cuota(2, 2000.0, true, new Date(2023, 7, 13), "debito"),
            new Cuota(3, 2000.0, true, new Date(2023, 8, 13), "credito"),
            new Cuota(4, 2000.0, true, new Date(2023, 9, 13), "debito")
    ));
    public static final ArrayList<Cuota> CUOTAS_2_PAGAS_2_IMPAGA_VENCIDAS = new ArrayList<>(Arrays.asList(
            new Cuota(1, 2000.0, true, new Date(2023, 6, 12), "debito"),
            new Cuota(2, 2000.0, true, new Date(2023, 7, 12), "debito"),
            new Cuota(3, 2000.0, false, new Date(2023, 8, 12), "credito"),
            new Cuota(4, 2000.0, false, new Date(2023, 9, 12), "credito")
    ));
}

