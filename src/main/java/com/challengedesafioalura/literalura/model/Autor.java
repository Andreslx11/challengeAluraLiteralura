package com.challengedesafioalura.literalura.model;

public class Autor {
      private   String nombre;
      private   String FechaNacimineto;
      private   String FechaMuerte;

    public Autor(DatosAutor datosAutor)  {
        this.nombre = datosAutor.nombre() ;
        this.FechaNacimineto = datosAutor.FechaNacimineto();
        this.FechaMuerte = datosAutor.FechaMuerte();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimineto() {
        return FechaNacimineto;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        FechaNacimineto = fechaNacimineto;
    }

    public String getFechaMuerte() {
        return FechaMuerte;
    }

    public void setFechaMuerte(String fechaMuerte) {
        FechaMuerte = fechaMuerte;
    }

    @Override
    public String toString() {
        return  "**********************************************" + "\n" +
                "   nombre='" + nombre + '\'' + "\n" +
                "   FechaNacimineto='" + FechaNacimineto + '\'' + "\n" +
                "  FechaMuerte='" + FechaMuerte ;
    }
}
