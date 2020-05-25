package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.CartProduct;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("cartproductDao")
public class CartProductDaoImpl extends AbstractDao<Integer, CartProduct> implements IObjectDao {

    @Override
    public List<CartProduct> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<CartProduct>) criteria.list();
    }

    @Override
    public CartProduct findById(long id) {
        CartProduct cf = getByKey((int) id);
        if (cf != null) {
            return cf;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        CartProduct cartProduct = (CartProduct) entity;
        boolean save = persist(cartProduct);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        CartProduct cd = getByKey((int) id);
        if (cd != null) {
            delete(cd);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        CartProduct cartProduct = (CartProduct) entity;
        CartProduct cd = (CartProduct) findById(cartProduct.getId());
        if (cd != null) {
            cd.setCartId(cartProduct.getCartId());
            cd.setProductId(cartProduct.getProductId());
            return save(cd);
        }
        return false;
    }

}
