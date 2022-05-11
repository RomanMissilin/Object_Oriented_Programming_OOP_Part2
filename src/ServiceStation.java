public class ServiceStation {

   /* public void check(Car car, Bicycle bicycle, Truck truck) {

        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();

        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();

        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }*/

   /* public void printSquare (String str) {
        int parsedNum = Integer.parseInt(str);
        System.out.println(parsedNum * parsedNum);
    }*/

    /*public void printSquare(int num) {
        System.out.println(num * num);
    }*/

    public void check(Checker[] checkers) {
        for (Checker checker : checkers) {
            checker.service();
        }
    }
}