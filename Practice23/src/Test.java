public class Test {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new Order();
        orders[3].add(new Dish(500,"Plate", "For pasta"));
        orders[3].add(new Dish(150,"Cup", "For tea"));
        orders[1].add(new Dish(400, "Bowl", "For soup"));
        orderManager.add(orders[3], 9);
        orderManager.add(orders[5], 4);
        orderManager.removeOrder(4);
        orderManager.add(orders[1],3);
        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager.freeTableNumbers());
        System.out.println(orderManager.freeTableNumber());
    }
}