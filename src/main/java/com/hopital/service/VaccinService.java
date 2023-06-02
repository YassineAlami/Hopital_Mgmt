package com.hopital.service;

import com.hopital.entities.Vaccin;
import com.hopital.repo.IVaccin;
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
public class VaccinService implements IVaccin {
    @NonNull
    private IVaccin repo;
    @Override
    public List<Vaccin> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Vaccin> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Vaccin> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Vaccin> findAllById(Iterable<Long> longs) {
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
    public void delete(Vaccin entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Vaccin> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Vaccin> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Vaccin> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Vaccin> findById(Long aLong) {
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
    public <S extends Vaccin> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Vaccin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Vaccin> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Vaccin getOne(Long aLong) {
        return null;
    }

    @Override
    public Vaccin getById(Long aLong) {
        return null;
    }

    @Override
    public Vaccin getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Vaccin> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Vaccin> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Vaccin> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Vaccin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Vaccin> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Vaccin> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Vaccin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
