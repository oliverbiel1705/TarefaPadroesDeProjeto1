public class FactoryProvider {
    public  static AbstractFactory getFactory(String choice){
        if("Car".equalsIgnoreCase(choice)){
            return new CarFactory();
        }
        if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return  null;
    }
}
