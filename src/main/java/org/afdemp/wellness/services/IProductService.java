package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Product;

public interface IProductService {
    public List<Product> findAllProducts();
    public Product findById(long id);
    public boolean save(Product product);
    public boolean delete(long id);
    public boolean updateById(Product product);
}
