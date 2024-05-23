# Literalura

 Es una app para consultar libros y autores, en primer paso los libros y auotres se obtienen de la api de gutendex,
 luego se guarda en una base de datos propia postgresql, y desde se toman  los datos para que el usuario interatue
 con la app, si en primera instancia el libro no existe en la base datos local, se traera de la api gutendex
 

 Menu:
 
 ELija La opción a través de su número:           
    1- buscar libro por título                       
    2- Listar libros registrados                     
    3- Listar autores registrados                    
    4- Listar autores vivos en un determinado año    
    5- Listar libros por idioma                                                                                                                     
    0- salir 
 
 #### Tecnologias usadas
 - Lenguage de programación: java
 - Framework: sprint boot
 - Gestor de dependecias : Maven
 - Dependencias:
    spring-boot-starter-data-jpa,
    postgresql
    spring-boot-starter-test
    jackson-databind


#### Estructura del codigo:

Paquete model:
Tiene 2 clases autor y libro que son a su vez las entidades de base datos local, tiene 3 record para poder mapear
el json  que devuelve que devuelve api gutendex.

Paquete repository:
Tiene 2 interfaces para el repositorio de forma individual de libro y autor, se relacionan con inyeción del autor cuando
se instancia un objeto libro, creando la ralación en tabla de base datos Id_autor.

Paquete service: 
Costa dos clases y una interface, una clase para el consumo de la api, la otra para la conversión de esos datos que
implementa interface convierte datos genericos.

Paquete principal:
Este tiene toda la logica del funcionamiento de la app.

Paquete main:
En este se hace la inyeción de dependencias para los dos repositorios de libro y autor, se ejecuta la app.


## Por fin gracias al Señor Jesús!

## Este proyecto fue hecho para el challenge alura Literalura
   
