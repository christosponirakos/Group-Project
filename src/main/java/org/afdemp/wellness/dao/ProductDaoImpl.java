package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Product;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public class ProductDaoImpl extends AbstractDao<Integer, Product> implements IObjectDao {

    @Override
    public List<Product> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Product>) criteria.list();
    }

    @Override
    public Object findById(long id) {
        Product p = getByKey((int) id);
        if (p != null) {
            return p;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Product product = (Product) entity;
        boolean save = persist(product);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Product p = getByKey((int) id);
        if (p != null) {
            delete(p);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Product product = (Product) entity;
        Product p = (Product) findById(product.getId());
        if (p != null) {
            p.setTitle(product.getTitle());
            p.setPrice(product.getPrice());
            p.setShortDescription(product.getShortDescription());
            p.setDetails(product.getDetails());
            p.setExpire(product.getExpire());
            p.setDurationInDays(product.getDurationInDays());
            p.setImage(product.getImage());
            p.setTypeId(product.getTypeId());
            return save(p);
        }
        return false;
    }

}
