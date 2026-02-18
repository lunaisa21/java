import java.util.Scanner;
class Main {
    Scanner entrada; //defino el objeto de lectura
    String nombre;
    Float sueldo;
    public void ingresar(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre=entrada.next();
        System.out.println("Ingrese su sueldo : ");
        sueldo=entrada.nextFloat();
    }
    public void Salario_min(){
        if(sueldo<=1756000){
            System.out.println("Hola:" +nombre+ ": Usted tiene subsidio de transporte");
        }else{
            System.out.println("Hola:" +nombre+ " : Usted no tiene subsisido de trasnporte");
        }
    }
    public static void main(String[] args) {
        System.out.println("Salario minimo");
        Main empleo1 = new Main();
        empleo1.ingresar();
        empleo1.Salario_min();
        
    }
}
