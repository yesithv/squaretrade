package ironcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void validateGetData_ifDataExist() {
        var data = Main.fullData();
        assertNotNull(data);
    }

    @Test
    public void search_without_result() {
        var categoryList = Main.fullData();
        var categoryName = "Lorem ipsun";
        var data = Main.findByCategoryName(categoryList, categoryName);
        assertTrue(data.isEmpty());
    }

    @Test
    public void search_with_response() {
        var categoryList = Main.fullData();
        var categoryName = "Electronics";
        var data = Main.findByCategoryName(categoryList, categoryName);
        assertFalse(data.isEmpty());
    }

}