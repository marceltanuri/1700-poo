# Actividad Práctica — Encapsulamiento en POO
**Tema:** Encapsulamiento | **Nivel:** Principiante | **Duración estimada:** 90 minutos  
**Lenguaje:** Java | **Prerrequisitos:** Clases, objetos y constructores

---

## Contexto del proyecto

Fuiste contratado como desarrollador junior en **BancoTech**. Tu primer ticket es implementar la clase `CuentaBancaria` que será usada por el sistema interno del banco.

El equipo ya definió cómo debe comportarse la clase. Tu trabajo es escribirla correctamente, protegiendo los datos sensibles y respetando las reglas del negocio.

---

## ¿Qué vas a practicar?

| Concepto | Descripción |
|---|---|
| Atributos `private` | Proteger datos sensibles del acceso directo |
| Getters | Exponer datos de forma controlada y segura |
| Setters con validación | Modificar datos solo si las reglas del negocio se cumplen |
| Invariantes del objeto | Garantizar que el objeto siempre esté en un estado válido |

---

## Tarea 1 — Diseñar la clase base (20 min)

Crea la clase `CuentaBancaria` con los siguientes atributos **privados**:

- `titular` — nombre del dueño de la cuenta (`String`)
- `saldo` — dinero disponible, empieza en `0.0` (`double`)
- `numeroCuenta` — identificador único generado en el constructor (`String`)
- `activa` — indica si la cuenta está habilitada (`boolean`)

El constructor debe recibir **solo el nombre del titular** y generar el número de cuenta automáticamente usando un contador estático de clase.

```java
// Así debería usarse:
CuentaBancaria cuenta = new CuentaBancaria("María López");

// Esto debe ser imposible desde afuera de la clase:
// cuenta.saldo = 1000;      ← error de compilación
// cuenta.activa = false;    ← error de compilación
```

> **💡 Pista:** Usa un atributo `private static int contadorCuentas` para generar números únicos como `"ACC-00001"`, `"ACC-00002"`, etc. Investiga `String.format()` para darle el formato correcto.

---

## Tarea 2 — Implementar getters (15 min)

Agrega métodos getter para cada atributo. En Java, la convención es nombrarlos `get` + nombre del atributo en PascalCase (para `boolean`, se usa `is`):

- `getTitular()` — retorna el nombre en mayúsculas
- `getSaldo()` — retorna el saldo (el valor ya es `double`, está bien retornarlo directamente)
- `getNumeroCuenta()` — retorna el número de cuenta (solo lectura, **sin setter**)
- `isActiva()` — retorna si la cuenta está activa

```java
// Así debe funcionar:
CuentaBancaria cuenta = new CuentaBancaria("María López");
System.out.println(cuenta.getTitular());       // "MARÍA LÓPEZ"
System.out.println(cuenta.getSaldo());         // 0.0
System.out.println(cuenta.getNumeroCuenta());  // "ACC-00001"
System.out.println(cuenta.isActiva());         // true
```

> **💡 Pista:** Para `getTitular()`, investiga el método `toUpperCase()` de la clase `String`. ¿Qué pasa si alguien intenta asignar directamente `cuenta.numeroCuenta = "otro"`? ¿El compilador lo permite?

---

## Tarea 3 — Métodos de negocio con validación (30 min)

Implementa los métodos que modifican el estado de la cuenta. Cada uno debe **validar antes de actuar** y lanzar una excepción si algo no es válido.

- `depositar(double monto)` — el monto debe ser positivo; la cuenta debe estar activa
- `retirar(double monto)` — el monto no puede superar el saldo; tampoco puede ser negativo
- `transferir(double monto, CuentaBancaria cuentaDestino)` — retira de esta cuenta y deposita en la otra
- `cerrarCuenta()` — desactiva la cuenta; si aún tiene saldo, lanza una excepción

```java
CuentaBancaria cuentaA = new CuentaBancaria("Carlos Ruiz");
CuentaBancaria cuentaB = new CuentaBancaria("Ana Torres");

cuentaA.depositar(1000.0);
cuentaA.transferir(250.0, cuentaB);

System.out.println(cuentaA.getSaldo());  // 750.0
System.out.println(cuentaB.getSaldo());  // 250.0

cuentaA.retirar(900.0);    // IllegalArgumentException: saldo insuficiente
cuentaB.depositar(-50.0);  // IllegalArgumentException: monto inválido
```

> **💡 Pista:** Usa `throw new IllegalArgumentException("mensaje")` para los errores. En el sistema real, estos mensajes llegarán al frontend del banco. ¡Que sean claros!

---

## Tarea 4 — Desafío: historial de transacciones (25 min)

Agrega un atributo privado `historial` de tipo `ArrayList<String>`. Después de cada operación exitosa, guarda un registro con el tipo de operación, el monto y el saldo resultante.

Crea un getter `getHistorial()` que retorne una **copia** de la lista, no la lista original.

```java
cuenta.depositar(500.0);
cuenta.retirar(100.0);

for (String movimiento : cuenta.getHistorial()) {
    System.out.println(movimiento);
}

// [DEPÓSITO] Monto: $500.0 | Saldo resultante: $500.0
// [RETIRO]   Monto: $100.0 | Saldo resultante: $400.0
```

**Pregunta de reflexión:** ¿Por qué es importante retornar una copia de la lista y no la lista original? Prueba esto:

```java
List<String> h = cuenta.getHistorial();
h.clear();
System.out.println(cuenta.getHistorial()); // ¿Qué debería mostrar si el encapsulamiento está bien hecho?
```

> **💡 Pista:** Investiga `new ArrayList<>(listaOriginal)` para crear copias. Esto se llama **copia defensiva** y es un patrón muy común en sistemas reales.

---

## Estructura esperada de la clase

Al terminar, tu clase debería tener esta estructura general (sin el código de implementación):

```java
public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;
    private String numeroCuenta;
    private boolean activa;
    private ArrayList<String> historial;
    private static int contadorCuentas = 0;

    // Constructor
    public CuentaBancaria(String titular) { ... }

    // Getters
    public String getTitular() { ... }
    public double getSaldo() { ... }
    public String getNumeroCuenta() { ... }
    public boolean isActiva() { ... }
    public List<String> getHistorial() { ... }  // retorna copia

    // Métodos de negocio
    public void depositar(double monto) { ... }
    public void retirar(double monto) { ... }
    public void transferir(double monto, CuentaBancaria destino) { ... }
    public void cerrarCuenta() { ... }

    // Método auxiliar privado (opcional, buena práctica)
    private void registrarMovimiento(String tipo, double monto) { ... }
}
```

---

## Entregable

Tu archivo `CuentaBancaria.java` debe incluir:

- [ ] La clase con todos los atributos declarados como `private`
- [ ] Getters para cada atributo con las transformaciones indicadas
- [ ] Los cuatro métodos de negocio con sus validaciones y excepciones
- [ ] El historial de transacciones con copia defensiva (Tarea 4)
- [ ] Un archivo `Main.java` con un `main()` que demuestre todas las funcionalidades, incluyendo al menos un caso donde se lance una excepción

---

## Para pensar antes de entregar

Responde brevemente en comentarios dentro de tu `Main.java`:

1. ¿Por qué `numeroCuenta` no tiene setter? ¿Qué problema evita eso?
2. ¿Qué pasaría si `saldo` fuera `public`? ¿Podría el banco tener problemas?
3. ¿Por qué `contadorCuentas` es `static`? ¿Qué significa eso para todos los objetos de la clase?