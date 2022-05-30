package school.lesson4.park;

public class Park {
    public Attraction attraction;

    private class Attraction {
        private String name;
        private String workingTime;
        private int price;

        public Attraction(String name, String workingTime, int price){
            this.name=name;
            this.workingTime=workingTime;
            this.price=price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingTime='" + workingTime + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
    public static void main(String[] args) {
        Park.Attraction wheel = new Park().new Attraction("wheel", "10:00 - 18:00", 5);
        System.out.println(wheel.toString());
    }
}


