package lint;



import java.util.*;

public class GestorUsuarios {

    // ❌ Constante mal declarada
    public String TIPO_ADMIN = "ADMIN";

    // ❌ Uso de campos públicos
    public List<String> usuarios = new ArrayList<>();

    // ❌ Método demasiado largo y con múltiples responsabilidades
    public void procesar(String nombre, int edad, boolean admin) {

        // ❌ Magic numbers
        if (edad > 17) {

            // ❌ Código duplicado
            if (admin == true) {
                System.out.println("Usuario admin creado");
                usuarios.add(nombre);
            } else {
                System.out.println("Usuario normal creado");
                usuarios.add(nombre);
            }

        } else {
            System.out.println("Edad incorrecta");
        }

        // ❌ Variable sin usar
        int x = 10;

        // ❌ Comparación innecesaria con boolean
        if (admin == false) {
            System.out.println("No es administrador");
        }

        // ❌ Uso de System.out (difícil de testear)
        System.out.println("Proceso finalizado");
    }

    // ❌ Método con nombre poco claro
    public void a() {
        // ❌ Método vacío
    }

    // ❌ Complejidad innecesaria
    public boolean esMayor(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
        
        /*
         * nueva actualización
         */
    }
}
