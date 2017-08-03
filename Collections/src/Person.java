public class Person {

    private String name;
    private String s;
    private int id;

    public Person() {
        name = "";
        s = "";
    }


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    class Bag {
        private String laptop;
        private int price;

        public Bag(String laptop, int price) {
            this.laptop = laptop;
            this.price = price;
        }

        public String getLaptop() {
            return laptop;
        }

        public void setLaptop(String laptop) {
            this.laptop = laptop;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
