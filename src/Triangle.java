public class Triangle {
    private double A,B,C;
    private final boolean triangle;


    public Triangle(double A, double B, double C){
        setSides(A,B,C);
        triangle = isTriangle();
    }

    public void setSides(double A, double B, double C){
       this.A = A;
       this.B = B;
       this.C = C;
    }

    public boolean isTriangle(){
        return (A > 0 && B > 0 && C > 0) && (A + B > C && A + C > B && B + C > A);
    }
    public boolean isEscaleno(){
        return this.triangle && A != B && A != C && B != C;
    }
    public boolean isEquilatero(){
        return this.triangle && A == B && A == C;
    }
    public boolean isIsoceles(){
        return this.triangle && !isEquilatero() && !isEscaleno();
    }
}
