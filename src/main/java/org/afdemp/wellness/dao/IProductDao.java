package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Product;

public interface IProductDao {
    public List<Product> findAllProducts();
    public Product findById(int id);
    public boolean save(Product product);
    public boolean delete(int id);
    public boolean update(Product product);
}
