
package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.CategoryType;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("categorytypeDao")
public class CategoryTypeDaoImpl extends AbstractDao<Integer, CategoryType> implements IObjectDao {

    @Override
    public List<CategoryType> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<CategoryType>) criteria.list();
    }

    @Override
    public CategoryType findById(long id) {
        CategoryType ct = getByKey((int) id);
        if (ct != null) {
            return ct;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        CategoryType categoryType = (CategoryType) entity;
        boolean save = persist(categoryType);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        CategoryType ct = getByKey((int) id);
        if (ct != null) {
            delete(ct);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        CategoryType categoryType = (CategoryType) entity;
        CategoryType ct = (CategoryType) findById(categoryType.getId());
        if (ct != null) {
            ct.setCategoryId(categoryType.getCategoryId());
            ct.setTypeId(categoryType.getTypeId());
            return save(ct);
        }
        return false;
    }

}
