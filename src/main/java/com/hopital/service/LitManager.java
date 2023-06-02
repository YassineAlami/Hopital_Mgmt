package com.hopital.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import com.hopital.entities.Lit;
import com.hopital.repo.ILit;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class LitManager implements ILit
{
	@Override
	public List<Lit> findAll() {
		return null;
	}

	@Override
	public List<Lit> findAll(Sort sort) {
		return null;
	}

	@Override
	public Page<Lit> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public List<Lit> findAllById(Iterable<Long> longs) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long aLong) {}

	@Override
	public void delete(Lit entity) {}

	@Override
	public void deleteAllById(Iterable<? extends Long> longs) {	}

	@Override
	public void deleteAll(Iterable<? extends Lit> entities) {	}

	@Override
	public void deleteAll() {}

	@Override
	public <S extends Lit> S save(S entity) {
		return null;
	}

	@Override
	public <S extends Lit> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<Lit> findById(Long aLong) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long aLong) {	return false;}

	@Override
	public void flush() {}

	@Override
	public <S extends Lit> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public <S extends Lit> List<S> saveAllAndFlush(Iterable<S> entities) {
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Lit> entities) {}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> longs) {}

	@Override
	public void deleteAllInBatch() {}

	@Override
	public Lit getOne(Long aLong) {
		return null;
	}

	@Override
	public Lit getById(Long aLong) {
		return null;
	}

	@Override
	public Lit getReferenceById(Long aLong) {
		return null;
	}

	@Override
	public <S extends Lit> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Override
	public <S extends Lit> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Lit> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public <S extends Lit> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Lit> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Lit> boolean exists(Example<S> example) {
		return false;
	}

	@Override
	public <S extends Lit, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {return null;}
}
