package ciaf.prograIII.claseabstraccion07.ejemplo4;


// Implementación para el envío de correos electrónicos
class ServicioEmail implements ServicioNotificaciones {
    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar notificación por correo electrónico
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}