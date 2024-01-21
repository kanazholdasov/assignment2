class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;

    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return String.format("%s: %d. %s %s", getPosition(), getId(), getName(), getSurname());
    }

    public String getPosition() {
        return "Person";
    }

    public double getPaymentAmount() {
        return 0.00;
    }

    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
