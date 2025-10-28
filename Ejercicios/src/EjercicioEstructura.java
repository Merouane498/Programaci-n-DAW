public class EjercicioEstructura {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;
        //Inserta un valor
        //vector=push(vector,3);
        //Inserta un valor
        //vector=push(vector,5);
        //for(int i=0;i<vector.length;i++){
        //    System.out.println(vector[i]+ "");
        //}
        //Elimina el ultimo
        int valor=pop(vector);
        System.out.println(valor);

        
    }
    public static int[] push(int[] array, int valor){
        int longitud;
        if (array==null){ longitud=0;}
        else{ longitud=array.length;}
        //Crear el array con +1 de tamaño
        int[] salida=new int[longitud+1];
        //Copiar lo que haya en ese momento
        for(int i=0; i<longitud;i++){
            salida[i]=array[i];
        }
        salida[longitud]=valor;
        return salida;

    }

    public static int pop(int[] array){
        return 3;

    }

    public static int pop(int[] array) {
        //Sacar el valor ultimo
        int valor=array[array.length-1];
        //Generar el vector con uno menos
        int[] nuevo=new int[array.length-1];
        //Copiar hasta el tamaño nuevo

        
    }
    
    
}
