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

```json
[
  {
    "id": 4,
    "name": "bebida"
  },
  {
    "id": 1,
    "name": "bebida energetica"
  },
  {
    "id": 6,
    "name": "cerveza"
  },
  {
    "id": 2,
    "name": "pisco"
  },
  {
    "id": 3,
    "name": "ron"
  },
  {
    "id": 5,
    "name": "snack"
  },
  {
    "id": 7,
    "name": "vodka"
  }
]
```


**``GET/v1/productsPage``**

**Descripción**: lista todos los productos paginados.

**Parametros**:no cuenta con parametros.

```json
{
  "content":[
      {
        "id":5,
        "name":"ENERGETICA MR BIG",
        "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/misterbig3308256.jpg",
        "price":1490.0,
        "discount":20,
        "category":1
      },
      {
        "id":6,
        "name":"ENERGETICA RED BULL",
        "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/redbull8381.jpg",
        "price":1490.0,
        "discount":0,
        "category":1
      },
      {
        "id":8,
        "name":"PISCO ALTO DEL CARMEN 35º",
        "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/alto8532.jpg",
        "price":7990.0,
        "discount":10,
        "category":2
      },...
  ],
  "pageable":{
      "sort":{
          "sorted":false,
          "unsorted":true,
          "empty":true
      },
      "offset":0,
      "pageNumber":0,
      "pageSize":16,
      "paged":true,
      "unpaged":false
  },"
  last":false,
  "totalPages":4,
  "totalElements":57,
  "size":16,
  "number":0,
  "sort":{
      "sorted":false,
      "unsorted":true,
      "empty":true
      },
  "numberOfElements":16,
  "first":true,
  "empty":false
}
```


**``GET/v1/productsNamePage``**

**Descripción**: lista todos los productos filtrador por nombre paginados.

**Parametros**:
* `'name=String'`: Texto que debe incluir el nombre del producto.
* `'page=int'`: El número de página a devolver, si no se indica el valor por defecto es 0.
* `'size=int'`: Cantidad de productos a mostrar por página, si no se indica el valor por defecto es 16.


```json
{
  "content":[
    {
      "id":25,
      "name":"RON ABUELO",
      "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/abuelo9475.jpg",
      "price":3990.0,
      "discount":0,
      "category":3
    },
    {
      "id":24,
      "name":"RON BACARDI 8 AÑOS",
      "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/bacardianejo9463.jpg",
      "price":5990.0,
      "discount":0,
      "category":3
    },...
  ],
  "pageable":{
    "sort":{
      "sorted":false,
      "unsorted":true,
      "empty":true
    },
    "pageNumber":0,
    "pageSize":16,
    "offset":0,
    "paged":true,
    "unpaged":false
  },
  "totalPages":1,
  "totalElements":13,
  "last":true,
  "sort":{
    "sorted":false,
    "unsorted":true,
    "empty":true
  },
  "numberOfElements":13,
  "first":true,
  "size":16,
  "number":0,
  "empty":false
 }
```

**``GET/v1/productsCategoryPage``**: 

**Descripción**: lista todos los productos de una categoria paginados.

**Parametros**:
* `'category=int'`: Id de la categoria de los productos a listar.
* `'page=int'`: El número de página a devolver, si no se indica el valor por defecto es 0.
* `'size=int'`: Cantidad de productos a mostrar por página, si no se indica el valor por defecto es 16.

```json
{
  "content":[
    {
      "id":47,
      "name":"Maní salado",
      "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/manisaladomp4415.jpg",
      "price":600.0,
      "discount":0,
      "category":5
    },
    {
      "id":53,
      "name":"Mani Sin Sal",
      "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/manisinsalmp6988.jpg",
      "price":500.0,
      "discount":0,
      "category":5
    },
    {
      "id":54,
      "name":"Papas Fritas Lisas Bolsa Grande",
      "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/papaslisasgrande7128.jpg",
      "price":1490.0,
      "discount":0,
      "category":5
    },
    {
      "id":55,
      "name":"Papas Fritas Bolsa Pequeña",
      "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/papaslisas7271.jpg",
      "price":500.0,
      "discount":0,
      "category":5
    },
    {
      "id":56,
      "name":"Papas Fritas Tarro",
      "url_image":"https://dojiw2m9tvv09.cloudfront.net/11132/product/78028005335657432.jpg",
      "price":1990.0,
      "discount":0,
      "category":5
    }
  ],
  "pageable":{
    "sort":{
      "sorted":false,
      "unsorted":true,
      "empty":true
    },
    "offset":0,
    "pageNumber":0,
    "pageSize":16,
    "paged":true,
    "unpaged":false
  },
  "last":true,
  "totalPages":1,
  "totalElements":5,
  "size":16,
  "number":0,
  "sort":{
    "sorted":false,
    "unsorted":true,
    "empty":true
  },
  "numberOfElements":5,
  "first":true,
  "empty":false
}
```
