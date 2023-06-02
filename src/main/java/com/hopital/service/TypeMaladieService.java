package com.hopital.service;

import com.hopital.entities.TypeMaladie;
import com.hopital.repo.ITypeMaladie;
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
public class TypeMaladieService implements ITypeMaladie {
    @NonNull
    private ITypeMaladie repo;
    @Override
    public List<TypeMaladie> findAll() {
        return repo.findAll();
    }

    @Override
    public List<TypeMaladie> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TypeMaladie> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TypeMaladie> findAllById(Iterable<Long> longs) {
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
    public void delete(TypeMaladie entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TypeMaladie> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TypeMaladie> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TypeMaladie> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TypeMaladie> findById(Long aLong) {
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
    public <S extends TypeMaladie> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TypeMaladie> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TypeMaladie> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TypeMaladie getOne(Long aLong) {
        return null;
    }

    @Override
    public TypeMaladie getById(Long aLong) {
        return null;
    }

    @Override
    public TypeMaladie getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends TypeMaladie> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TypeMaladie> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TypeMaladie> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TypeMaladie> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TypeMaladie> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TypeMaladie> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TypeMaladie, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
