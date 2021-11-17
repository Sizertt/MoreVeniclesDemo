class Venicle {
    int passengers; // кол-во пассажиров
    int wheels; // кол-во колёс
    int maxspeed; // макс скорость
    int burnup; // расход топлива
}

public class MoreVeniclesDemo {
    public static void main(String[] args){
        //car1
        Venicle car1 = new Venicle();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        //Другой вид класса Venicle: обьект bus1

        Venicle bus1 = new Venicle();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        //Расчёт пути, пройденого за 1.25 часа
        double interval = 1.25;
        double distanseCar = car1.maxspeed * interval;
        double distanseBus = bus1.maxspeed * interval;

        System.out.print("car1 может проехать за 1 час 15 минут расстояние в");
        System.out.print(distanseCar + "км с" + car1.passengers);
        System.out.print("с пассажирами");
        System.out.print("bus1 может проехать за 1 час 15 минут расстояние в");
        System.out.print(distanseBus + "км с" + bus1.passengers);
        System.out.print("с пассажирами");
    }
}
