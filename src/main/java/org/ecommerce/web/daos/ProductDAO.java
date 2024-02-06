package org.ecommerce.web.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ecommerce.web.models.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
    @PersistenceContext 
    private EntityManager manager;
    
    public void save(Product product){
        manager.persist(product);
    }

}
