public class CarFactory implements AbstractFactory <Car> {
    @Override
    public Car create(String type) {
        if("Chevrolet".equalsIgnoreCase(type)){
            return new Chevrolet();
        }

        if("Hyundai".equalsIgnoreCase(type)){
            return new Hyundai();
        }

        if("Fiat".equalsIgnoreCase(type)){
            return new Fiat();
        }
        return null;
    }
}
