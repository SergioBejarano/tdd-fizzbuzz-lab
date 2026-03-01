# TDD FizzBuzz Lab

Ejercicio sencillo para practicar desarrollo guiado por pruebas (TDD) en Java usando JUnit 5. Implementa la clásica kata FizzBuzz y mantiene la solución enfocada en legibilidad y cobertura de casos borde (números negativos, cero y valores grandes).

## Objetivo del proyecto

- Aplicar ciclos TDD (rojo-verde-refactor) en una kata conocida.
- Ilustrar una estructura mínima con Maven para pruebas unitarias.
- Mostrar cómo mantener reglas de negocio simples bien cubiertas por tests.

## Tecnologías

- Java 17 (compatible con cualquier versión LTS reciente).
- Maven 3.8+ para gestionar dependencias y ejecución.
- JUnit 5 para pruebas unitarias.

## Requisitos previos

1. Java instalado y disponible en el PATH (`java -version`).
2. Maven instalado (`mvn -version`).

## Ejecutar el proyecto

Compilar y ejecutar todas las pruebas:

```bash
mvn test
```

Ejecución completa (incluye verificación de cobertura con JaCoCo) desde la raíz del repo:

```bash
mvn clean verify
```

El reporte de cobertura se genera en `target/site/jacoco/index.html`.

<img width="2043" height="464" alt="Captura de pantalla 2026-02-28 224319" src="https://github.com/user-attachments/assets/83577633-6db1-4ce7-aca9-3b58719fc0d7" />



Generar binarios sin ejecutar pruebas:

```bash
mvn package -DskipTests
```

## Uso rápido

Llamar directamente al método estático `FizzBuzz.fizzbuzz(int n)`:

```java
String valor = FizzBuzz.fizzbuzz(15); // devuelve "FizzBuzz"
```

Reglas implementadas:

- Múltiplo de 3 y 5 -> "FizzBuzz"
- Múltiplo de 3 -> "Fizz"
- Múltiplo de 5 -> "Buzz"
- Cualquier otro entero -> representación como cadena

## Estructura

```
src/
	main/java/edu/university/tdd/FizzBuzz.java    # lógica de negocio
	test/java/edu/university/tdd/FizzBuzzTest.java # pruebas JUnit 5
```

## Qué cubren las pruebas

- Números positivos, negativos y cero.
- Múltiplos grandes para evitar desbordes en reglas sencillas.
- Comportamiento para no múltiplos (se devuelve el número como texto).

## Integración continua (CI)

Resumen de lo que hace el pipeline en GitHub Actions:

- Se dispara en cada push o pull request hacia `main`.
- Configura Java 17, ejecuta `mvn test` y falla si alguna prueba de FizzBuzz rompe la lógica.
- Incluye JaCoCo con umbral de cobertura de instrucciones ≥85%; el pipeline fallará si la cobertura baja de ese valor.
