# 📱 TECSUP Campus

> Aplicación móvil desarrollada en **Kotlin con Jetpack Compose**, que permite a los estudiantes de TECSUP visualizar información institucional como **Cursos**, **Instructores** y **Eventos**.  
> Proyecto académico diseñado para aplicar navegación, UI declarativa, y componentes de Compose (Cards, LazyColumn, etc.).

---

## 🧩 Descripción General

**TECSUP Campus** es una app educativa ligera que integra las secciones más importantes del campus:  
- Visualización de **cursos disponibles**  
- Consulta de **instructores y sus especialidades**  
- Listado de **eventos próximos**  
- Información institucional en la sección **Acerca de**

Cada módulo fue construido aplicando buenas prácticas de **Jetpack Compose**, diseño moderno y paleta de colores **celeste/blanco** institucional TECSUP.

---


## ⚙️ Tecnologías utilizadas

| Tecnología | Descripción |
|-------------|--------------|
| 🧠 **Kotlin** | Lenguaje principal de desarrollo |
| 🧩 **Jetpack Compose** | Framework moderno para UI declarativa |
| 🧭 **Navigation Compose** | Manejo de rutas y navegación entre pantallas |
| 🎨 **Material 3 + Cards + LazyColumn** | Diseño de interfaz adaptable y moderno |
| 🗂️ **MVVM estructurado** | Separación de responsabilidades por capas |
| 🖼️ **Recursos gráficos locales (drawable)** | Íconos e imágenes de cursos, instructores y eventos |

---

## 🏗️ Estructura del Proyecto

TECSUPCampus/
┣ app/
┃ ┣ src/
┃ ┃ ┣ main/
┃ ┃ ┃ ┣ java/com/tecsup/campus/
┃ ┃ ┃ ┃ ┣ model/ # Modelos de datos (Curso, Instructor, Evento)
┃ ┃ ┃ ┃ ┣ ui/theme/ # Paleta de colores, tipografía y gradiente
┃ ┃ ┃ ┃ ┗ ui/theme/screens/ # Pantallas principales de la app
┃ ┃ ┃ ┣ res/drawable/ # Íconos e imágenes institucionales
┃ ┃ ┃ ┣ AndroidManifest.xml
┃ ┃ ┗ build.gradle
┣ README.md
┗ build.gradle

yaml
Copiar código

---

## 🧭 Navegación

| Pantalla | Descripción |
|-----------|--------------|
| 🏠 **Inicio** | Menú principal con accesos rápidos |
| 📚 **Cursos** | Lista de cursos con nombre, descripción e ícono |
| 👩‍🏫 **Instructores** | Cards con foto, nombre y especialidad |
| 📅 **Eventos** | Eventos próximos con fecha, título y lugar |
| ℹ️ **Acerca de** | Información estática de la app y autor |

---

## 🎨 Paleta de colores institucional TECSUP

| Nombre | Código Hex | Uso |
|---------|-------------|------|
| `TecsupCeleste` | `#5EB8FF` | Títulos y acentos |
| `TecsupLight` | `#E3F2FD` | Fondo principal |
| `TecsupWhite` | `#FFFFFF` | Cards y texto sobre fondo |
| `TecsupText` | `#333333` | Texto principal gris oscuro |

---

## 🧠 Conceptos aplicados

- Navegación entre pantallas con **NavHostController**
- **LazyColumn** para listas dinámicas
- **Cards** con estructura Row/Column
- **MaterialTheme** para tipografía y colorScheme
- **Composable Functions** bien separadas y reutilizables
- Splash Screen animado con **fade-in** institucional

---

## 📦 Instalación y ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Hazielcode/TECSUPCampus-by-kotlin.git
Abrir el proyecto en Android Studio (Arctic Fox o superior)

Ejecutar con Emulador Android API 33+ o dispositivo físico

Disfrutar del diseño 🎨 y navegar entre las secciones

👨‍💻 Autor
Samir Haziel Alfonso Solorzano
📘 Estudiante de Diseño y Desarrollo de Software — TECSUP, Perú 🇵🇪
💻 GitHub: Hazielcode

🏁 Versión
v1.0.0 — Octubre 2025

Proyecto integrador Jetpack Compose - Curso TECSUP 📚

📜 Licencia
Este proyecto es de uso educativo y libre distribución con fines académicos.
Desarrollado con ❤️ en TECSUP.
