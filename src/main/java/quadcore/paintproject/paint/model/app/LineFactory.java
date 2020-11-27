package quadcore.paintproject.paint.model.app;

public class LineFactory extends ShapeFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("segment")) {
            return new Line(type, createID());
        } else if (type.equalsIgnoreCase("ray")) {
            return new Line(type, createID());
        } else if (type.equalsIgnoreCase("doubleRay")) {
            return new Line(type, createID());
        } else {
            throw new RuntimeException("Invalid Shape Type");
        }
    }
}
