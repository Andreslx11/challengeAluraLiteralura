package com.challengedesafioalura.literalura.service;

// interface para datos genericos
public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

}
