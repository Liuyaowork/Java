public class Animal {
    private boolean sex;//true为雄性，false为雌性
    private int age;
    public Animal() {
        this.sex = false;
    }
    public boolean getSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String introduce() {
        return sex ? "雄性" : "雌性";
    }
}

class Dog extends Animal {
    public Dog() {
        this.setSex(true); // 修复调用父类方法的错误
    }
    public String introduce() {
        return this.getSex() ? "我是一只雄性狗" : "我是一只雌性狗";
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal ani = new Animal();
        System.out.println(ani.introduce());
        Dog dog = new Dog();
        System.out.println(dog.introduce());
    }
}
