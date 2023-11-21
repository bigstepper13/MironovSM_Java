public class Main {
    public static void main(String[] args) {
        WaitList<String> wl = new WaitList<>();
        wl.add("wl1");
        wl.add("wl2");
        wl.add("wl3");
        System.out.println(wl);
        System.out.println(wl.remove());
        System.out.println(wl);
        System.out.println(wl.isEmpty());

        System.out.println();
        WaitList<Integer> bwl = new BoundedWaitList<Integer>(4);
        bwl.add(13);
        bwl.add(52);
        bwl.add(69);
        bwl.add(34);
        bwl.add(777);
        System.out.println(bwl);

        System.out.println();

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(23);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);
        System.out.println(uwl);
        uwl.remove(5);
        System.out.println(uwl);
        uwl.moveToBack(23);
        System.out.println(uwl);
    }
}