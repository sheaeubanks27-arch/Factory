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

        //change the value of the yearFounded and is Open
        //call factoryInfo()
    }

    //todo: make a method called factoryInfo

    public void factoryInfo(){
        System.out.println("the factory info: ");
        //todo: add souts to print in the factory's instance variables
        //these are examples of readable souts
        System.out.println("the year founded:" + yearFounded);
        System.out.println("the earnings are" + earnings);
        System.out.println("it is" + Open +"the factory is open");

    }

}
