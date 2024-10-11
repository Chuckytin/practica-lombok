# Práctica con Lombok en Java

Este proyecto está enfocado en aprender a usar las principales anotaciones que ofrece la librería **Lombok** para reducir el código repetitivo (boilerplate) en Java. A continuación, se resumen las anotaciones utilizadas y su función dentro del código.

## Anotaciones Utilizadas

### 1. `@Setter` y `@Getter`
- Generan automáticamente los métodos **setter** y **getter** para los atributos de la clase, eliminando la necesidad de escribir estos métodos manualmente.

### 2. `@AllArgsConstructor` y `@NoArgsConstructor`
- **`@AllArgsConstructor`**: Crea un constructor que acepta como parámetros todos los atributos de la clase.
- **`@NoArgsConstructor`**: Crea un constructor vacío. Es importante tener este cuando se necesita crear objetos sin pasar parámetros.

### 3. `@FieldDefaults(level = AccessLevel.PRIVATE)`
- Hace que todos los atributos de la clase sean **privados** sin tener que especificarlo en cada uno de ellos, asegurando el encapsulamiento.

### 4. `@ToString`
- Sobrescribe el método `toString()` de la clase. Permite excluir campos específicos con `exclude` o incluir solo algunos campos con `of`. La opción `includeFieldNames = false` elimina los nombres de los atributos en la salida del método `toString`.

### 5. `@EqualsAndHashCode`
- Sobrescribe los métodos `equals()` y `hashCode()`. Usando la opción `of`, puedes especificar qué campos deben considerarse para generar estos métodos, evitando duplicaciones basadas en ciertos atributos. Las opciones como `doNotUseGetters` permiten evitar el uso de getters y acceder directamente a los atributos.

### 6. `@Data`
- Es una anotación de **Lombok** que agrupa las siguientes anotaciones: `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, y `@RequiredArgsConstructor`. Facilita mucho la creación de clases POJO eliminando la necesidad de escribir código repetitivo.

### 7. `@Value`
- Hace que todos los campos sean **final** y **privados**. Genera automáticamente un constructor para todos los campos, `toString()`, `equals()`, `hashCode()` y getters. Es útil para crear clases inmutables.

### 8. `@Builder`
- Permite la creación de un patrón **Builder** para la clase, facilitando la creación de instancias complejas a través de un estilo de llamada fluida.

### 9. `@NonNull`
- Genera una verificación de **null** en los parámetros anotados, lanzando una excepción si se intenta pasar un valor nulo.

### 10. `@Cleanup`
- Se utiliza para asegurarse de que los recursos como archivos o streams se cierren automáticamente, incluso en caso de excepción. Muy útil al manejar flujos de entrada y salida.

### 11. `@SneakyThrows`
- Permite lanzar excepciones sin necesidad de envolver el código en bloques `try-catch` o agregar `throws` en la firma del método. Útil para manejar excepciones checked sin necesidad de explicitarlas.

### 12. `@Log`
- Añade automáticamente una instancia de `Logger` en la clase, que puede utilizarse para registrar eventos o información durante la ejecución.

## Otras Anotaciones en Comentarios

### 13. `@ToString(exclude = {"fullName"}, includeFieldNames = false)`
- Excluye el campo **fullName** de la representación del método `toString()` y no incluye los nombres de los atributos en la salida del mismo. 
- Alternativamente, puedes usar `of` para incluir solo campos específicos.
- Opción `callSuper = true`: Si la clase hereda de una clase padre, permite incluir los atributos de la clase padre en el método `toString()`.

### 14. `@EqualsAndHashCode(of = {"id", "email", "phoneNumber"}, doNotUseGetters = true)`
- Define los atributos que deben ser considerados para los métodos `equals()` y `hashCode()`, evitando la duplicación de objetos con los mismos valores en esos campos.
- La opción `doNotUseGetters = true` indica que los valores deben obtenerse directamente desde los atributos en lugar de los getters.
