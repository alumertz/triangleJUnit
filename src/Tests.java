import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
    Triangle t;

    @Test
    @DisplayName("Triangulo escaleno válido")
    public void escaleno(){
        Triangle t = new Triangle(1.5,2,1);
        Assertions.assertTrue(t.isEscaleno());
    }

    @Test
    @DisplayName("Triangulo isoceles válido")
    public void isoceles(){
        t = new Triangle(10,10,12);
        Assertions.assertTrue(t.isIsoceles());
    }

    @Test
    @DisplayName("Triangulo equilatero válido")
    public void equilatero(){
        t = new Triangle(5,5,5);
        Assertions.assertTrue(t.isEquilatero());
    }

    @Test
    @DisplayName("Isoceles permutação 1")
    public void isocelesP1(){
        t = new Triangle(6,6,8);
        Assertions.assertTrue(t.isIsoceles());
    }

    @Test
    @DisplayName("Isoceles permutação 2")
    public void isocelesP2(){
        t = new Triangle(8,6,6);
        Assertions.assertTrue(t.isIsoceles());
    }

    @Test
    @DisplayName("Isoceles permutação 3")
    public void isocelesP3(){
        t = new Triangle(6,8,6);
        Assertions.assertTrue(t.isIsoceles());
    }

    @Test
    @DisplayName("Todos 0")
    public void zeros(){
        t = new Triangle(0,0,0);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Um 0")
    public void oneZero(){
        t = new Triangle(0,8,6);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Todos negativos")
    public void allNegative(){
        t = new Triangle(-1,-8,-6);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Um negativo")
    public void oneNegative(){
        t = new Triangle(-1,8,6);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Soma de A+B = C")
    public void sideSumEqual1(){
        t = new Triangle(5,5,10);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Soma de A+C = B")
    public void sideSumEqual2(){
        t = new Triangle(5,10,5);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Soma de B+C = A")
    public void sideSumEqual3(){
        t = new Triangle(10,5,5);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Soma de A+B < C ")
    public void sideSumLess1(){
        t = new Triangle(5,4,10);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Soma de A+C < B")
    public void sideSumLess2(){
        t = new Triangle(5,10,4);
        Assertions.assertFalse(t.isTriangle());
    }

    @Test
    @DisplayName("Soma de C+B < A")
    public void sideSumLess3(){
        t = new Triangle(10,4,5);
        Assertions.assertFalse(t.isTriangle());
    }




}
