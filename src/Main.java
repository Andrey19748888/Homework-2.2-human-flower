public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        Human maksim = new Human("Максим", "Минск", 35,"бренд-менеджер");
        Human anya = new Human("Аня", " Москва", 29,"методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 27, "директора по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, "безработный");


        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.getCity() +
                ". Я родился в " + (currentYear - maksim.getAge()) + "году. Я работаю " + maksim.jobTitle + ".  Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.getCity() +
                ". Я родился в " + (currentYear - anya.getAge()) + " году. Я работаю " + anya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.getCity() +
                ". Я родился в " + (currentYear - katya.getAge()) + " году. Я работаю " + katya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.getCity() +
                ". Я родился в " + (currentYear - artem.getAge()) + " году. Я работаю " + artem.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vladimir.name + ". Я из города " + vladimir.getCity() +
                ". Я родился в " + (currentYear - vladimir.getAge()) + " году. Я работаю " + vladimir.jobTitle + ". Будем знакомы!");

        Flower roza = new Flower(null, "Голандия", 35.59,0 );
        Flower hrizantema = new Flower(null,null,15.59,5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower gipsofila = new Flower(null, "Турция", 19.5, 10);

        printInfo(roza);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(gipsofila);

        Flower[] bouquet = new Flower[4];
        bouquet[0] = roza;
        bouquet[1] = roza;
        bouquet[2] = hrizantema;
        bouquet[3] = gipsofila;

        printCostAndSpan(bouquet);
    }

    public static void printInfo(Flower flower){
        System.out.println(
                "цвет: " + flower.getFlowerColor() +
                        " страна: " + flower.getCountry() +
                        " стоимость за штуку " + flower.getCost() +
                        " срок стояния цветка " + flower.lifeSpan);
    }

    private static void printCostAndSpan(Flower[] bouquet) {
        System.out.println(  "цена букета " + calcCost(bouquet));
        System.out.println( "простоит дней: " +  minLifespan(bouquet));
    }


    private static double calcCost(Flower[] bouquet) {    //   [roza,roza,hrizantema,gipsofila]
        double totalCost = 0;

        for (int i = 0; i < bouquet.length; i++) {
            totalCost = totalCost + bouquet[i].getCost();
        }

        return totalCost + 0.1*totalCost;
    }

    public static int minLifespan(Flower[] bouquet) {
        int min = bouquet[0].lifeSpan;
        for (int i = 1; i < bouquet.length; i++) {
            if (bouquet[i] != null && min > bouquet[i].lifeSpan) {
                min = bouquet[i].lifeSpan;
            }
        }
        return min;
    }
}