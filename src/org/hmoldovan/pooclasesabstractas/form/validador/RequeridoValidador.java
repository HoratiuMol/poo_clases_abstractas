package org.hmoldovan.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje="el campo %s es requerido";
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
        return (valor!=null && valor.length()>0);
    }
}
