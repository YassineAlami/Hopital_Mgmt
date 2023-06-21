package com.hopital.service;

import com.hopital.entities.Maladie;
import com.hopital.repo.IMaladie;
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
public class MaladieService implements IMaladie {

    @NonNull
    private IMaladie repo;

    @Override
    public List<Maladie> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Maladie> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Maladie> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Maladie> findAllById(Iterable<Long> longs) {
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
    public void delete(Maladie entity) {
        repo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
            repo.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Maladie> entities) {
        repo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }

    @Override
    public <S extends Maladie> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends Maladie> List<S> saveAll(Iterable<S> entities) {
        return repo.saveAll(entities);
    }

    @Override
    public Optional<Maladie> findById(Long aLong) {
        if (repo.existsById(aLong)) return repo.findById(aLong);
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Maladie> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Maladie> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Maladie> entities) {
        IMaladie.super.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Maladie> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Maladie getOne(Long aLong) {
        return null;
    }

    @Override
    public Maladie getById(Long aLong) {
        return null;
    }

    @Override
    public Maladie getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Maladie> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Maladie> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    @Override
    public <S extends Maladie> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Maladie> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Maladie> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Maladie> boolean exists(Example<S> example) {
        return repo.exists(example);
    }

    @Override
    public <S extends Maladie, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
