/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_2;

public class Usuario {
    String nombre_del_usuario;
    int identificacion;
    String email;
    int edad;
    String area;
    boolean jefe;
    double salario;
    
public Usuario (String nombre_del_usuario, int identificacion, String email, int edad, String area, boolean jefe) {
    this.nombre_del_usuario = nombre_del_usuario;
    this.identificacion = identificacion;
    this.email = email;
    this.edad = edad;
    this.area = area;
    this.jefe = jefe;
    this.salario = salario ();
}

 double salario (){
     double salario =0; 
     double nomina = 0;

     
 /*   
        String str = "dos";
        switch(str)
        {
            case "uno":
                System.out.println("uno");
                break;
            case "dos":
                System.out.println("dos");
                break;
            case "tres":
                System.out.println("tres");
                break;
            default:
                System.out.println("no coincide");
        }
*/
     switch (this.area) 
     {
        case "desarrollo":  
                if (this.jefe == false) {
                    salario = 4500000;
                    if(salario > 3634104){
                        nomina = salario - (salario * 0.08) - ( salario * 0.01);
                    }
                    else{
                        nomina = salario - (salario * 0.08);
                    }
                 }
                else if (this.jefe == true) {
                     salario = 4500000 + 2500000;
                    if(salario > 3634104){
                        nomina = salario - (salario * 0.08) - ( salario * 0.01);
                    }
                    else{
                        nomina = salario - (salario * 0.08);
                    }
                }
                break;
        case "administrativa":       
                if (this.jefe == false) {
                    salario = 3500000;
                    if(salario > 3634104){
                        nomina = salario - (salario * 0.08) - ( salario * 0.01);
                    }
                    else{
                        nomina = salario - (salario * 0.08);
                    }
                 }
                else if(this.jefe == true){
                     salario = 3500000 + 3000000;
                    if(salario > 3634104){
                        nomina = salario - (salario * 0.08) - ( salario * 0.01);
                    }
                    else{
                        nomina = salario - (salario * 0.08);
                    }
                }
                break;
        default:  this.area = "Area invalida";
                break;
     } 
     return nomina;
} 
 public void info (){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: " + nombre_del_usuario);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Email: " + email);
        System.out.println("Edad: " + edad);
        System.out.println("Area: " + area);
        System.out.println("Salario: " + salario);
 } 
 public static void main(String[] args) {
     Usuario usuario1 = new Usuario ( "Lucia Gomez",1097000000, "lucia.gomez@correo.com", 25, "administrativa",true);
     usuario1.info();
 }
}
