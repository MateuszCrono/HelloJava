import com.kodilla.shape.Circle;
import com.kodilla.shape.Drawer;
import com.kodilla.shape.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        // Given
        Circle circle = new Circle();

        // When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        // Then
        assertEquals("This is a Circle", result);

    }
    @Test
    void testDoDrawingWithTriangle() {
        // Given
        Triangle triangle = new Triangle();

        // When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        // Then
        assertEquals("This is a Triangle", result);

    }
}
