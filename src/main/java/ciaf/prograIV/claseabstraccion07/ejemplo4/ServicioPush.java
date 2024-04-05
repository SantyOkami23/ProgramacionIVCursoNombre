package ciaf.prograIII.claseabstraccion07.ejemplo4;

// Implementación para el envío de notificaciones push
class ServicioPush implements ServicioNotificaciones {
    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar notificación push
        System.out.println("Enviando notificación push: " + mensaje);
    }
}