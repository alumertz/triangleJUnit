import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os lados do triângulo: ");
        float A = Float.parseFloat(scan.nextLine());
        float B = Float.parseFloat(scan.nextLine());
        float C = Float.parseFloat(scan.nextLine());
        Triangle t = new Triangle(A,B,C);
        if (t.isTriangle()){
            System.out.println("É triangulo ");
            if(t.isEscaleno()){
                System.out.println("escaleno");
            } else if (t.isIsoceles()) {
                System.out.println("isoceles");
            }else{
                System.out.println("equilatero");
            }
        }
        else{
            System.out.println("Não é triangulo ");
        }
    }



}