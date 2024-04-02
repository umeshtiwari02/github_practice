class First {
    public String name;
    public int age;

    First(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        First first = new First("Umesh", 21);
        first.display();
    }

}