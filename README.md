# training-patrones-hacking
Implementación de patrones de diseño

## Referencia
https://refactoring.guru/es/design-patterns/catalog


# Patrones de diseño creacional
Mecanismos para la creación de objetos que incrementan la flexibilidad y la reutilización del código.

## Factory Method 
Proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

En lugar usar new para instanciar un objeto, se invoca un método fábrica especial. Los objetos devueltos por el método fábrica a menudo se denominan productos.

## Builder
Permite construir objetos complejos paso a paso, produciendo distintas representaciones de un objeto con un mismo código de construcción.

## Singleton
Permite que una clase tenga una única instancia, y proporciona un punto de acceso global a dicha instancia.

Debe cumplir con dos objetivos para que sea considerada Singleton:
	• El constructor es privado, para evitar que se creen instancias de esta clase.
	• Posee un método alterno para crear la instancia (si no existe), y devolverla.


#Patrones estructurales
Ensamblar objetos y clases en estructuras más grandes, a la vez que se mantiene la flexibilidad y eficiencia de estas estructuras.

## Decorator
Permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.

## Facade
Proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases.

## Proxy
Proporciona un objeto que haga de intermediario (proxy) de otro, para controlar el acceso a él.
