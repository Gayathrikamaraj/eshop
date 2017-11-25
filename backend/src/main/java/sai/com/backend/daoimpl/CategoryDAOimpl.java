package sai.com.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sai.com.backend.dao.CategoryDAO;
import sai.com.backend.dto.Category;

@Repository("categoryDAO")

public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("television");
		category.setDescription("this is discription for tv");
		category.setImageURL("CAT-1.png");
		category.setActive(true);
		categories.add(category);

		// 2rd category

		category = new Category();

		category.setId(2);
		category.setName("mobile");
		category.setDescription("this is discription for mobile");
		category.setImageURL("CAT-2.png");
		category.setActive(true);
		categories.add(category);

		// 3rd category
		category = new Category();

		category.setId(3);
		category.setName("lap");
		category.setDescription("this is discription for lap");
		category.setImageURL("CAT-3.png");
		category.setActive(true);
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
