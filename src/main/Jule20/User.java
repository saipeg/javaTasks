package Jule20;

//таск Сайт знакомств
//Вы создаете базу данных пользователей для сайта знакомств.
//Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.
//Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).
//Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в
// любом порядке.

class Test {

    public static void main(String[] args) {

        User user = new User(132, (short) 18, "Бэтман");
        User user2 = new User((short) 28, "Петросян", 155);
        User user3 = new User(116, "Чипаллино", (short) 48);

    }

}

class User {

    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Пользователя зовут: " + name + ", ему " + age + " лет, " + "рост " + height);
    }

    public User(String name, int height, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Пользователя зовут: " + name + ", ему " + age + " лет, " + "рост " + height);
    }

    public User(short age, int height, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Пользователя зовут: " + name + ", ему " + age + " лет, " + "рост " + height);
    }

    public User(short age, String name, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Пользователя зовут: " + name + ", ему " + age + " лет, " + "рост " + height);
    }

    public User(int height, String name, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Пользователя зовут: " + name + ", ему " + age + " лет, " + "рост " + height);
    }

    public User(int height, short age, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Пользователя зовут: " + name + ", ему " + age + " лет, " + "рост " + height);
    }
}

