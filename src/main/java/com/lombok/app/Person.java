package com.lombok.app;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
/*
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //convierte todos los atributos en privado
@ToString(exclude = {"FullName"}, includeFieldNames = false) //excluye el nombre y NO incluye el nombre de los atributos
                                                            // of = {"FullName"} incluiría solo el nombre
                                                            // callSuper = true heredaría los atributos del padre
@EqualsAndHashCode(of = {"id", "email", "phoneNumber"}) //así evitará que se puedan duplicar estos atributos
                                                        //doNotUseGetters/Setters = true tomará los valores desde los atributos y no desde los getters/setters
*/
/*
@Data  //incluye el @Setter, @Getter, @NoArgsConstructor y @ToString
@AllArgsConstructor //si añadimos este constructor hay que añadir después el constructor vacío
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder //crea una clase interna para crear un objeto con los atributos que queramos.
*/

@Value //incluye atributos privados y finals, sus getters, toString,
@RequiredArgsConstructor //constructor con campos final o @NonNull
@ToString(includeFieldNames = false)
@Builder
public class Person {

    @NonNull //no puede ser nulo
    Long id;
    @NonNull
    String fullName;
    String email;
    Integer phoneNumber;
    LocalDate dateOfBirth;

}