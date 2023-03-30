import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int l = LEER NUMERO;
        parImpar(l);
        Map<String,Integer> personas = LEE PERSONAS;
        estadisticaPersonas(personas);
        int horas = LEER HORASTRABAJADAS;
        float tarifa = TARIFA;
       System.out.println("El sueldo es :" + calculaSueldo(horas, tarifa));
    }
//Ejercicio 1

    public static void parImpar(int i){
        for(int k=i;k>=0;k=k-2){
            System.out.println(k);
}
}
//Ejercicio 2
public static void estadisticaPersonas(Map<String,Integer> personas){
    int mayorEdad=0;
    int mayorEdadMasculino=0;
    int sexoFemenino=0;
    Object[] key = personas.keySet().toArray();
    for (int i = 0; i<personas.size(); i ++){
        if(key[i]=="MASCULINO"){
        if(personas.get(key[i])>=18){
            mayorEdad++;
            mayorEdadMasculino++;
            }
        }else{
            sexoFemenino++;
        }
    }
    System.out.println("El número de personas mayores de edad es: " +mayorEdad);
    System.out.println("El número de personas menores de edad es: " + (personas.size()-mayorEdad));
    System.out.println("El número de personas mayores de edad masculinas es: " +mayorEdadMasculino);
    System.out.println("El número de personas menores de edad femeninas es: " + (mayorEdad-mayorEdadMasculino));
    System.out.println("El porcentaje de personas mayores de edad respecto al total es: " +(mayorEdad/personas.size()*100));
    System.out.println("El porcentaje de mujeres de edad respecto al total es: " +(sexoFemenino/personas.size()*100));

}
//Ejercicio 3
public static double calculaSueldo(int horas, float tarifa){
    double sueldo=0.00;
    double extra=0.00; 
    sueldo = horas*tarifa;
    if(horas>40){
        extra = (horas-40)*tarifa*1.5;  
    }
    return sueldo+ extra;
}
}