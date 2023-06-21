package com.hopital.service;

import com.hopital.entities.TypeVaccin;
import com.hopital.repo.ITypeVaccin;
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
public class TypeVaccinService implements ITypeVaccin {
    @NonNull
    private ITypeVaccin repo;
    @Override
    public List<TypeVaccin> findAll() {
        return repo.findAll();
    }

    @Override
    public List<TypeVaccin> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TypeVaccin> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TypeVaccin> findAllById(Iterable<Long> longs) {
        return repo.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) { repo.deleteById(aLong); }

    @Override
    public void delete(TypeVaccin entity) { repo.delete(entity); }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) { repo.deleteAllById(longs); }

    @Override
    public void deleteAll(Iterable<? extends TypeVaccin> entities) { repo.deleteAll(entities); }

    @Override
    public void deleteAll() { repo.deleteAll(); }

    @Override
    public <S extends TypeVaccin> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends TypeVaccin> List<S> saveAll(Iterable<S> entities) {
        return repo.saveAll(entities);
    }

    @Override
    public Optional<TypeVaccin> findById(Long aLong) {
        return Optional.ofNullable(repo.findById(aLong).get());
    }

    @Override
    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends TypeVaccin> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TypeVaccin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TypeVaccin> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TypeVaccin getOne(Long aLong) {
        return null;
    }

    @Override
    public TypeVaccin getById(Long aLong) {
        return null;
    }

    @Override
    public TypeVaccin getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends TypeVaccin> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TypeVaccin> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    @Override
    public <S extends TypeVaccin> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TypeVaccin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TypeVaccin> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TypeVaccin> boolean exists(Example<S> example) {
        return repo.exists(example);
    }

    @Override
    public <S extends TypeVaccin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
