public class Cat {

    public int age;
    public String color;
    public boolean isCatnice;

    public Cat(){
        age = 2;
        color = "orange";
        isCatnice = true;
    }
    public Cat(int gAge, String gColor, boolean gIscatnice){
        age = gAge;
        color = gColor;
        isCatnice = gIscatnice;
    }
    public void printInfo(){
        System.out.println(age);
        System.out.println(color);
        System.out.println(isCatnice);

    }

}
