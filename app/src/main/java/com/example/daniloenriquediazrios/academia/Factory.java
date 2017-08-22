package com.example.daniloenriquediazrios.academia;

/**
 * Created by daniloenriquediazrios on 18/08/17.
 */

public class Factory {


    public static universidad obtenerpersona(String tipo){

        if(tipo.equals("estudiante")){
            return new estudiante();
        }else if (tipo.equals("profesor")){
            return new profesor();
        }else{
            return new administrativo();
        }


    }


}
