package com.challengedesafioalura.literalura.principal;

import com.challengedesafioalura.literalura.model.*;
import com.challengedesafioalura.literalura.service.ConsumoAPI;
import com.challengedesafioalura.literalura.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<Libro> librosRegistrados= new ArrayList<>();
    private List<Autor>  autoresRegistrados = new ArrayList<>();
    private Datos datos;
    public void mostrarMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    ****************************************************************************************************************************
                    *                                                                                                                          *                                                                       
                    *                                                                                                                          *
                                            *              ELija La opción a través de su número:                                                                      * 
                                            *                     1- buscar libro por título                       * 
                                            *                     2- Listar libros registrados                     * 
                                            *                     3- Listar autores registrados                    *  
                                            *                     4- Listar autores vivos en un determinado año    *
                                            *                     5- Listar libros por idioma                      *  
                                            *                     0- salir                                         *
                                            *                                                                      *                                                                       
                    *****************************************************************************************************
                    """;


            try{
                System.out.println(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Opción invalida");
                break;
            }

            switch (opcion) {
                case 1:
                    buscarLibroPorTituloWeb();
                    break;
                case 2 :
                    listarLibrosRegistrados();
                    break;
                case 3 :
                    listarAutoresRegistrados();
                    break;
                case 4 :
                    listarAutoresVivosEnUnDeterminadoAño();
                    break;
                case 0:
                    System.out.println("""
                            ****************************************************************
                             
                                         ¡Gracias usar nuestros servicios!
                                          Cerrando app....................
                             
                            ****************************************************************
                            """);
                    break;
                default:
                    System.out.println("Opción no validad, elija una opción del menu");
                    break;

            }


        }

    }


    private Datos getDatosLibro() {
        var tituloLibro = teclado.nextLine();
        var json = consumoAPI.obtenerDatosAPI(URL_BASE + "?search=" + tituloLibro.replace(" ", "+"));
        datos = conversor.obtenerDatos(json, Datos.class);
        return datos;

    }

    private void buscarLibroPorTituloWeb() {
        System.out.println("¿Que libro desea buscar?");
        Datos datos = getDatosLibro();
        System.out.println(datos);
        if(!datos.resultados().isEmpty()) {
            DatosLibro datosLibro =  datos.resultados().get(0);
            Libro libro = new Libro(datosLibro);
            librosRegistrados.add(libro);
            System.out.println(libro);

            DatosAutor datosAutor = datos.resultados().get(0).autor().get(0);
            Autor autor = new Autor(datosAutor);
            autoresRegistrados.add(autor);

        } else{
            System.out.println("Libro no encontrado ");
        }


    }

    private void listarLibrosRegistrados() {
        librosRegistrados.forEach(System.out::println);

    }

    private void listarAutoresRegistrados() {
        autoresRegistrados.forEach(System.out::println);
    }

    private void listarAutoresVivosEnUnDeterminadoAño() {
        System.out.println("Ingresa el año que quieres consultar que escritores estavan vivos: ");
       var yearQuery = teclado.nextInt();
        List<Autor> consultarAutoresVivoEnUnYear = autoresRegistrados.stream()
                .filter( a -> {
                    var fechaNacimiento = Integer.parseInt(a.getFechaNacimineto());
                    var fechaMuerte= a.getFechaMuerte() != null ? Integer.parseInt(a.getFechaMuerte()): Integer.MAX_VALUE;
                    return yearQuery >=  fechaNacimiento  && (yearQuery < fechaMuerte || fechaMuerte == 0);
                }) .collect(Collectors.toList());
        consultarAutoresVivoEnUnYear.forEach(System.out::println);

    }








































}

//    private Libro getDatosLibro(){
//         System.out.println("¿Que libro desea buscar?");
//         var tituloLibro = teclado.nextLine();
//         var json = consumoAPI.obtenerDatosAPI(URL_BASE + "?search=" + tituloLibro.replace(" ", "+"));
////        System.out.println(json);
//         Libro datos = conversor.convertirDatosLibro(json);
//        System.out.println( datos );
//        return datos;
//}

//    private void buscarLibroPorTituloWeb() {
//        Datos datos = getDatosLibro();
//        System.out.println(datos);
//        boolean libroEncontrrasdo= false;
//         for (DatosLibro datosLibro : datos.resultados()) {
//             if(!libroEncontrrasdo) {
//                 Libro libro = new Libro(datosLibro);
//                 librosRegistrados.add(libro);
//                 System.out.println(libro);
//                 libroEncontrrasdo= true;
//
//             }
//
//        }
//    }