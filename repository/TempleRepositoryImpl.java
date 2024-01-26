package com.xworkz.repository;

import com.xworkz.dto.TempleEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TempleRepositoryImpl implements TempleRepository{


    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("x-workz");

    @Override
    public void save(TempleEntity templeEntity) {
       EntityManager entityManager= this.entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction =entityManager.getTransaction();
        try {
            System.out.println("save entity "+templeEntity);
            entityTransaction.begin();
            System.out.println("starting transaction");
            entityManager.persist(templeEntity);
            System.out.println("start persist");
            entityTransaction.commit();
            System.out.println("save entity");
        }catch (PersistenceException pe){
            System.out.println("persistence exception in save "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        TempleRepository.super.save(templeEntity);
    }

    @Override
    public void saveAll(List<TempleEntity> templeEntityList) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

        try {
            System.out.println("list of entity "+ templeEntityList);
            entityTransaction.begin();
            System.out.println("et started");
            templeEntityList.forEach(entity->entityManager.persist(entity));
            System.out.println("start persist all the entity");
            entityTransaction.commit();
            System.out.println("entity saved");
        }catch (PersistenceException pe){
            System.out.println("persistence exception in save all "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
           entityManager.close();
            System.out.println("closing resources");
        }
        TempleRepository.super.saveAll(templeEntityList);
    }

    @Override
    public List<TempleEntity> findAllByLocation(String location) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try{
            System.out.println("location name "+location);
            entityTransaction.begin();
            System.out.println("entity transaction begins");
            Query query=entityManager.createNamedQuery("findAllByLocation");
            query.setParameter("l",location);
            List<TempleEntity> entities= query.getResultList();
            System.out.println("all data fetched");
            return entities;
        }catch (PersistenceException pe){
            System.out.println("persistence exception in findAllByLocation "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return TempleRepository.super.findAllByLocation(location);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThen(int fee) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            System.out.println(" fee value "+fee);
            entityTransaction.begin();
            Query query=entityManager.createNamedQuery("findAllByEntryFeeGreaterThen");
            query.setParameter("fee",fee);
            List<TempleEntity> templeEntityList=query.getResultList();
            entityTransaction.commit();
            return templeEntityList;
        }catch (PersistenceException pe){
            System.out.println("persistence exception in findAllByEntryFeeGreaterThen "+pe.getMessage());
        }finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return TempleRepository.super.findAllByEntryFeeGreaterThen(fee);
    }


    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(int first, int second) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            System.out.println("first: "+first +" second: "+second);
            entityTransaction.begin();
            System.out.println("entityTransaction begins");
            Query query=entityManager.createNamedQuery("findAllByEntryFeeBetween");
            System.out.println("named query created ");
            query.setParameter("first",first);
            query.setParameter("second",second);
            List<TempleEntity> list=query.getResultList();
            System.out.println("data fetched");
            entityTransaction.commit();
            return list;

        }catch (PersistenceException pe){
            System.out.println("exception in findAllByEntryFeeBetween "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("closing resources");
        }
        return TempleRepository.super.findAllByEntryFeeBetween(first, second);
    }

    @Override
    public List<TempleEntity> findAllByOpenedDateGreaterThen(LocalDate date) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            System.out.println("date "+date);
            entityTransaction.begin();
            System.out.println("et begins");
            Query query=entityManager.createNamedQuery("findAllByOpenedDateGreaterThen");
            query.setParameter("d",date);
            List<TempleEntity> entities=query.getResultList();
            entityTransaction.commit();
            System.out.println("saved the");
            return entities;
        }catch (PersistenceException pe){
            System.out.println("exception in findAllByOpenedDateGreaterThen "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }
        return TempleRepository.super.findAllByOpenedDateGreaterThen(date);
    }

    @Override
    public List<TempleEntity> findAllByGodAndLocation(String location, String god) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

        try {
            System.out.println("location "+location+" god "+god);
            System.out.println("entity transaction begins");
            entityTransaction.begin();
            Query query=entityManager.createNamedQuery("findAllByGodAndLocation");
            query.setParameter("loc",location);
            query.setParameter("go",god);
            List<TempleEntity> list=query.getResultList();
            System.out.println("entity list collected");
            entityTransaction.commit();
            return list;
        }catch (PersistenceException pe){
            System.out.println("exception "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("resources closed");
        }
        return TempleRepository.super.findAllByGodAndLocation(location, god);
    }

    @Override
    public TempleEntity findById(int id) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            System.out.println("id "+id);
          entityTransaction.begin();
            System.out.println("starting transaction");
          TempleEntity entity=entityManager.find(TempleEntity.class,id);
          entityTransaction.commit();
          return entity;
        }catch (PersistenceException pe){
            System.out.println("exception "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("resources closed");
        }
        return TempleRepository.super.findById(id);
    }

    @Override
    public TempleEntity findByIdAndGod(int id, String god) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            System.out.println( "id and god "+id +" "+god);
            entityTransaction.begin();
           Query query=entityManager.createNamedQuery("findByIdAndGod");

           query.setParameter("num",id);
           query.setParameter("go",god);
           TempleEntity entity=(TempleEntity) query.getSingleResult();
            System.out.println("entity collected");
            entityTransaction.commit();
            return entity;
        }catch (PersistenceException pe){
            System.out.println("exception "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("resources closed");
        }
        return TempleRepository.super.findByIdAndGod(id, god);
    }

    @Override
    public TempleEntity findTempleByMaxEntryFee() {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            System.out.println("starting findTempleByMaxEntryFee");
            entityTransaction.begin();
            Query query=entityManager.createNamedQuery("findAll");
            List<TempleEntity> list=query.getResultList();
            System.out.println("entities fetched");
            TempleEntity entity= list.stream().max(Comparator.comparing(TempleEntity::getEntryFee)).get();
            entityTransaction.commit();
           return entity;
        }catch (PersistenceException pe){
            System.out.println("exception "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("resources closed");
        }
        return TempleRepository.super.findTempleByMaxEntryFee();
    }

    @Override
    public long findTotal() {
        int number=0;
        long num;
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            entityTransaction.begin();
            System.out.println("entityTransaction begins");
            Query query=entityManager.createNamedQuery("findAll");
            List<TempleEntity> list=query.getResultList();
            num=list.stream().mapToLong(TempleEntity::getVipFee).sum();
            System.out.println("value collected");
            entityTransaction.commit();
            return num;
        }catch (PersistenceException pe){
            System.out.println("exception "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            System.out.println("resources closed");
        }
        return TempleRepository.super.findTotal();
    }

    @Override
    public void updateEntityLocationByName(String location, String name) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            entityTransaction.begin();
            Query query=entityManager.createNamedQuery("updateLocationByName");
            query.setParameter("loc",location);
            query.setParameter("n",name);
            System.out.println("update started");
            query.executeUpdate();
            System.out.println("updated");
            entityTransaction.commit();
        }catch (PersistenceException pe){
            System.out.println("exception "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
           entityManager.close();
        }
        TempleRepository.super.updateEntityLocationByName(location, name);
    }

    @Override
    public void updateEntryFeeByName(int entryFee, String name) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            entityTransaction.begin();
            Query query=entityManager.createNamedQuery("updateEntryFeeByName");
            query.setParameter("num",entryFee);
            query.setParameter("n",name);
            System.out.println("update started");
            query.executeUpdate();
            System.out.println("updated");
            entityTransaction.commit();
        }catch (PersistenceException pe){
            System.out.println("exception "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }
        TempleRepository.super.updateEntryFeeByName(entryFee, name);
    }

    @Override
    public void updateLocationAndDimensionById(String location, double dimension, int id) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            entityTransaction.begin();
            Query query=entityManager.createNamedQuery("updateLocationAndDimensionById");
            query.setParameter("loc",location);
            query.setParameter("dim",dimension);
            query.setParameter("num",id);
            query.executeUpdate();
            System.out.println("all the data updated");
            entityTransaction.commit();
        }catch (PersistenceException pe){
            System.out.println("exception in updateLocationAndDimensionById "+pe.getMessage());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }
        TempleRepository.super.updateLocationAndDimensionById(location, dimension, id);
    }
}
