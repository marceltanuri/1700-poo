---
marp: true
theme: default
paginate: true
backgroundColor: #fdfbf7
color: #003366
style: |
  section {
    font-family: 'Lato', sans-serif;
    font-size: 24px;
    padding: 50px;
  }
  h1 {
    color: #002d54;
    font-family: 'Merriweather', serif;
    font-size: 60px;
    border-bottom: 5px solid #ffb347;
  }
  h2 {
    color: #003366;
    font-family: 'Merriweather', serif;
    font-size: 45px;
    margin-bottom: 30px;
  }
  code {
    background: #e2e8f0;
    color: #c53030;
    padding: 2px 6px;
    border-radius: 4px;
  }
  .columns {
    display: grid;
    grid-template-columns: repeat(2, minmax(0, 1fr));
    gap: 1rem;
  }
  .highlight {
    color: #ffb347;
    font-weight: bold;
  }
---

# Programación Orientada a Objetos
## Pilares, Atributos, Constructores y Composición

**Aula de Programación**
*Introducción al Paradigma de Desarrollo*

---

## ¿Qué es la POO?

La **POO** es un paradigma de programación que utiliza "objetos" para modelar datos y comportamientos del mundo real.

- **Clase:** El plano arquitectónico (molde).
- **Objeto:** La instancia física creada desde el molde.
- **Estado:** Definido por sus **Atributos**.
- **Comportamiento:** Definido por sus **Métodos**.

---

# Los 4 Pilares Fundamentales
### La base de un software robusto y escalable

---

## 1. Abstracción y 2. Encapsulamiento

<div class="columns">
<div>

### Abstracción
Simplificar la realidad enfocándose solo en las características relevantes. Ocultamos la complejidad innecesaria.
</div>
<div>

### Encapsulamiento
Agrupación de datos y métodos, restringiendo el acceso directo (modificadores de acceso) para proteger la integridad del objeto.
</div>
</div>

---

## 3. Herencia y 4. Polimorfismo

<div class="columns">
<div>

### Herencia
Mecanismo que permite a una clase hija adquirir atributos y métodos de una clase padre, promoviendo la **reutilización**.
</div>
<div>

### Polimorfismo
Capacidad de un objeto de tomar múltiples formas. Un mismo método puede comportarse de manera distinta según el objeto.
</div>
</div>

---

## Atributos: El Estado del Objeto

Los atributos representan las características o datos que describen a un objeto.

- **Identidad:** Datos únicos (ej: `id`, `dni`).
- **Variables de Instancia:** Valores que definen el estado actual (ej: `color`, `precio`).
- **Visibilidad:** 
    - `private`: Solo la clase accede.
    - `public`: Acceso total.
    - `protected`: Acceso por herencia.

---

## Constructores: El Nacimiento del Objeto

El **Constructor** es un método especial que se ejecuta automáticamente al instanciar una clase.

- **Propósito:** Inicializar atributos y preparar el objeto.
- **Garantía:** Asegura que el objeto nazca en un estado válido.
- **Sintaxis:** Suele llevar el mismo nombre de la clase o una palabra clave como `__init__` o `constructor`.

---

## Tipos de Constructores

1. **Constructor por Defecto:**
   - No recibe parámetros.
   - Asigna valores iniciales predeterminados.

2. **Constructor Parametrizado:**
   - Recibe datos externos para configurar el objeto de forma personalizada desde el inicio.
   - Ejemplo: `new Usuario("Juan", "Admin");`

---

## Composición: Relación "Tiene-un"

La composición es un diseño donde una clase compleja se construye utilizando otras clases como componentes.

- **Concepto:** En lugar de heredar, "poseemos" instancias de otros objetos.
- **Ejemplo:**
    - Un `Automóvil` **no es un** `Motor`.
    - Un `Automóvil` **tiene un** `Motor`.
- **Ventaja:** Permite cambiar componentes fácilmente y reduce el acoplamiento rígido.

---

## Herencia vs. Composición

| Criterio | Herencia (Es-un) | Composición (Tiene-un) |
| :--- | :--- | :--- |
| **Relación** | Jerárquica | Estructural |
| **Acoplamiento** | Alto | Bajo |
| **Flexibilidad** | Rígida | Dinámica |
| **Visibilidad** | Expone internos | Oculta detalles |

---

## Conclusión

Para un buen diseño orientado a objetos:

1. **Encapsula** tus atributos.
2. Usa **Constructores** para validar el estado inicial.
3. Prefiere **Composición** sobre Herencia cuando la relación sea de "pertenencia".
4. Utiliza **Abstracción** para manejar la complejidad.

---

# ¿Preguntas?

### ¡Gracias por su atención!

**Próxima sesión:** Interfaces y Clases Abstractas