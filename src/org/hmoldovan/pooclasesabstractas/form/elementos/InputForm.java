package org.hmoldovan.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm{
    //el override nos implementa el metodo abstractodel padre de tal forma que no da erro el metodo general "InputForm"

    private String tipo="text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    public String  dibujarHtml() {
        return "<input type=\" " + this.tipo
        + "\" name=\" " + this.nombre
        +"\" value=\"" + this.valor + "\" >";
    }
}
