package com.hopital.service;

import com.hopital.entities.Admin;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IAdmin;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class AdminService implements IAdmin {
    IAdmin repo;
    @Override
    public List<Admin> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Admin> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Admin> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Admin> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }

    @Override
    public void delete(Admin entity) {
        repo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Admin> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Admin> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends Admin> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Admin> findById(Long aLong) {

        Admin adm = repo.findById(aLong).orElseThrow(()-> new ResourceNotFoundException("Pas de Patient avec cet ID : "+aLong));
        return Optional.ofNullable(adm);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Admin> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Admin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Admin> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Admin getOne(Long aLong) {
        return null;
    }

    @Override
    public Admin getById(Long aLong) {
        Admin ad = repo.findById(aLong).orElseThrow(()-> new ResourceNotFoundException("Pas d'Admin avec cet ID : "+aLong));
        return Optional.ofNullable(ad).orElse(null);
    }

    @Override
    public Admin getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Admin> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Admin> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Admin> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Admin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Admin> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Admin> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Admin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
