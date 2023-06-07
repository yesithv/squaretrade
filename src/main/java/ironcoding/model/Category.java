package ironcoding.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Category {

    private String level;
    private String name;
    private List<String> keywords;

}
