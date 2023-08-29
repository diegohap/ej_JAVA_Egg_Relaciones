package eje3;

import eje3.model.Cliente;
import eje3.model.Poliza;
import eje3.model.Vehiculo;
import eje3.service.ClienteService;
import eje3.usecases.Initialization;
import eje3.service.PolizaService;
import eje3.service.VehículoService;

import java.util.*;

public class Applicacion {
    private Integer op;
    private final int salir = 30;
    private Scanner t = new Scanner(System.in).useDelimiter("\n");
    PolizaService ps = PolizaService.getInstance(null);
    VehículoService vs = VehículoService.getInstance(null);
    ClienteService cs = ClienteService.getInstance(null);

    public Applicacion(){
        Initialization.initialize(cs, vs, ps);
        op=0;
        while(op != salir){
            menu();
            System.out.print("opcion --> ");
            op = t.nextInt();
            caseOption(op);
        }
    }

    private void caseOption(Integer op) {
        switch (op){
            case 1 -> {
                creaNuevoCliente();
            }
            case 2 -> {
                crearNuevoVehiculo();
            }
            case 3 -> {
                crearNuevaPoliza();
            }
            case 4 -> {
                listarClientes();
            }
            case 5 -> {
                mostrarClientePorId();
            }
            case 6 -> {
                mostrarClientePorApellido();
            }
            case 7 -> {
                listarVehiculos();
            }
            case 8 -> {
                mostrarVehiculoPorId();
            }
            case 9 -> {
                mostrarVehiculoPor("marca", t.next());
            }
            case 10 -> {
                mostrarVehiculoPor("modelo", t.next());
            }
            case 11 -> {
                mostrarVehiculoPor("anio", t.nextInt());
            }
            case 12 -> {
                mostrarVehiculoPor("numeroMotor", t.next());
            }
            case 13 -> {
                mostrarVehiculoPor("chasis", t.next());
            }
            case 14 -> {
                mostrarVehiculoPor("tipo", t.next());
            }
            case 15 -> {
                listarPolizas();
            }
            case 16 -> {
                System.out.print("ingrese el numero de poliza a buscar --> ");
                mostrarPolizaPorNumeroPoliza(t.nextInt());
            }
        }
    }

    private void creaNuevoCliente(){
        System.out.println("Ingrese los datos del nuevo cliente:");
        Cliente cliente = new Cliente();
        System.out.print("Nombre: ");
        cliente.setNombre(t.next());
        System.out.print("Apellido: ");
        cliente.setApellido(t.next());
        System.out.print("Documento: ");
        cliente.setDocumento(t.next());
        System.out.print("eMail: ");
        cliente.setEmail(t.next());
        System.out.print("Domicilio: ");
        cliente.setDomicilio(t.next());
        System.out.print("Telefono: ");
        cliente.setTelefono(t.next());
        cs.add(cliente);
    }
    private void crearNuevoVehiculo(){
        System.out.println("Ingrese los datos del nuevo vehiculo:");
        Vehiculo vehiculo = new Vehiculo();
        System.out.print("Modelo: ");
        vehiculo.setModelo(t.next());
        System.out.print("Marca: ");
        vehiculo.setMarca(t.next());
        System.out.print("Anio: ");
        vehiculo.setAnio(t.nextInt());
        System.out.print("Numero de Motor: ");
        vehiculo.setNumeroMotor(t.next());
        System.out.print("Numero de Chasis: ");
        vehiculo.setChasis(t.next());
        System.out.print("Color: ");
        vehiculo.setColor(t.next());
        System.out.print("Tipo: ");
        vehiculo.setTipo(t.next());
        vs.add(vehiculo);
    }
    private void crearNuevaPoliza(){
        System.out.println("Ingrese los datos de la nueva Poliza:");
        Integer numPol = t.nextInt();
        Optional<Poliza> oPoliza = mostrarPolizaPorNumeroPoliza(numPol);
        if(oPoliza.isEmpty())
            return;
        Poliza poliza = new Poliza();
        System.out.print("Numero de Poliza");
        poliza.setNumeroPoliza(numPol);
        System.out.print("Anio, Mes y Dia de INCIO del vencimiento");
        poliza.setFechaInicio(new Date(t.nextInt(), t.nextInt(), t.nextInt()));
        System.out.print("Anio, Mes y Dia de FIN del vencimiento");
        poliza.setFechaInicio(new Date(t.nextInt(), t.nextInt(), t.nextInt()));
        System.out.print("Cantidad de Cuotas: ");
        poliza.setCantidadCuotas(t.nextInt());
        System.out.print("Forma de Pago: ");
        poliza.setFormaPago(t.next());
        System.out.print("Monto total asegurado en $ARS: ");
        poliza.setMontoTotalAsegurado(t.nextDouble());
        System.out.print("Incluye Granizo (s/n): ");
        String letra = "o";
        while(!letra.equals("s") && !letra.equals("n"))
            letra = t.next().toLowerCase();
        poliza.setIncluyeGranizo(letra.equals("s"));
        System.out.print("Monto maximo asegurado para Granizo en $ARS: ");
        poliza.setMontoMaximoGranizo(t.nextDouble());
        System.out.print("Tipo de covertura: ");
        poliza.setTipoCobertura(t.next());
        // FALTA TERMINAR
    }
    private void listarClientes(){
        Optional<List<Cliente>> oClientes = cs.getAll();
        if (oClientes.isEmpty())
            System.out.println("no hay clientes cargados");
        else
            oClientes.get().forEach(System.out::println);
    }
    private Optional<Cliente> mostrarClientePorId(){
        System.out.print("ingrese el ID del cliente a buscar --> ");
        Optional<List<Cliente>> oClientes = cs.findByAttributeName("id", t.nextInt());
        Cliente c;
        if (oClientes.isEmpty())
            System.out.println("cliente no encontrado");
        else {
            c =oClientes.get().get(0);
            System.out.println(c);
            return Optional.of(c);
        }
        return Optional.empty();
    }
    private Optional<Cliente> mostrarClientePorApellido(){
        System.out.print("ingrese el apellido a buscar --> ");
        Optional<List<Cliente>> oClientes = cs.findByAttributeName("apellido", t.next());
        List<Cliente> clientes;
        if (oClientes.isEmpty())
            System.out.println("cliente no encontrado");
        else {
            clientes = new ArrayList<>(oClientes.get());
            if(clientes.size() > 1){
                System.out.println("elija un cliente por id");
                return Optional.of(cs.findByAttributeName("id", t.nextInt()).get().get(0));
            }
            return Optional.of(clientes.get(0));
        }
        return Optional.empty();
    }
    private void listarVehiculos() {
        Optional<List<Vehiculo>> oVehiculos = vs.getAll();
        if (oVehiculos.isEmpty())
            System.out.println("no hay clientes cargados");
        else
            oVehiculos.get().forEach(System.out::println);
    }
    private Optional<Vehiculo> mostrarVehiculoPorId(){
        Optional<List<Vehiculo>> oVehiculo = vs.findByAttributeName("id", t.nextInt());
        Vehiculo v;
        if (oVehiculo.isEmpty())
            System.out.println("cliente no encontrado");
        else {
            v =oVehiculo.get().get(0);
            System.out.println(v);
            return Optional.of(v);
        }
        return Optional.empty();
    }
    private Optional<Vehiculo> mostrarVehiculoPor(String attrib, Object value){
        Optional<List<Vehiculo>> oVehiculo = vs.findByAttributeName(attrib, value);
        List<Vehiculo> vehiculo;
        if (oVehiculo.isEmpty())
            System.out.println("cliente no encontrado");
        else {
            vehiculo = new ArrayList<>(oVehiculo.get());
            if(vehiculo.size() > 1){
                System.out.println("elija un vehiculo por id");
                return Optional.of(vs.findByAttributeName("id", t.nextInt()).get().get(0));
            }
            return Optional.of(vehiculo.get(0));
        }
        return Optional.empty();
    }
    private void listarPolizas(){
        Optional<List<Poliza>> oPolizas = ps.getAll();
        if (oPolizas.isEmpty())
            System.out.println("no hay clientes cargados");
        else
            oPolizas.get().forEach(System.out::println);
    }
    private Optional<Poliza> mostrarPolizaPorNumeroPoliza(Object value){
        Optional<List<Poliza>> oPolizas = ps.findByAttributeName("numeroPoliza", value);
        Poliza p;
        if (oPolizas.isEmpty())
            System.out.println("cliente no encontrado");
        else {
            p =oPolizas.get().get(0);
            System.out.println(p);
            return Optional.of(p);
        }
        return Optional.empty();
    }


    public void menu(){
        String m = "---   MENU DE OPCIONES   ---" +
                "1. Crear nuevo cliente" +
                "2. Crear nuevo vehiculo" +
                "3. Crear nueva poliza" +
                "4. Listar Clientes" +
                "5. Buscar Cliente por ID" +
                "6. Buscar Cliente por Apellido" +
                "7. Listar Vehículos" +
                "8. Buscar Vehículo por ID" +
                "9. Buscar Vehículo por Marca" +
                "10. Buscar Vehículo por Modelo" +
                "11. Buscar Vehículo por anio" +
                "12. Buscar Vehículo por numero de motor" +
                "13. Buscar Vehículo por numero de chasis" +
                "14. Buscar Vehículo por tipo" +
                "15. Listar Polizas" +
                "16. Buscar Poliza por numero de poliza";
    }
}
