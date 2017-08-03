public class Bank {

    private String id;
    private String name;
    private int number;

    public Bank() {

    }

    public Bank(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Your Number is " + this.number;
    }

    public void acceptPerson(Person person) {
        System.out.println(person.getId());
    }

    public void acceptConnection(Connection connection) throws NullPointerException {
        connection.connect();
        connection.close();
    }

    public boolean isConnected(Connection connection) throws Exception {
        connection.connect();
        return true;
    }
}
