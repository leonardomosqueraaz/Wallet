public class App { 
    
    private String nombre;
    private int edad;
    private double estatura; //Decimal 
    private float peso; //Decimal - Cambia el tamaño.
    private char initial; 
    private String dirreccionVivienda;
    private boolean operacion;        
    }


    
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

    //Operadores aritmeticos.
        int operacion = 5 + 4;
        double operacion2 = 5 / 4;
        double operacion3 = 12 % 4;
        operacion++;
        operacion = operacion + 1;
        operacion--;
        operacion = -operacion;
        operacion = +operacion;
    
    //Operadores lógicos 
        boolean respuesta = 5 > 4;
        respuesta = 25 != 12;
        respuesta = true;
        respuesta = 15 > 12 && 5 < 2;
        respuesta = 15 > 12 || 5 < 2;
    
    //Operadores Bit a bit
        /*
        &
        ^
        |
        */

    //Estructura de control
        if (respuesta) {
            //Resultado si se cumple la condición.
        }
        if (respuesta) {
            //Resultado si se cumple la condición.
        } else {
            //Resultado si no se cumple la condición.
        }
    int valor = 3;         
    switch (valor) {
        case 1: 
            //Bloque de código.
            break;
        case 2: 
            //Bloque de código.
            break;
        case 3: 
            //Bloque de código.
            break;            
    
        default:
            break;
    }

    //Ciclos o Bucles.
    while (valor != 3) {
        //Bloque de código.
    }
    do {
        //Bloque de código.
    } while (valor != 3);

    for (String string : args){
        //Bloque de código.
    }

    for (int i = 0; i < args.length; i++) {
        
    }
    }
}
