package org.hmoldovan.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje="el campo %s tiene un formato de correo incorrecto";
    private final static String EMAIL_REGEX= "^(.+)@(.+)$";

    @Override
    public void setMensaje() {
    this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
