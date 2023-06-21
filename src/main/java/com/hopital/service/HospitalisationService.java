package com.hopital.service;

import com.hopital.entities.Hospitalisation;
import com.hopital.repo.IHospitalisation;
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
public class HospitalisationService implements IHospitalisation {

    @NonNull
    private IHospitalisation repo;

    @Override
    public List<Hospitalisation> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Hospitalisation> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Hospitalisation> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Hospitalisation> findAllById(Iterable<Long> longs) {
        return repo.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {repo.deleteById(aLong);    }

    @Override
    public void delete(Hospitalisation entity) {repo.delete(entity);    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {repo.deleteAllById(longs);    }

    @Override
    public void deleteAll(Iterable<? extends Hospitalisation> entities) {repo.deleteAll(entities);}

    @Override
    public void deleteAll() {repo.deleteAll();    }

    @Override
    public <S extends Hospitalisation> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends Hospitalisation> List<S> saveAll(Iterable<S> entities) {
        return repo.saveAll(entities);
    }

    @Override
    public Optional<Hospitalisation> findById(Long aLong) {
        if (repo.existsById(aLong)) return repo.findById(aLong);
        else return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    @Override
    public void flush() { }

    @Override
    public <S extends Hospitalisation> S saveAndFlush(S entity) {
        return repo.saveAndFlush(entity);
    }

    @Override
    public <S extends Hospitalisation> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Hospitalisation> entities) {  }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {    }

    @Override
    public void deleteAllInBatch() {   }

    @Override
    public Hospitalisation getOne(Long aLong) {
        return null;
    }

    @Override
    public Hospitalisation getById(Long aLong) {
        return null;
    }

    @Override
    public Hospitalisation getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Hospitalisation> Optional<S> findOne(Example<S> example) {
        if (repo.exists(example))return repo.findOne(example);
        else return Optional.empty();
    }

    @Override
    public <S extends Hospitalisation> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    @Override
    public <S extends Hospitalisation> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Hospitalisation> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Hospitalisation> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Hospitalisation> boolean exists(Example<S> example) {
        return repo.exists(example);
    }

    @Override
    public <S extends Hospitalisation, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
