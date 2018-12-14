package com.example.otalo.api2;

import android.telecom.Call;

import java.util.List;

public interface api {
    //Se declara el URL del servicio
    String BASE_URL = "https://swapi.co/api";

    //Se declara la extensión de la cual obtendremos la lista de heroes (En este caso: simplifiedcoding.net/demos/**marvel**)
    @GET("people")
    Call<List<people>> getpeople(); //Se hace el llamado de la lista y se invoca al método
}
