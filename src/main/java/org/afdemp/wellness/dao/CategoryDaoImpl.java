package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Category;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractDao<Integer, Category> implements IObjectDao {

    @Override
    public List<Category> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Category>) criteria.list();
    }

    @Override
    public Category findById(long id) {
        Category c = getByKey((int) id);
        if (c != null) {
            return c;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Category category = (Category) entity;
        boolean save = persist(category);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Category c = getByKey((int) id);
        if (c != null) {
            delete(c);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Category category = (Category) entity;
        Category c = (Category) findById(category.getId());
        if (c != null) {
            c.setCategory(category.getCategory());

            return save(c);
        }
        return false;
    }

}
