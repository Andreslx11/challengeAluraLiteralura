package com.challengedesafioalura.literalura.service;

import com.challengedesafioalura.literalura.model.Autor;
import com.challengedesafioalura.literalura.model.Datos;
import com.challengedesafioalura.literalura.model.DatosAutor;
import com.challengedesafioalura.literalura.model.DatosLibro;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConvierteDatos  implements  IConvierteDatos{


    private ObjectMapper objectMapper = new ObjectMapper();




    //    @Override  recordar que el dato esta sobrescrito
    // .readValue() es el metodo que hace la converción
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


/*
    public Libro convertirDatosLibro(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        Datos datos;
        Libro libro = null;

        try {
            datos = objectMapper.readValue(json, Datos.class);

            for (DatosLibro datosLibro : datos.resultados()) {
                libro = new Libro(datosLibro);
            }
            return libro;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

*/
    public Autor convertirDatosAutor(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        Datos datos;
        Autor autor= null;
        try {
            datos = objectMapper.readValue(json, Datos.class);

            for (DatosLibro datosLibro : datos.resultados()) {
                for (DatosAutor datosAutor : datosLibro.autor()) {
                     autor = new Autor(datosAutor);

                }
            }
            return autor;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
































