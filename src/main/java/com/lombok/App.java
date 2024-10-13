package com.lombok;

import lombok.SneakyThrows;
import lombok.extern.java.Log;

import java.time.LocalDate;


@Log //
public class App {

    @SneakyThrows //maneja las excepciones
    public static void main(String[] args) {

        Person person =
                new Person(1L, "Santiago Perez", "santipe@gmail.com", 654897546, LocalDate.of(1990, 10, 15));

        //Person personEmpty = new Person();

        Person personBuilder = Person.builder()
                .id(2L)
                .fullName("Federico Maratías")
                .build();

        System.out.println(person);
        //System.out.println(personEmpty);
        log.info(personBuilder.toString());

        /*
        @Cleanup //cierra el recurso
        InputStream input = new FileInputStream("archivo.txt");
        */
    }

}
