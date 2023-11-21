import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private List<Furniture> furnitureList;

    public FurnitureShop() { furnitureList = new ArrayList<>(); }

    public void addFurniture(Furniture furniture) { furnitureList.add(furniture); }

    public void displayAllFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.displayInfo();
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair1 = new Chair("Wooden Chair", 50.0, 4);
        Chair chair2 = new Chair("Plastic Chair", 30.0, 3);
        Table table1 = new Table("Wooden Table", 100.0, 6);
        Table table2 = new Table("Glass Table", 150.0, 4);

        shop.addFurniture(chair1);
        shop.addFurniture(chair2);
        shop.addFurniture(table1);
        shop.addFurniture(table2);

        shop.displayAllFurniture();
    }
}
