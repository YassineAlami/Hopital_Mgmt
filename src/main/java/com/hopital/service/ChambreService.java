package com.hopital.service;

import com.hopital.entities.Chambre;
import com.hopital.repo.IChambre;
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
public class ChambreService implements IChambre {
    @NonNull
    private IChambre repo;
    @Override
    public List<Chambre> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Chambre> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Chambre> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Chambre> findAllById(Iterable<Long> longs) {
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
    public void delete(Chambre entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Chambre> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Chambre> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Chambre> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Chambre> findById(Long aLong) {
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
    public <S extends Chambre> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Chambre> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Chambre> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Chambre getOne(Long aLong) {
        return null;
    }

    @Override
    public Chambre getById(Long aLong) {
        return null;
    }

    @Override
    public Chambre getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Chambre> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Chambre> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Chambre> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Chambre> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Chambre> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Chambre> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Chambre, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
