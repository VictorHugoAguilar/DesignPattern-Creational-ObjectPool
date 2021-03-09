# Patrón de Diseño - Creacional - ObjectPool

El patrón de grupo de objetos es un patrón de diseño de creación de software que se utiliza en situaciones en las que el costo de inicializar una instancia de clase es muy alto. 

Básicamente, un grupo de objetos es un contenedor que contiene cierta cantidad de objetos. Por lo tanto, cuando se saca un objeto de la piscina, no está disponible en la piscina hasta que se vuelve a colocar. 
Los objetos del grupo tienen un ciclo de vida: 

Creación
Validación
Destruir.

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Creational-ObjectPool/blob/master/img/object-pool-diagram.png?raw=true)

## Diagrama de Secuencia

![Diagrama de Secuencia](https://github.com/VictorHugoAguilar/DesignPattern-Creational-ObjectPool/blob/master/img/object-pool-sequence.png?raw=true)

## Ventajas

Ofrece un aumento significativo del rendimiento.
Gestiona las conexiones y proporciona una forma de reutilizarlas y compartirlas.
El patrón de grupo de objetos se usa cuando la tasa de inicialización de una instancia de la clase es alta.

## Cuándo usar el patrón de diseño de grupo de objetos

Cuando tenemos un trabajo para asignar o desasignar muchos objetos
Además, cuando sabemos que tenemos un número limitado de objetos que estarán en la memoria al mismo tiempo.