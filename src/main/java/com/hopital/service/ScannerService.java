package com.hopital.service;

import com.hopital.entities.Scanner;
import com.hopital.repo.IScanner;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class ScannerService implements IScanner {

    @NonNull
    private IScanner repo;
    @Override
    public List<Scanner> findAll() {
        return findAll();
    }

    @Override
    public List<Scanner> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Scanner> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Scanner> findAllById(Iterable<Long> longs) {
        return repo.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) { repo.deleteById(aLong);   }

    @Override
    public void delete(Scanner entity) { repo.delete(entity);   }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) { repo.deleteAllById(longs); }

    @Override
    public void deleteAll(Iterable<? extends Scanner> entities) { repo.deleteAll(entities); }

    @Override
    public void deleteAll() { repo.deleteAll(); }

    @Override
    public <S extends Scanner> S save(S entity) { return repo.save(entity); }

    @Override
    public <S extends Scanner> List<S> saveAll(Iterable<S> entities) {
        return repo.saveAll(entities);
    }

    @Override
    public Optional<Scanner> findById(Long aLong) {
        if (repo.existsById(aLong)) return repo.findById(aLong);
        else return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
       return repo.existsById(aLong);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Scanner> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Scanner> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Scanner> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Scanner getOne(Long aLong) {
        return null;
    }

    @Override
    public Scanner getById(Long aLong) {
        return null;
    }

    @Override
    public Scanner getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Scanner> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Scanner> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    @Override
    public <S extends Scanner> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Scanner> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Scanner> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Scanner> boolean exists(Example<S> example) {
        return repo.exists(example);
    }

    @Override
    public <S extends Scanner, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
