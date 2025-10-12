public class Recursividad {
    public static int factorial(int n){
        //case base
        if (n==0){
            return 1;
        }
        else{//caso recursivo
            return n*factorial(n-1)

        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}

 public static void main(String[] args) {
    int a = 254;
        System.out.println(funcion(a, 2));
 }
 public static int funcion(int num, int pos){
    if(num < 10){
        return num;
    }else{
         return (num % 10) * (int) Math.pow(10, pos) + (funcion(num/10, pos-1));
    }
}






