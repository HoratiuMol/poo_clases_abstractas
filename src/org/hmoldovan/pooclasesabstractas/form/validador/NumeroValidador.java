package org.hmoldovan.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje="el campo debe de ser número";

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
        try {
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
