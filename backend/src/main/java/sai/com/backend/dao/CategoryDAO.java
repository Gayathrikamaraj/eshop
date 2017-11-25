package sai.com.backend.dao;

import java.util.List;

import sai.com.backend.dto.Category;

public interface CategoryDAO {

	  List<Category> list();
	  Category get(int id);
	  
}
