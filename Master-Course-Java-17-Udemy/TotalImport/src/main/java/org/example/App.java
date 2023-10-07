package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Máster Completo en Java de cero a experto 2023 (+127 hrs)
 * Calcular importe de cada producto y el gran total
 * El siguiente requerimiento es para una lista de productos List<Producto> , de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.
 * La clase Producto debe tener el atributo precio del tipo double y cantidad int, entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
 */
public class App
{
    public static void main( String[] args )
    {

        List<Product> produtList=new ArrayList<>();
        produtList.add(new Product(22.5,2));
        produtList.add(new Product(16.5,4));
        produtList.add(new Product(12.5,10));
        double total=produtList.stream().mapToDouble(x ->x.total(x.getPrice(),x.getValue())).sum();
        System.out.println(total);
    }
}