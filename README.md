# Test Tuten Java

Desarrollo de API Rest con Java empleando Spring Boot 

# Requisitos

Tener instalado algun IDE para manejo de Spring e instalacion de dependencias.

Sugerimos

IntelliJ IDEA -> https://www.jetbrains.com/es-es/idea/download/

# Instalación 

Clona el repositorio: https://github.com/otonielmax/test_tuten_api_rest_timezone

Abra el proyecto desde su IDE de preferencia e instale las dependencias mediante Maven.

# Ejecución

Ejecute el servicio desde el IDE y pruebe.

# Pruebas

Use Postman o cualquier otra herramienta para probar el API Rest

URL: 127.0.0.1:8080/api
Endpoint: /timezone
Body:
  {
   "time" : "09:10:11",
   "timezone" : "+5"
  }
Response:
{
    "response": {
        "time": "04:10:11",
        "timezone": "UTC"
    }
}
