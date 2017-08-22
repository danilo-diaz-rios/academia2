package com.example.daniloenriquediazrios.academia;

/**
 * Created by daniloenriquediazrios on 17/08/17.
 */

public abstract class universidad{

    private String nombre;
    private String tipo;
    private String telefono;

public void ingresarnombre(String nombre){

        this.nombre=nombre;

        }
public void ingresartipo(String tipo){

        this.tipo=tipo;

        }
public void ingresartelefono(String telefono){

        this.telefono=telefono;

        }
public String obtenernombre(){
        return nombre;
        }
public String obtenertipo(){
        return tipo;
        }
public String obtenertelefono(){
        return telefono;
        }
}

