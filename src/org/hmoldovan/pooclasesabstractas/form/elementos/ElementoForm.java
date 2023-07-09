package org.hmoldovan.pooclasesabstractas.form.elementos;

import org.hmoldovan.pooclasesabstractas.form.validador.LargoValidador;
import org.hmoldovan.pooclasesabstractas.form.validador.Validador;
import org.hmoldovan.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

abstract public class ElementoForm{

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores= new ArrayList<>();
        this.errores=new ArrayList<>();
    }
    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public boolean esValid(){
        for(Validador v:validadores){
            if(!v.esValido(this.valor)) {
                if (v instanceof MensajeFormateable) {
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }
    abstract public String dibujarHtml();
    //si exsite metodo abstracto requiere una clase abstracta
    //pero una clase abstracta peude tener un metodo no abstracto

}
