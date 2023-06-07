package ironcoding;

import ironcoding.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {


    public static void main(String[] args) {

        var categoryList = fullData();
        var givenCategory = "Cellphones";
        var response = findByCategoryName(categoryList, givenCategory);

        response.ifPresentOrElse(category -> {
            System.out.println("Search result for category name '" + category.getName() + "': ");
            System.out.println("KeyWords: " + category.getKeywords().toString());
            System.out.println("Level: " + category.getLevel());
        }, () -> {
            System.out.println("There is not result related with category name: '" + givenCategory + "'");
        });

    }

    public static Optional<Category> findByCategoryName(List<Category> categoryList, String categoryName) {
        return categoryList.stream()
                .filter(category -> category.getName().equals(categoryName))
                .findFirst();
    }


    public static List<Category> fullData() {

        // keywords of some general categories
        var categoryList0 = List.of("home", "electric", "furniture");
        var categoryList1 = List.of("Victorine", "DecoArt", "Classic");
        var categoryList2 = List.of("electric");
        var categoryList33 = List.of("Lawn", "Garden", "GardeningTools");

        // Add every category to the main list
        var categoryList = new ArrayList<Category>();
        categoryList.add(new Category("0", "root", categoryList0));
        categoryList.add(new Category("1", "Furniture", categoryList1));
        categoryList.add(new Category("2", "Electronics", categoryList2));
        categoryList.add(new Category("3", "Home Appliances", categoryList0));
        categoryList.add(new Category("1.1", "Couch", categoryList1));
        categoryList.add(new Category("1.2", "Sofa", categoryList1));
        categoryList.add(new Category("2.1", "Computers", categoryList2));
        categoryList.add(new Category("2.2", "Cellphones", categoryList2));
        categoryList.add(new Category("3.1", "Major Appliances", categoryList0));
        categoryList.add(new Category("3.2", "Minor Appliances", categoryList0));
        categoryList.add(new Category("3.3", "Lawn & Garden", categoryList33));
        categoryList.add(new Category("3.1.1", "Kitchen Appliances", categoryList0));
        categoryList.add(new Category("3.1.2", "General Appliances", categoryList0));
        categoryList.add(new Category("3.3.1", "General lawns", categoryList33));
        categoryList.add(new Category("3.3.2", "General Garden", categoryList33));
        return categoryList;
    }

}