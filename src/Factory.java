public class Factory {

    //Instance variables are at the top of the class, have public infront of them, can be used everywhere in factory except psvm
    //These are instance variables
    public int yearFounded;
    public boolean isOpen;
    //doubles are decimal values
    public double earnings;// unit is in millions
    //a string is anything that can be put inside 2 quotes
    public String products;

    public static void main(String[] args) {
        System.out.println("Welcome to Shea's factory");

        new Factory();
    }
    //constructors are special types of methods. you can tell it is because it doesn't have void. constructers match the name of the class
    //This is a constructor
    public Factory(){
        System.out.println("we make houses!");
        yearFounded = 2025;
        isOpen = false;
        earnings = 1.1;
        products = "houses";
        factoryInfo();
        yearFounded = 1990;
        isOpen = true;
        factoryInfo();

        //change the value of the yearFounded and is Open
        //call factoryInfo()

        //type varName = value;
        //object of type house is h1
        House h1 = new House();
        h1.owner = "Mr. Kim";
        System.out.println("the owner is" + h1.owner);
        //todo: give all of the house instance variables values
        h1.address = "1790 canton ave milton mass";
        System.out.println("the address is" + h1.address);
        h1.isOccupied = true;
        System.out.println("the house is" + h1.isOccupied);
        h1.size = 4000;
        System.out.println("the house is" + h1.size + "square feet");
        h1.walls = 12;
        System.out.println("the house has" + h1.walls + "walls");


        House h2 = new House();
        h2.size = 40.2;
        System.out.println(h2.size);
        h2.printInfo();

        //todo: make another house called myHouse
        //call printInfo on myHouse
        House myHouse = new House();
        myHouse.printInfo();

        House customHouse = new House(200.24,8,"Shea");
        customHouse.printInfo();

    }

    //todo: make a method called factoryInfo

    public void factoryInfo(){
        System.out.println("the factory info: ");
        //todo: add souts to print in the factory's instance variables
        //these are examples of readable souts
        System.out.println("the year founded:" + yearFounded);
        System.out.println("the earnings are " + earnings);
        System.out.println("it is " + isOpen +" the factory is open");

    }

}
