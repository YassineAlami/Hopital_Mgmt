package com.hopital.service;


import com.hopital.entities.Patient;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IPatient;
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
public class PatientService implements IPatient {

    @NonNull
    private IPatient repo;

    @Override
    public List<Patient> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Patient> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Patient> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Patient> findAllById(Iterable<Long> longs) {
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
    public void delete(Patient entity) {
        repo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Patient> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Patient> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends Patient> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Patient> findById(Long aLong) {
        Patient pt = repo.findById(aLong).orElseThrow(()-> new ResourceNotFoundException("Pas de Patient avec cet ID : "+aLong));
        return Optional.ofNullable(pt);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Patient> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Patient> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Patient> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Patient getOne(Long aLong) {
        return null;
    }

    @Override
    public Patient getById(Long aLong) {
        return null;
    }

    @Override
    public Patient getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Patient> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Patient> List<S> findAll(Example<S> example) {
        return (List<S>) repo.findAll();
    }

    @Override
    public <S extends Patient> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Patient> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Patient> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Patient> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Patient, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
