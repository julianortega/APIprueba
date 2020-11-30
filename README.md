## Prueba técnica API Rest (BackEnd + FrontEnd)
Es una plataforma que nos permite gestionar una base de datos de clientes y productos. Se ha utilizado Spring Boot para el BackEnd y Angular para el FrontEnd.

## Iniciar la API

Para ello abriremos una terminal en una carpeta en la que deseemos tener la API, en ella introduciremos el comando:

```
git clone https://github.com/julianortega/APIprueba
```

Nos dirigimos con la terminal a la carpeta del código y ejecutamos el siguiente comando para iniciar la API:

```
mvn spring-boot:run
```

Para iniciar el servidor web ejecutamos el siguiente comando:

```
ng serve
```
Para hacer llamadas con Postman o similar usaremos la dirección ```localhost:8080```

La dirección de la web es ```localhost:4200```

## Modelo de datos
#### CLIENTE
```
{
 "_id" : 555555,
 "docType" : "nif",
 "docNum" : "11223344E",
 "email" : "it@parlem.com",
 "customerId" : "11111",
 "givenName" : "Enriqueta",
 "familyName1" : "Parlem",
 "phone" : "668668668",
}
```
#### PRODUCTO
```
{
 "_id" : 1111111,
 "productName" : "FIBRA 1000 ADAMO",
 "productTypeName" : "ftth",
 "numeracioTerminal" : 933933933,
 "soldAt" : "2019-01-09 14:26:17",
 "customerId" : "11111",
}
```