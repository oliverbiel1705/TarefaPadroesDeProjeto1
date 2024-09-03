public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("Car");
        Car car = (Car) abstractFactory.create("Fiat");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) abstractFactory.create("White");
        String result = "Carro selecionado: " + car.getCar() + ", com motor: " + car.goEngine() + " e de cor: " + color.getColor();;

        System.out.println(result);



    }
}