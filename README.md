~~# 📱 App Ciclo de Vida – Android

Aplicación desarrollada en **Android Studio** como práctica universitaria para demostrar el funcionamiento del ciclo de vida de una *Activity* en Android.

La aplicación cuenta con **2 Activities y 2 archivos XML**, mostrando en consola los eventos principales del ciclo de vida.

---

## 👨‍💻 Integrantes

- Jonás García Corniel 1-18-4259
- Adonis Rodríguez 117-4399
- Euris Joel Acosta 1-19-3584
- Gabriel Hernández Galván 2-21-3988


**Universidad:** UTESA  
**Asignatura:** Programación. De Disp. Móviles  
**Profesor:** Eduardo Arvelo Paulino

---

## 🎯 Objetivo del Proyecto

Demostrar el funcionamiento del ciclo de vida de una Activity en Android mediante el uso de los siguientes métodos:

- `onCreate()`
- `onStart()`
- `onResume()`
- `onPause()`
- `onStop()`
- `onDestroy()`

Los eventos son registrados en el **Logcat** utilizando:

```kotlin
Log.d("CICLO", "mensaje")
```

## 🏗️ Estructura del Proyecto

com.example.appciclodevida
│
├── MainActivity.kt
├── MainActivity2.kt
│
res/layout
├── activity_main.xml
├── activity_main2.xml

## 📌 Descripción de las Activities

1️⃣ MainActivity
•	Pantalla principal de la aplicación.
•	Implementa y registra todos los métodos del ciclo de vida.
•	Contiene un botón que navega hacia la segunda pantalla mediante un Intent.

2️⃣ MainActivity2
•	Segunda pantalla de la aplicación.
•	Contiene un botón para cerrar completamente la aplicación utilizando:

finishAffinity()

## 🚀 Cómo Clonar y Ejecutar el Proyecto

- 🔹 1. Clonar el repositorio:
Desde la terminal:
  git clone https://github.com/jonas-gc22/app-cliclo-vida.git

-  O desde Android Studio:
    1.	Abrir Android Studio
    2.	Seleccionar Get from VCS
    3.	Pegar la URL del repositorio
    4.	Clonar

- 🔹 2. Abrir el proyecto:

    1.	Abrir Android Studio
    2.	Seleccionar Open
    3.	Buscar la carpeta del proyecto clonado
    4.	Esperar que Gradle sincronice

## 🔹 3. Ejecutar la aplicación:

	1.	Conectar un dispositivo físico o iniciar un emulador.
	2.	Presionar el botón ▶ Run
	3.	Abrir Logcat
	4.	Filtrar por la palabra: CICLO

## Requisitos:

	•	Android Studio (versión reciente recomendada)
	•	SDK mínimo: API 23+
	•	Dispositivo físico o emulador Android
	•	Conexión a internet para sincronización inicial de Gradle


