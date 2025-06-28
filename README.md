# Practica-de-Patrones
Este repositorio, contiene un codigo en el cual aplique 4 patrones de diseño en JAVA (adapter, bridge, singleton, prototype).

Este Pull Request documenta la implementación completa de un proyecto estructurado en torno a 4 patrones de diseño en Java: Singleton, Prototype, Bridge y Adapter. Cada patrón se implementó con sus clases específicas y una arquitectura clara para demostrar su aplicabilidad en escenarios reales de desarrollo.

## Patrones aplicados:

#### 1. Singleton:
- `VehicleFactory`: crea vehículos desde una única instancia global compartida.

#### 2. Prototype:
- `Vehicle`, `Car`, `Bike`: permiten clonar objetos sin necesidad de conocer su clase exacta.

#### 3. Bridge:
- `VehicleWithEngine` puente entre la jerarquía de vehículos y motores
- Motores disponibles: `GasEngine`, `ElectricEngine`, `OldEngineAdapter`

#### 4. Adapter:
- `OldEngineAdapter` permite integrar motores antiguos (`OldEngine`) al sistema actual.

## Validaciones en `Main.java`:
- Creación y comparación de instancias de fábrica (`factory1 == factory2`)
- Clonación de vehículos y visualización de tipo (`showType()`)
- Vehículos arrancando con distintos motores (`startEngine()`)

---

Arquitectura completa orientada a la reutilización, extensibilidad y principios SOLID.
