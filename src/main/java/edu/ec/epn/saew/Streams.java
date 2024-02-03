package edu.ec.epn.saew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.stream().forEach(n -> {
            System.out.println(n);
        });

        // numbers.stream().filter(v -> {
        //     if (v % 2 == 0) {
        //         return true;
        //     } else {
        //         return false;
        //     }
        // }).collect(Collectors.toList());

        List<Integer> numbersFiltered = numbers.stream().filter(v -> v % 2 == 0).collect(Collectors.toList());
        System.out.println(Arrays.toString(numbersFiltered.toArray()));

        Optional<Integer> number = numbers.stream().filter(v -> v >2).findAny();
        if (number.isPresent()) {
            System.out.println("Número mayor a 2: "+number.get());
        }else{
            System.out.println("No hay valores mayores a 2");
        }

        //MAP
        List<Integer> numbersDoubled = numbers.stream().map(v -> v*2).collect(Collectors.toList());
        System.out.println(Arrays.toString(numbersDoubled.toArray()));

        //REDUCE
        //itera y va sumando los valores
        //iteracion 1: 0+1=1, iteracion 2: 1+2=3 ...
        int sum = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println("Suma: "+sum);
    }
}
