package com.hopital.service;

import com.hopital.entities.Medecin;
import com.hopital.repo.IMedecin;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class MedecinService implements IMedecin {
    @NonNull
    private IMedecin repo;

    @Override
    public List<Medecin> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Medecin> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Medecin> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Medecin> findAllById(Iterable<Long> longs) {
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
    public void delete(Medecin entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Medecin> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Medecin> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Medecin> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Medecin> findById(Long aLong) {
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
    public <S extends Medecin> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Medecin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Medecin> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Medecin getOne(Long aLong) {
        return null;
    }

    @Override
    public Medecin getById(Long aLong) {
        return null;
    }

    @Override
    public Medecin getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Medecin> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Medecin> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Medecin> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Medecin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Medecin> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Medecin> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Medecin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
