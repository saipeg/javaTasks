package Jule20;

class Creator {
    public static void main(String[] args) {

        Artifact artifact = new Artifact();
        Artifact artifact1 = new Artifact(23);
        Artifact artifact2 = new Artifact(25, "Aztec");
        Artifact artifact3 = new Artifact(312, "Maia", 12);
    }
}

class Artifact {

    private int number;
    private String culture;
    private int age;

    public Artifact() {
        System.out.println("В этом случае вы ничего не ввели.");
        System.out.println();
    }

    public Artifact(int number) {
        this.number = number;
        System.out.println("Этот артифакт, о котором неизвестно ничего, кроме порядкового номера: " + number);
        System.out.println();
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
        System.out.println("Этот артефакт, о которым известно, какой порядковый номер и культура, которой он был создан:");
        System.out.println("Порядковый номер: " + number);
        System.out.println("Культура, которой он был создан: " + culture);
        System.out.println();
    }

    public Artifact(int number, String culture, int age) {
        this.number = number;
        this.culture = culture;
        this.age = age;
        System.out.println("Этот артефакт, о которым известно, какой порядковый номер, культура, которой он был создан и точный век создания:");
        System.out.println("Порядковый номер: " + number);
        System.out.println("Культура, которой он был создан: " + culture);
        System.out.println("Точный век его создания: " + age);
        System.out.println();

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


