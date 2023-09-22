package Exception;

public class MioException extends RuntimeException {

    public MioException() {
    }

    public MioException(String msg) {
        validarMensaje(msg);
    }

    private void validarMensaje(String msg) {
        for (char c : msg.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new MioException("El mensaje contiene caracteres no permitidos");
            }
        }
    }
}
