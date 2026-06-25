# Ejercicio POO — Constructores en Java
## Tienda Virtual ShopCo 🛒

**Curso:** Programación Orientada a Objetos  
**Tema:** Constructores (por defecto, con parámetros y copia)  
**Nivel:** Básico  
**Lenguaje:** Java  

---

## Contexto

Eres parte del equipo de desarrollo de **ShopCo**, una tienda virtual colombiana. Tu misión es modelar el sistema de la tienda creando **5 clases** con sus respectivos constructores.

Cada clase debe tener:
- ✅ Constructor **por defecto** (sin parámetros)
- ✅ Constructor **con parámetros**
- ✅ Constructor **copia**
- ✅ Método `mostrar()` que imprima los atributos en consola

---

## Repaso rápido — Tipos de constructores

### 1. Constructor por defecto
Se ejecuta cuando no se pasan datos. Inicializa atributos con valores genéricos.

```java
public Producto() {
    this.nombre = "Sin nombre";
    this.precio = 0.0;
    this.stock  = 0;
}
```

### 2. Constructor con parámetros
Recibe los datos al crear el objeto. Usa `this` para diferenciar el atributo del parámetro.

```java
public Producto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock  = stock;
}
```

### 3. Constructor copia
Crea un nuevo objeto copiando los valores de otro ya existente.

```java
public Producto(Producto otro) {
    this.nombre = otro.nombre;
    this.precio = otro.precio;
    this.stock  = otro.stock;
}
```

> **Concepto clave — Sobrecarga:** cuando una clase tiene más de un constructor con diferente número o tipo de parámetros, se llama *sobrecarga de constructores* (*constructor overloading*).

---

## Las 5 clases que debes crear

---

### Clase 1 — `Producto`

**Descripción:** representa un artículo disponible en la tienda.

| Atributo    | Tipo     | Ejemplo              |
|-------------|----------|----------------------|
| `nombre`    | `String` | `"Tenis Nike"`       |
| `precio`    | `double` | `189900`             |
| `stock`     | `int`    | `25`                 |
| `categoria` | `String` | `"Calzado"`          |

**Instrucciones:**

1. Declara los cuatro atributos como `private`.
2. Escribe el constructor **por defecto**. Asigna `"Sin nombre"`, `0.0`, `0`, `"Sin categoría"`.
3. Escribe el constructor **con parámetros** para los cuatro atributos.
4. Escribe el constructor **copia** que recibe un objeto `Producto`.
5. Escribe el método `mostrar()` que imprima todos los atributos.

**Plantilla:**

```java
public class Producto {

    private String nombre;
    private double precio;
    private int    stock;
    private String categoria;

    // TODO: Constructor por defecto
    public Producto() {
        // escribe aquí
    }

    // TODO: Constructor con parámetros
    public Producto(String nombre, double precio, int stock, String categoria) {
        // escribe aquí
    }

    // TODO: Constructor copia
    public Producto(Producto otro) {
        // escribe aquí
    }

    // TODO: Método mostrar
    public void mostrar() {
        // escribe aquí
    }
}
```

**Prueba en `main`:**

```java
Producto p1 = new Producto();
Producto p2 = new Producto("Tenis Nike", 189900, 25, "Calzado");
Producto p3 = new Producto(p2);

p1.mostrar();
p2.mostrar();
p3.mostrar();
```

**Salida esperada:**

```
=== Producto ===
Nombre:    Sin nombre
Precio:    $0.0
Stock:     0 unidades
Categoría: Sin categoría

=== Producto ===
Nombre:    Tenis Nike
Precio:    $189900.0
Stock:     25 unidades
Categoría: Calzado

=== Producto ===
Nombre:    Tenis Nike
Precio:    $189900.0
Stock:     25 unidades
Categoría: Calzado
```

---

### Clase 2 — `Cliente`

**Descripción:** representa a una persona registrada en ShopCo.

| Atributo    | Tipo     | Ejemplo                   |
|-------------|----------|---------------------------|
| `nombre`    | `String` | `"María Gómez"`           |
| `correo`    | `String` | `"maria@gmail.com"`       |
| `ciudad`    | `String` | `"Medellín"`              |
| `telefono`  | `String` | `"3001234567"`            |

**Instrucciones:**

1. Declara los cuatro atributos como `private`.
2. Constructor **por defecto**: asigna `"Desconocido"` a los campos de texto.
3. Constructor **con parámetros**: inicializa todos los atributos.
4. Constructor **copia**: copia los datos de otro `Cliente`.
5. Método `mostrar()` que imprima los datos del cliente.

**Plantilla:**

```java
public class Cliente {

    private String nombre;
    private String correo;
    private String ciudad;
    private String telefono;

    // TODO: Constructor por defecto

    // TODO: Constructor con parámetros

    // TODO: Constructor copia

    // TODO: Método mostrar
}
```

**Prueba en `main`:**

```java
Cliente c1 = new Cliente();
Cliente c2 = new Cliente("María Gómez", "maria@gmail.com", "Medellín", "3001234567");
Cliente c3 = new Cliente(c2);

c1.mostrar();
c2.mostrar();
c3.mostrar();
```

**Salida esperada:**

```
=== Cliente ===
Nombre:   Desconocido
Correo:   Desconocido
Ciudad:   Desconocido
Teléfono: Desconocido

=== Cliente ===
Nombre:   María Gómez
Correo:   maria@gmail.com
Ciudad:   Medellín
Teléfono: 3001234567

=== Cliente ===
Nombre:   María Gómez
Correo:   maria@gmail.com
Ciudad:   Medellín
Teléfono: 3001234567
```

---

### Clase 3 — `Vendedor`

**Descripción:** empleado de ShopCo responsable de gestionar productos.

| Atributo      | Tipo     | Ejemplo           |
|---------------|----------|-------------------|
| `nombre`      | `String` | `"Carlos Ramos"`  |
| `codigo`      | `String` | `"V-001"`         |
| `comision`    | `double` | `5.0` (porcentaje)|
| `activo`      | `boolean`| `true`            |

**Instrucciones:**

1. Declara los cuatro atributos como `private`.
2. Constructor **por defecto**: nombre `"Sin asignar"`, codigo `"V-000"`, comision `0.0`, activo `false`.
3. Constructor **con parámetros**: recibe los cuatro atributos.
4. Constructor **copia**: copia todos los datos de otro `Vendedor`.
5. Método `mostrar()`.

**Plantilla:**

```java
public class Vendedor {

    private String  nombre;
    private String  codigo;
    private double  comision;
    private boolean activo;

    // TODO: Constructor por defecto

    // TODO: Constructor con parámetros

    // TODO: Constructor copia

    // TODO: Método mostrar
}
```

**Prueba en `main`:**

```java
Vendedor v1 = new Vendedor();
Vendedor v2 = new Vendedor("Carlos Ramos", "V-001", 5.0, true);
Vendedor v3 = new Vendedor(v2);

v1.mostrar();
v2.mostrar();
v3.mostrar();
```

**Salida esperada:**

```
=== Vendedor ===
Nombre:   Sin asignar
Código:   V-000
Comisión: 0.0%
Activo:   false

=== Vendedor ===
Nombre:   Carlos Ramos
Código:   V-001
Comisión: 5.0%
Activo:   true

=== Vendedor ===
Nombre:   Carlos Ramos
Código:   V-001
Comisión: 5.0%
Activo:   true
```

---

### Clase 4 — `Envio`

**Descripción:** representa el despacho de un producto a un cliente.

| Atributo          | Tipo     | Ejemplo              |
|-------------------|----------|----------------------|
| `numeroGuia`      | `String` | `"GU-20240001"`      |
| `ciudadDestino`   | `String` | `"Cali"`             |
| `diasEntrega`     | `int`    | `3`                  |
| `costoEnvio`      | `double` | `12000`              |

**Instrucciones:**

1. Declara los cuatro atributos como `private`.
2. Constructor **por defecto**: guía `"SIN-GUIA"`, ciudad `"Sin definir"`, días `0`, costo `0.0`.
3. Constructor **con parámetros**: recibe los cuatro atributos.
4. Constructor **copia**: copia los datos de otro `Envio`.
5. Método `mostrar()`.

**Plantilla:**

```java
public class Envio {

    private String numeroGuia;
    private String ciudadDestino;
    private int    diasEntrega;
    private double costoEnvio;

    // TODO: Constructor por defecto

    // TODO: Constructor con parámetros

    // TODO: Constructor copia

    // TODO: Método mostrar
}
```

**Prueba en `main`:**

```java
Envio e1 = new Envio();
Envio e2 = new Envio("GU-20240001", "Cali", 3, 12000);
Envio e3 = new Envio(e2);

e1.mostrar();
e2.mostrar();
e3.mostrar();
```

**Salida esperada:**

```
=== Envío ===
Guía:            SIN-GUIA
Ciudad destino:  Sin definir
Días de entrega: 0
Costo de envío:  $0.0

=== Envío ===
Guía:            GU-20240001
Ciudad destino:  Cali
Días de entrega: 3
Costo de envío:  $12000.0

=== Envío ===
Guía:            GU-20240001
Ciudad destino:  Cali
Días de entrega: 3
Costo de envío:  $12000.0
```

---

### Clase 5 — `Pedido` ⭐ (integradora)

**Descripción:** representa una compra realizada en ShopCo. Esta clase **usa objetos de las clases anteriores** como atributos.

| Atributo      | Tipo       | Descripción                          |
|---------------|------------|--------------------------------------|
| `numeroPedido`| `String`   | Identificador único del pedido       |
| `cliente`     | `Cliente`  | Cliente que realiza la compra        |
| `producto`    | `Producto` | Producto que se compra               |
| `cantidad`    | `int`      | Unidades solicitadas                 |
| `total`       | `double`   | Calculado: `precio × cantidad`       |

**Instrucciones:**

1. Declara los cinco atributos como `private`.
2. Constructor **por defecto**: usa los constructores por defecto de `Cliente` y `Producto`.
3. Constructor **con parámetros**: recibe `numeroPedido`, un `Cliente`, un `Producto` y una `cantidad`. **Calcula automáticamente** el `total` con `producto.getPrecio() * cantidad`.

   > ⚠️ Para que `producto.getPrecio()` funcione, debes agregar un método `getPrecio()` en la clase `Producto`:
   > ```java
   > public double getPrecio() {
   >     return precio;
   > }
   > ```

4. Constructor **copia**: copia todos los datos de otro `Pedido`.
5. Método `mostrar()` que imprima un resumen completo del pedido.

**Plantilla:**

```java
public class Pedido {

    private String   numeroPedido;
    private Cliente  cliente;
    private Producto producto;
    private int      cantidad;
    private double   total;

    // TODO: Constructor por defecto
    public Pedido() {
        this.numeroPedido = "SIN-NUMERO";
        this.cliente  = new Cliente();
        this.producto = new Producto();
        this.cantidad = 0;
        this.total    = 0.0;
    }

    // TODO: Constructor con parámetros
    public Pedido(String numeroPedido, Cliente cliente, Producto producto, int cantidad) {
        // escribe aquí — recuerda calcular el total
    }

    // TODO: Constructor copia
    public Pedido(Pedido otro) {
        // escribe aquí
    }

    // TODO: Método mostrar
    public void mostrar() {
        // escribe aquí
    }
}
```

**Prueba en `main`:**

```java
Cliente  c = new Cliente("Juan Pérez", "juan@hotmail.com", "Bogotá", "3109876543");
Producto p = new Producto("Camiseta Polo", 59900, 50, "Ropa");

Pedido ped1 = new Pedido();
Pedido ped2 = new Pedido("PED-001", c, p, 2);
Pedido ped3 = new Pedido(ped2);

ped1.mostrar();
ped2.mostrar();
ped3.mostrar();
```

**Salida esperada:**

```
======== PEDIDO ShopCo ========
Número:   SIN-NUMERO
Cliente:  Desconocido | Desconocido
Producto: Sin nombre  | $0.0
Cantidad: 0 unidades
TOTAL:    $0.0
================================

======== PEDIDO ShopCo ========
Número:   PED-001
Cliente:  Juan Pérez | Bogotá
Producto: Camiseta Polo | $59900.0
Cantidad: 2 unidades
TOTAL:    $119800.0
================================

======== PEDIDO ShopCo ========
Número:   PED-001
Cliente:  Juan Pérez | Bogotá
Producto: Camiseta Polo | $59900.0
Cantidad: 2 unidades
TOTAL:    $119800.0
================================
```

---

## Reto final — Integra todo

Crea una clase `TiendaMain` con un método `main` que:

1. Cree al menos **2 productos**, **2 clientes**, **1 vendedor** y **1 envío** usando los tres tipos de constructores.
2. Cree **3 pedidos** (uno por defecto, uno con parámetros, uno copia).
3. Imprima el resumen completo de cada objeto.

**Salida esperada de referencia:**

```
======================================
      SISTEMA ShopCo — COLOMBIA
======================================

--- PRODUCTOS ---
[mostrar p1, p2, p3]

--- CLIENTES ---
[mostrar c1, c2, c3]

--- VENDEDOR ---
[mostrar v1, v2]

--- ENVÍO ---
[mostrar e1, e2]

--- PEDIDOS ---
[mostrar ped1, ped2, ped3]

======================================
       FIN DEL SISTEMA ShopCo
======================================
```

---

## Checklist de entrega

Antes de entregar tu ejercicio, verifica:

- [ ] Clase `Producto` con 3 constructores y método `mostrar()`
- [ ] Clase `Cliente` con 3 constructores y método `mostrar()`
- [ ] Clase `Vendedor` con 3 constructores y método `mostrar()`
- [ ] Clase `Envio` con 3 constructores y método `mostrar()`
- [ ] Clase `Pedido` con 3 constructores y método `mostrar()`
- [ ] `Pedido` calcula el total automáticamente en el constructor con parámetros
- [ ] Clase `TiendaMain` con `main` que prueba las 5 clases
- [ ] El código compila y ejecuta sin errores
- [ ] La salida en consola coincide con la salida esperada de cada clase

---

## Preguntas de reflexión

Responde en un comentario dentro de tu código o en un documento aparte:

1. ¿Qué ocurre si una clase **no tiene ningún constructor**? ¿Qué hace Java automáticamente?
2. ¿Por qué es útil el **constructor copia** en lugar de simplemente asignar `objeto2 = objeto1`?
3. En la clase `Pedido`, ¿por qué el `total` se calcula en el constructor y no se recibe como parámetro?
4. ¿Qué ventaja tiene declarar los atributos como `private`?

---

*ShopCo — Ejercicio elaborado para el curso de Programación Orientada a Objetos*