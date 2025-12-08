# SalmonttApp

## Semana 7: Aplicando polimorfismo y colecciones genéricas

En esta semana se extendió la jerarquía de clases previamente creada para las unidades operativas de la empresa Salmontt.

## Contenidos desarrollados
- Se definió una superclase abstracta `UnidadOperativa` con el método `mostrarInformacion()`.
- Las subclases `CentroCultivo` y `PlantaProceso` sobrescriben este método aplicando polimorfismo.
- Se creó `GestorUnidades`, que contiene una colección `List<UnidadOperativa>` con más de cinco objetos.
- Se recorre la colección usando polimorfismo desde referencias de tipo `UnidadOperativa`.
- Proyecto organizado en paquetes `model`, `data`, `ui`.

## Instrucciones de ejecución
1. Abrir el proyecto en el IDE.
2. Ejecutar la clase:
```
cl.duoc.salmontt.ui.Main
```
3. La consola mostrará los datos polimórficamente.
