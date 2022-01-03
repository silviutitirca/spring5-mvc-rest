package guru.springframework.services;

import guru.springframework.api.v1.model.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Silviu_Titirca on 12/23/2021
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
