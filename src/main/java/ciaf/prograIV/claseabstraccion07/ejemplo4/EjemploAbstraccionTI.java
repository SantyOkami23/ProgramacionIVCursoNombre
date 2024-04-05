package ciaf.prograIII.claseabstraccion07.ejemplo4;

public class EjemploAbstraccionTI {
    public static void main(String[] args) {
        ServicioNotificaciones emailService = new ServicioEmail();
        ServicioNotificaciones smsService = new ServicioSMS();
        ServicioNotificaciones pushService = new ServicioPush();

        emailService.enviarNotificacion("¡Bienvenido a nuestra plataforma!");
        smsService.enviarNotificacion("Su pedido ha sido entregado con éxito.");
        pushService.enviarNotificacion("Nueva actualización disponible. ¡Descárgala ahora!");
    }
}
