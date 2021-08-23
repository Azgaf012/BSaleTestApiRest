# BSaleTestApiRest
Construcción de una Api Rest como parte de un ejercicio para el proceso de postulación en BSale.

## Tecnologias utilizadas

- **Spring boot**: Framework de Java.
- **MariaDB**: Sistema de gestión de base de datos.
- **JPA**: framework que forma parte de Java, y ofrece un conjunto de interfaces y APIs para resolver el problema del almacenamiento de los objetos en una base de datos relacional.

## Explicación del API Rest

La API Rest tiene los siguientes endpoints:


**``GET/v1/categories``**
**Descripción**:lista todas las categorias.
**Parametros**:no cuenta con parametros.

**``GET/v1/productsPage``**

**Descripción**: lista todos los productos paginados.

**Parametros**:no cuenta con parametros.

**``GET/v1/productsNamePage``**

**Descripción**: lista todos los productos filtrador por nombre paginados.

**Parametros**:
* `'name=String'`: Texto que debe incluir el nombre del producto.
* `'page=int'`: El número de página a devolver, si no se indica el valor por defecto es 0.
* `'size=int'`: Cantidad de productos a mostrar por página, si no se indica el valor por defecto es 16.


**``GET/v1/productsCategoryPage``**: 

**Descripción**: lista todos los productos de una categoria paginados.

**Parametros**:
* `'category=int'`: Id de la categoria de los productos a listar.
* `'page=int'`: El número de página a devolver, si no se indica el valor por defecto es 0.
* `'size=int'`: Cantidad de productos a mostrar por página, si no se indica el valor por defecto es 16.
