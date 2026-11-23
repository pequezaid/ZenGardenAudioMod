# Zen Garden Audio — Fabric 26.1.2

Proyecto inicial de mod para Minecraft Java 26.1.2.

## Incluido
- 18 eventos de sonido personalizados registrados en Fabric.
- Archivos OGG Vorbis mono para efectos de sonido.
- Reemplazo temporal del audio del disco vanilla **C418 - 13** por `Zen Garden - Laura Shigihara`.
- Se conserva el MP3 original en `source_audio/`.
- El disco mantiene su textura vanilla; todavía no se ha creado un disco nuevo ni una textura propia.

## Importante sobre las asignaciones
Los eventos están registrados y se pueden probar con `/playsound`, pero todavía no se conectan automáticamente a acciones del juego. Las acciones de “romper jarrón” y “plantar plantas” requieren que exista el sistema/jarrón/menú correspondiente. Quedan reservadas así:
- `zengarden_audio:romper_jarron`: exclusivamente al romper un jarrón.
- `zengarden_audio:plantar_plantas` y `zengarden_audio:plantar_plantas_variante`: exclusivamente desde el apartado/sistema de plantas.
No se asignan a romper bloques o colocar objetos genéricos.

## Probar sonidos
Con el mod instalado, usa por ejemplo:
```mcfunction
/playsound zengarden_audio:boton_menus master @s
/playsound zengarden_audio:romper_jarron master @s
/playsound zengarden_audio:plantar_plantas master @s
```

## Compilar en Windows
Minecraft 26.1 requiere **Java/JDK 25**. Instala JDK 25 y Gradle 9.4.0, abre PowerShell en esta carpeta y ejecuta:
```powershell
gradle build
```
El `.jar` aparecerá en `build/libs/`. Este paquete no incluye el ejecutable de Gradle Wrapper porque el entorno de creación no tenía acceso a la descarga de Gradle; el proyecto sí incluye la configuración del wrapper.

## Dependencias
- Minecraft Java 26.1.2
- Fabric Loader 0.19.0 o superior
- Java 25
- Gradle 9.4.0

No requiere Fabric API para la primera versión: los eventos se registran directamente con los registros vanilla.
