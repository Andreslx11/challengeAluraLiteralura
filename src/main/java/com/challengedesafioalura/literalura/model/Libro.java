package com.challengedesafioalura.literalura.model;




import java.util.List;
import java.util.stream.Collectors;

public class Libro {

     private String titulo;
     private List<String> nombreAutor;
     private List<String>  idiomas;
     private  int numeroDescargas;


    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();
        this.nombreAutor = datosLibro.autor().stream().map(DatosAutor::nombre)
                .collect(Collectors.toList());
        this.idiomas = datosLibro.idiomas();
        this.numeroDescargas = datosLibro.numeroDeDescargas();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(List<String> nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public int getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(int numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    @Override
    public String toString() {
        return "******************************************************************" + "\n" +
                              "   titulo='" + titulo + '\'' +  "\n" +
                              "   nombreAutor='" + nombreAutor + '\'' + "\n" +
                              "   idiomas=" + idiomas + "\n" +
                               "   numeroDescargas=" + numeroDescargas + "\n" +
               "******************************************************************";
    }
}
