package com.challengedesafioalura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//mapeo datos del objeto results del api

@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(

        @JsonAlias("results") List<DatosLibro>  resultados
) {

}






