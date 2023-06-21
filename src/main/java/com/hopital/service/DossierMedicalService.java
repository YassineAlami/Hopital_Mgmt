package com.hopital.service;

import com.hopital.entities.DossierMedical;
import com.hopital.repo.IDossierMedical;
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
public class DossierMedicalService implements IDossierMedical {
    @NonNull
    private IDossierMedical repo;
    @Override
    public List<DossierMedical> findAll() {
        return repo.findAll();
    }
    @Override
    public List<DossierMedical> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<DossierMedical> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<DossierMedical> findAllById(Iterable<Long> longs) {
        return repo.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {repo.deleteById(aLong);}

    @Override
    public void delete(DossierMedical entity) {repo.delete(entity);}

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {  repo.deleteAllById(longs);  }

    @Override
    public void deleteAll(Iterable<? extends DossierMedical> entities) {repo.deleteAll(entities);    }

    @Override
    public void deleteAll() {repo.deleteAll();}

    @Override
    public <S extends DossierMedical> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends DossierMedical> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<DossierMedical> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    @Override
    public void flush() {    }

    @Override
    public <S extends DossierMedical> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends DossierMedical> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<DossierMedical> entities) {    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {   }

    @Override
    public void deleteAllInBatch() {    }

    @Override
    public DossierMedical getOne(Long aLong) {
        return null;
    }

    @Override
    public DossierMedical getById(Long aLong) {
        return null;
    }

    @Override
    public DossierMedical getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends DossierMedical> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends DossierMedical> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    @Override
    public <S extends DossierMedical> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends DossierMedical> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends DossierMedical> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends DossierMedical> boolean exists(Example<S> example) {
        return repo.exists(example);
    }

    @Override
    public <S extends DossierMedical, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
