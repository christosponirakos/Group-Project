
package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.ProductTypeCategory;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("producttypecategoryDao")
public class ProductTypeCategoryDaoImpl extends AbstractDao<Integer, ProductTypeCategory> implements IObjectDao {

    @Override
    public List<ProductTypeCategory> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<ProductTypeCategory>) criteria.list();
    }

    @Override
    public ProductTypeCategory findById(long id) {
        ProductTypeCategory ctp = getByKey((int) id);
        if (ctp != null) {
            return ctp;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        ProductTypeCategory productTypeCategory = (ProductTypeCategory) entity;
        boolean save = persist(productTypeCategory);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        ProductTypeCategory ctp = getByKey((int) id);
        if (ctp != null) {
            delete(ctp);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        ProductTypeCategory productTypeCategory = (ProductTypeCategory) entity;
        ProductTypeCategory ctp = (ProductTypeCategory) findById(productTypeCategory.getId());
        if (ctp != null) {
            ctp.setCategoryTypeId(productTypeCategory.getCategoryTypeId());
            ctp.setProductId(productTypeCategory.getProductId());
            return save(ctp);
        }
        return false;
    }

}
