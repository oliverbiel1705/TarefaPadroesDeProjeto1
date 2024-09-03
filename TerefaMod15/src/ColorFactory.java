public class ColorFactory implements AbstractFactory <Color> {
    @Override
    public Color create(String type) {
        if("Red".equalsIgnoreCase(type)){
            return new Red();
        }

        if("White".equalsIgnoreCase(type)){
            return new White();
        }

        return null;
    }
}
