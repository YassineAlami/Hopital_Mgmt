package com.hopital.service;

import com.hopital.entities.Rendez_Vous;
import com.hopital.repo.IPatient;
import com.hopital.repo.IRendez_vous;
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

@RequiredArgsConstructor
@Service
public class RendezVouService implements IRendez_vous {
    @NonNull
    private IRendez_vous repo;

    @Override
    public List<Rendez_Vous> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Rendez_Vous> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Rendez_Vous> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Rendez_Vous> findAllById(Iterable<Long> longs) {
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
    public void delete(Rendez_Vous entity) {
        repo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Rendez_Vous> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Rendez_Vous> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends Rendez_Vous> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Rendez_Vous> findById(Long aLong) {
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
    public <S extends Rendez_Vous> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Rendez_Vous> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Rendez_Vous> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Rendez_Vous getOne(Long aLong) {
        return null;
    }

    @Override
    public Rendez_Vous getById(Long aLong) {
        return null;
    }

    @Override
    public Rendez_Vous getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Rendez_Vous> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Rendez_Vous> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Rendez_Vous> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Rendez_Vous> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Rendez_Vous> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Rendez_Vous> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Rendez_Vous, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
