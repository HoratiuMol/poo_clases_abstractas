package org.hmoldovan.pooclasesabstractas.form.validador;

abstract public class Validador {

    protected String mensaje;
    abstract public void setMensaje();
    abstract public String getMensaje();

    abstract public boolean esValido(String valor);
}
