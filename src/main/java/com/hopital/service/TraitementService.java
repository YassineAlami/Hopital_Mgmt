package com.hopital.service;

import com.hopital.entities.Traitement;
import com.hopital.repo.ITraitement;
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
public class TraitementService implements ITraitement {

    @NonNull
    private ITraitement repo;
    @Override
    public List<Traitement> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Traitement> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Traitement> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Traitement> findAllById(Iterable<Long> longs) {
        return repo.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) { repo.deleteById(aLong);}

    @Override
    public void delete(Traitement entity) { repo.delete(entity); }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) { repo.deleteAllById(longs); }

    @Override
    public void deleteAll(Iterable<? extends Traitement> entities) { repo.deleteAll(entities); }

    @Override
    public void deleteAll() { repo.deleteAll(); }

    @Override
    public <S extends Traitement> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends Traitement> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Traitement> findById(Long aLong) {
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
    public <S extends Traitement> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Traitement> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Traitement> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Traitement getOne(Long aLong) {
        return null;
    }

    @Override
    public Traitement getById(Long aLong) {
        return null;
    }

    @Override
    public Traitement getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Traitement> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Traitement> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Traitement> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Traitement> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Traitement> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Traitement> boolean exists(Example<S> example) {
        return repo.exists(example);
    }

    @Override
    public <S extends Traitement, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
