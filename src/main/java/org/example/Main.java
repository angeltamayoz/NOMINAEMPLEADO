package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15);
        LocalDate fechaContratacion = LocalDate.of(2020, 3, 1);

        System.out.println("***************************");
        System.out.println("SISTEMA DE NÓMINA");
        System.out.println("***************************");

        System.out.println("\n Bienvenido !!!");

        Scanner sc = new Scanner(System.in);

        //CONTRUCTORES LLENOS Y VACÍOS
        Empleado empleado = new Empleado();
        Empleado empleado2 = new Empleado(1L,"Juan", "Gallego", "Calle 24 #76-55", "3004008998", "juan.gallego@gmail.com", "1010987655", fechaNacimiento, "Casado", "Hombre", "Arquitecto", 2000000.00, fechaContratacion, true, 50, 500000.00);

        Area area = new Area();
        Area area2 = new Area(1L, "Desarrollo de Software", "Departamento encargado del desarrollo de aplicaciones", "DS01", "Ana López", 50, 500000.00, "Edificio A, Piso 3", "555-5678", "desarrollo@email.com", true);

        Beneficiario beneficiario = new Beneficiario();
        Beneficiario beneficiario2 = new Beneficiario(1L, "María", "Pérez", "Esposa", "555-4321", "Calle Falsa 456", "maria.perez@email.com", "XYZ98765", LocalDate.of(1991, 7, 20), "Femenino", 50.00);

        Sucursal sucursal = new Sucursal();
        Sucursal sucursal2 = new Sucursal( 1L, "Sucursal Norte", "Avenida Siempre Viva 789", "SN001", "Carlos Gómez", "555-6789", "sucursalnorte@email.com", 100, 1200000.00, "Bogotá", "Colombia");

        Nomina nomina = new Nomina();
        Nomina nomina2 = new Nomina(1L, empleado2, 3000.00, 500.00, 2500.00, 300.00, 10.0, 150.00, 200.00, "Mensual", "2024-09-30");

        //SCANNER OBJETOS
        // Crear objeto Empleado
        System.out.println("****EMPLEADO****");
        System.out.print("Nombre del empleado: ");
        empleado.setNombre(sc.nextLine());

        System.out.print("Apellido: ");
        empleado.setApellido(sc.nextLine());

        System.out.print("Dirección: ");
        empleado.setDireccion(sc.nextLine());

        System.out.print("Teléfono: ");
        empleado.setTelefono(sc.nextLine());

        System.out.print("Email: ");
        empleado.setEmail(sc.nextLine());

        System.out.print("Número de identificación: ");
        empleado.setNumeroIdentificacion(sc.nextLine());

        System.out.print("Fecha de nacimiento: ");
        System.out.print("\nAño: ");
        Integer anio = sc.nextInt();

        System.out.print("Mes: ");
        Integer mes = sc.nextInt();

        System.out.print("Día: ");
        Integer dia = sc.nextInt();
        sc.nextLine(); 
        empleado.setFechaNacimiento(LocalDate.of(anio, mes, dia));

        System.out.print("Estado civil: ");
        empleado.setEstadoCivil(sc.nextLine());

        System.out.print("Género: ");
        empleado.setGenero(sc.nextLine());

        System.out.print("Puesto: ");
        empleado.setPuesto(sc.nextLine());

        System.out.print("Salario base: ");
        empleado.setSalarioBase(sc.nextDouble());

        System.out.print("Fecha de contratación: ");
        System.out.print("\nAño: ");
        Integer anioC = sc.nextInt();

        System.out.print("Mes: ");
        Integer mesC = sc.nextInt();

        System.out.print("Día: ");
        Integer diaC = sc.nextInt();
        sc.nextLine();
        empleado.setFechaContratacion(LocalDate.of(anioC, mesC, diaC));

        System.out.print("¿Es tiempo completo (true/false)?: ");
        empleado.setEsTiempoCompleto(sc.nextBoolean());

        System.out.print("Horas trabajadas: ");
        empleado.setHorasTrabajadas(sc.nextInt());

        System.out.print("Bonificaciones: ");
        empleado.setBonificaciones(sc.nextDouble());
        sc.nextLine();


        // Crear objeto Beneficiario
        System.out.println("****BENEFICIARIO****");
        System.out.println("Datos del Beneficiario:");
        System.out.print("Nombre: ");
        beneficiario.setNombre(sc.nextLine());

        System.out.print("Apellido: ");
        beneficiario.setApellido(sc.nextLine());

        System.out.print("Relación: ");
        beneficiario.setRelacion(sc.nextLine());

        System.out.print("Teléfono: ");
        beneficiario.setTelefono(sc.nextLine());

        System.out.print("Dirección: ");
        beneficiario.setDireccion(sc.nextLine());

        System.out.print("Email: ");
        beneficiario.setEmail(sc.nextLine());

        System.out.print("Número de identificación: ");
        beneficiario.setNumeroIdentificacion(sc.nextLine());

        System.out.print("Fecha de nacimiento: ");
        System.out.print("\nAño: ");
        Integer anioB = sc.nextInt();

        System.out.print("Mes: ");
        Integer mesB = sc.nextInt();

        System.out.print("Día: ");
        Integer diaB = sc.nextInt();
        sc.nextLine();
        beneficiario.setFechaNacimiento(LocalDate.of(anioB, mesB, diaB));

        System.out.print("Género: ");
        beneficiario.setGenero(sc.nextLine());

        System.out.print("Porcentaje de beneficio: ");
        beneficiario.setPorcentajeBeneficio(sc.nextDouble());
        sc.nextLine();

        // Crear objeto Sucursal
        System.out.println("\nDatos de la Sucursal:");
        System.out.print("Nombre de la sucursal: ");
        sucursal.setNombre(sc.nextLine());

        System.out.print("Dirección: ");
        sucursal.setDireccion(sc.nextLine());

        System.out.print("Código: ");
        sucursal.setCodigo(sc.nextLine());

        System.out.print("Gerente: ");
        sucursal.setGerente(sc.nextLine());

        System.out.print("Teléfono: ");
        sucursal.setTelefono(sc.nextLine());

        System.out.print("Email: ");
        sucursal.setEmail(sc.nextLine());

        System.out.print("Número de empleados: ");
        sucursal.setNumeroEmpleados(sc.nextInt());

        System.out.print("Presupuesto anual: ");
        sucursal.setPresupuestoAnual(sc.nextDouble());
        sc.nextLine();

        System.out.print("Ciudad: ");
        sucursal.setCiudad(sc.nextLine());

        System.out.print("País: ");
        sucursal.setPais(sc.nextLine());

        System.out.println("\n--- Información final Empleado 1 ---");
        System.out.println("\nEmpleado:\n" + empleado);
        System.out.println("Beneficiario:\n" + beneficiario);
        System.out.println("\nSucursal:\n" + sucursal);

        System.out.println("\n--- Información final Empleado 2 ---");
        System.out.println("\nEmpleado:\n" + empleado2);
        System.out.println("Beneficiario:\n" + beneficiario2);
        System.out.println("\nSucursal:\n" + sucursal2);
    }
}