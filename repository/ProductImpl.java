package com.xworkz.repository;

import com.xworkz.dto.ProductDetails;

import javax.persistence.*;
import java.util.List;

public class ProductImpl implements ProductRepository{

    @Override
    public void insertProductDetails(ProductDetails productDetails){
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("x-workz");
        EntityManager em =emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        et.begin();
        em.persist(productDetails);
        System.out.println("data successfully inserted into db");
        et.commit();
        em.close();
        emf.close();

    }

    @Override
    public void updateCompanyNameByProductName(String name, String newCompany) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       Query query =em.createNamedQuery("findByName").setParameter("n",name);
        ProductDetails productDetails=(ProductDetails)query.getSingleResult();
        et.begin();
        if (productDetails != null) {
          productDetails.setCompany(newCompany);
          em.merge(productDetails);
            System.out.println("company name updated successfully!");
        }
        et.commit();
        em.close();
        emf.close();

    }

    @Override
    public void deleteByName(String name) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em=emf.createEntityManager();
       EntityTransaction  et=em.getTransaction();
       Query query=em.createNamedQuery("findByName").setParameter("n",name);
        ProductDetails productDetails=(ProductDetails)query.getSingleResult();
        et.begin();
        if (productDetails!=null){
            em.remove(productDetails);
            System.out.println("data successfully deleted!");
        }
        et.commit();
        em.close();
        emf.close();
    }

    @Override
    public void getProductDetailsByName(String name) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        Query query=em.createNamedQuery("findByName").setParameter("n",name);
        ProductDetails productDetails= (ProductDetails)query.getSingleResult();
        System.out.println(productDetails);
        em.close();
        emf.close();
    }

    @Override
    public void getAllProductsDetails() {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        Query query=em.createNamedQuery("getAllProducts");
        List<ProductDetails> productDetails =query.getResultList();
        productDetails.forEach(ProductDetails-> System.out.println(productDetails));
        em.close();
        emf.close();
    }

    @Override
    public void getProductDetailsById(int id) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        Query query=em.createNamedQuery("findById").setParameter("number",id);
        ProductDetails productDetails=(ProductDetails)query.getSingleResult();;
        System.out.println(productDetails);
        em.close();
        emf.close();
    }

    @Override
    public void deleteProductById(int id) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        EntityTransaction  et=em.getTransaction();
        Query query=em.createNamedQuery("findById").setParameter("number",id);
        ProductDetails productDetails=(ProductDetails)query.getSingleResult();
        et.begin();
        if (productDetails!=null){
            em.remove(productDetails);
            System.out.println("data successfully deleted!");
        }
        et.commit();
        em.close();
        emf.close();

    }
}
