package ciaf.prograIII.claseabstraccion07.ejemplo4;

// Implementación para el envío de SMS
class ServicioSMS implements ServicioNotificaciones {
    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar notificación por SMS
        System.out.println("Enviando SMS: " + mensaje);
    }
}