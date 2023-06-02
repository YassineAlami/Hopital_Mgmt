package com.hopital.service;

import com.hopital.entities.ServiceGarde;
import com.hopital.repo.IServiceGarde;
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
public class ServiceGardeService implements IServiceGarde {
    @NonNull
    private IServiceGarde repo;
    @Override
    public List<ServiceGarde> findAll() {
        return repo.findAll();
    }

    @Override
    public List<ServiceGarde> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ServiceGarde> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<ServiceGarde> findAllById(Iterable<Long> longs) {
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
    public void delete(ServiceGarde entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ServiceGarde> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ServiceGarde> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ServiceGarde> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ServiceGarde> findById(Long aLong) {
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
    public <S extends ServiceGarde> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ServiceGarde> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ServiceGarde> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ServiceGarde getOne(Long aLong) {
        return null;
    }

    @Override
    public ServiceGarde getById(Long aLong) {
        return null;
    }

    @Override
    public ServiceGarde getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ServiceGarde> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ServiceGarde> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ServiceGarde> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ServiceGarde> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ServiceGarde> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ServiceGarde> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ServiceGarde, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
