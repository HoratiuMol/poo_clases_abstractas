package org.hmoldovan.pooclasesabstractas.form;

import org.hmoldovan.pooclasesabstractas.form.elementos.ElementoForm;
import org.hmoldovan.pooclasesabstractas.form.elementos.InputForm;
import org.hmoldovan.pooclasesabstractas.form.elementos.SelectForm;
import org.hmoldovan.pooclasesabstractas.form.elementos.TextareaForm;
import org.hmoldovan.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        //esto es una clase "anónima"
        
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email=new InputForm("email","email");
        InputForm edad=new InputForm("edad","number");

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1","Java");
        Opcion typeScript = new Opcion("4","TypeScript");

        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2","Python"))
        .addOpcion(new Opcion("3","JavaScript"))
        .addOpcion(typeScript)
        .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar=new ElementoForm("saludo"){
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+ this.nombre +"' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal este campo está deshabilitado!");
        username.setValor("john.doe");
        password.setValor("12345");
        email.setValor("john.doe@correo.es");
        edad.setValor("28");
        experiencia.setValor("mas de jesucristo years en exp");
        //java.setSelected(true);


        List<ElementoForm> elementos= Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        /*for(ElementoForm e:elementos){

        }
        Bucle antes de la mejor "forEach"
        */

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
