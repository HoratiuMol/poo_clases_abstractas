package org.hmoldovan.pooclasesabstractas.form.elementos;

abstract public class ElementoForm{

    protected String valor;
    protected String nombre;

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();
    //si exsite metodo abstracto requiere una clase abstracta
    //pero una clase abstracta peude tener un metodo no abstracto

}
