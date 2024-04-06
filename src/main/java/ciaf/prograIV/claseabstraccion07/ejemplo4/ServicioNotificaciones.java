package ciaf.prograIII.claseabstraccion07.ejemplo4;

/*Abstracción de notificaciones:
Supongamos que estás construyendo un sistema que necesita
enviar notificaciones a los usuarios a través de diferentes canales,
como correo electrónico, SMS o notificaciones push. Puedes usar la abstracción
para definir una interfaz común para enviar notificaciones y luego implementar esta
 interfaz para cada canal de notificación.*/


// Interfaz para el servicio de notificaciones
interface ServicioNotificaciones {
    void enviarNotificacion(String mensaje);
}