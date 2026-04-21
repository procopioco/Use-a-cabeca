public class Dog {
    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    private int size;
}
class DogTestDrive{
    public static void main(String[] args) {
        Dog[] pets;
        pets = new Dog[7];

        pets[0] = new Dog();
        pets[1] = new Dog();

        pets[0].setSize(10);
        int x = pets[0].getSize();
        pets[1].setSize(20);

        System.out.println(x);
    }
}