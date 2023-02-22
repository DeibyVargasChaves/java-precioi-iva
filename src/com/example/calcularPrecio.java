package com.example;

public class calcularPrecio {

    public static void main(String[] args) {


        float precioIVA = obtenerPrecioConIVA((float) 2000.33F, 14.01F);

        System.out.println("Este es el precio con IVA: " + precioIVA);
    }

        static float obtenerPrecioConIVA (float precio, float IVA){
            return + precio + IVA;
    }
}
