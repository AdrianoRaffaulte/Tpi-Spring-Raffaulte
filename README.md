# Trabajo Práctico Final Spring boot - Info Market

Profesor: Ian Fernandez
Alumno: Adriano Guillermo Raffaulte  

---

# Consigna asignada

> Funcionalidad 3: El desafío consiste en, a partir de la aplicación “Info Market” desarrollada en clases, realizar la modificación incorporando la siguiente funcionalidad:
>
> ** Desarrollar un endpoint para obtener el nombre de las marcas con los 10 productos más caros.**  
> ** Considerar el cambio de agregar la marca a la entidad en todos los puntos en donde se crea o actualiza un producto.**

---

## ¿Cómo ejecutar la aplicación?

1. Asegurarse de tener **MySQL Workbench** funcionando con la base de datos `info_market`.
2. Ejecutar los scripts SQL provistos:
   - `categorias.sql`
   - `productos.sql`
   - `productos_categorias.sql`
3. Iniciar la app desde terminal:

```bash
./mvnw spring-boot:run
```
4. Iniciar en Postman las respectivas consultas:
http://localhost:8080/productos/top-productos-marcas
