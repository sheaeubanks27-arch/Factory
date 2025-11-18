public class House {
    //instance variables
    //1. at the top of the class
    //2. they can be used anywhere except the psvm
    //3. has the word public before

    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;

    public House(){
        walls = 4;
        size = 3200.7;
        owner = "Bobby";
        address = "362 Center st.";
        isOccupied = true;

    }
    //hw: add 2 more parameters to the house constructor, 1 for isOccupied, 1 for address
    //set the instance variables value to the parameters
    //fiz the related problems by adding them to the code in the factory Class
    public House(double pSize, int pWalls, String pOwner){
        size = pSize;
        walls = pWalls;
        owner = pOwner;

    }

    //todo: make a print info method that prints all the house instance vars

    public void printInfo(){
        System.out.println(walls);// not a readable sout
        System.out.println(size);
        System.out.println(owner);
        System.out.println(address);
        System.out.println(isOccupied);
    }

}
