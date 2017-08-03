/**
 * author Yehia
 */

public class Main {
    public static void main(String[] args) {

//        Bank bank = new Bank();

        /**
         * SET
         */

        /*
        Set<String> set = new HashSet<>();

        set.add("Mohamed");
        set.add("Yehia");
        set.add("Yehia");
        set.add("Yehia");
        set.add("Yehia");
        set.add("Yehia");

        for (String s : set) {
            System.out.println(s);
        }

        boolean isExist = set.contains("Mohamed");
        System.out.println(isExist);
*/

        // List


//        Scanner scanner = new Scanner(System.in);
//
//        List<Integer> l = new ArrayList<>();
//
//        int x = 5;
//        l.add(scanner.nextInt());
//        l.add(x);
//        l.add(70);
//
//        for (int i = 0; i < 5; i++) {
//            l.add(scanner.nextInt());
//        }
//
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//        }
//
//
//        List<Bank> banks = new ArrayList<>();
//
//        Bank bank = new Bank();
//        bank.setId("1015");
//        bank.setName("Yehia");
//        bank.setNumber(15);
//
//        banks.add(bank);
//        banks.add(bank);
//        banks.add(bank);
//
//
//        for (Bank b2 : banks) {
//            System.out.println(b2.getNumber());
//        }
//
//
//        banks.add(new Bank());


//        List<Bank> bankList = new ArrayList<>();
//
//        bankList.add(new Bank("id", "Yehia", 10));
//        bankList.add(new Bank("id", "Yehia", 12));
//        bankList.add(new Bank("id", "Yehia", 1));
//        bankList.add(new Bank("id", "Yehia", 50));
//        bankList.add(new Bank("id", "Yehia", 72));
//
//
//        Collections.sort(bankList, new Comparator<Bank>() {
//            @Override
//            public int compare(Bank bank, Bank t1) {
//                if (bank.getNumber() < t1.getNumber()) {
//                    return 1;
//                } else if (bank.getNumber() > t1.getNumber()) {
//                    return -1;
//                } else
//                    return 0;
//            }
//        });
//
//        for (Bank bank : bankList) {
//            System.out.println(bank);
//        }

//        List<String> s = new ArrayList<>();
//
//        s.add("");
//        s.add("");
//        s.add("");
//        s.add("");
//
//        Collections.sort(s);
///////////////////////////////////////////////////////////////////


        /**
         * Stack
         * LIFO (Last in first out)
         */

//        Stack<String> stack = new Stack<>();
//        stack.push("Clean Code");
//        stack.push("Clean Coder");
//        stack.push("dirty Code");
//
//        for (String s : stack) {
//            System.out.println(s);
//        }
//
//        stack.pop();
//
//        for (String s : stack) {
//            System.out.println(s);
//        }
//

        /**
         * Queue
         * FIFO
         */
//
//        Queue<String> queue = new ArrayDeque<>();
//
//        queue.add("Clean Code");
//        queue.add("Clean Coder");
//        queue.add("Dirty Code");
//
//        for (String s : queue) {
//            System.out.println(s);
//        }
//
//        queue.remove();
//        System.out.println(queue.peek());


        /**
         * Map
         */


//        Map<String, Integer> map = new HashMap<>();
//        map.put("n1", 50);
//        map.put("n2", 40);
//        map.put("n3", 30);
//        map.put("n4", 50);
//
//        BiConsumer<String, Integer> consumer = new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + " " + integer);
//            }
//        };
//
//        map.forEach(consumer);
//
//        System.out.println(map.containsKey("n1"));
//        System.out.println(map.get("n1"));
//        System.out.println(map.containsValue(500));


        /**
         * Anonymous Classes And Objects , Interface
         */

//        Bank bank1 = new Bank();
//
//        bank1.acceptPerson(new Person(10, ""));
//
//        bank1.acceptConnection(new Connection() {
//            @Override
//            public void connect() {
//
//            }
//
//            @Override
//            public void close() {
//
//            }
//        });


        //Try Catch
//        String number = "a";
//
//        try {
//            System.out.println(Integer.parseInt(number));
//        } catch (Exception e) {
//            System.out.println("Error");
//        } finally {
//
//        }

        Bank bank = new Bank();



    }
}
