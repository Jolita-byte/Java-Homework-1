package Ex9;

import SDA_exercises.Ex9.Circle;
import SDA_exercises.Ex9.Point2D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CircleTest {
    private Point2D p1;
    private Point2D p2;
    private Circle c1;

    @BeforeEach
    void setUp() {
        this.p1 = new Point2D(2,0);
        this.p2 = new Point2D(1,0);
        this.c1 = new Circle(p1,p2);
    }

    @Test
    void Contructor_calculatesRadius(){
        assertThat(c1.getRadius()).isEqualTo(1);
    }

    @Test
    void getPerimeter(){

        double perimeter = c1.getPerimeter();

        assertThat(perimeter).isEqualTo(Math.PI*2);
    }

    @Test
    void getArea(){

        double perimeter = c1.getArea();

        assertThat(perimeter).isEqualTo(Math.PI);
    }

}