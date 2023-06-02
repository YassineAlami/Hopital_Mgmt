package com.hopital.service;

import com.hopital.entities.Specialite;
import com.hopital.repo.ISpecialite;
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
public class SpecialiteService implements ISpecialite {
    @NonNull
    private ISpecialite repo;
    @Override
    public List<Specialite> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Specialite> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Specialite> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Specialite> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Specialite entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Specialite> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Specialite> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Specialite> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Specialite> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Specialite> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Specialite> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Specialite> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Specialite getOne(Long aLong) {
        return null;
    }

    @Override
    public Specialite getById(Long aLong) {
        return null;
    }

    @Override
    public Specialite getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Specialite> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Specialite> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Specialite> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Specialite> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Specialite> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Specialite> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Specialite, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
