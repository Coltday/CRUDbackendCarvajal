package com.carvajal.crudbackend.service;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;


import com.carvajal.crudbackend.model.Tarjeta;
import com.carvajal.crudbackend.respository.TarjetaRepository;

@Service
public class TarjetaService implements TarjetaRepository {

	
	@Autowired
	private TarjetaRepository tarjetaRepository;
	

	@Override
	@Transactional
	public List<Tarjeta> findAll() {
		// TODO Auto-generated method stub
		return (List<Tarjeta>)tarjetaRepository.findAll();
	}
	
//	Encuentra tarjetas de clientes
	
	public List<Tarjeta> findAllByCliente(Long numero){
		try { List<Tarjeta> tarjetaRespuesta= new ArrayList();
		List<Tarjeta> tarjeta=tarjetaRepository.findAll();
		for (int i=0; i<tarjeta.size();i++) {
			if(tarjeta.get(i).getCliente().getId()==numero) {
				tarjetaRespuesta.add(tarjeta.get(i));
			}
			}
		return tarjetaRespuesta;
	} catch (Exception e) {
		return null;
		}
	}
	
	@Override
	public List<Tarjeta> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Tarjeta> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Tarjeta> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tarjeta> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Tarjeta> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tarjeta getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tarjeta> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tarjeta> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Tarjeta> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tarjeta> S save(S entity) {
		// TODO Auto-generated method stub
		return tarjetaRepository.save(entity);
	}

	@Override
	public Optional<Tarjeta> findById(Long id) {
		// TODO Auto-generated method stub
		return tarjetaRepository.findById(id);
	}

//	@Override
//	@Transactional
//	public Tarjeta findById(Long id) {
//		return tarjetaRepository.findById(id).orElse(null);
//	}
	
	
	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		tarjetaRepository.deleteById(id);
	}

	@Override
	public void delete(Tarjeta entity) {
		// TODO Auto-generated method stub
		tarjetaRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		tarjetaRepository.deleteAllById(ids);
		
	}

	@Override
	public void deleteAll(Iterable<? extends Tarjeta> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Tarjeta> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tarjeta> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tarjeta> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Tarjeta> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Tarjeta, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Tarjeta> findAllById(Iterable<Long> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Tarjeta getById(Long id) {
		// TODO Auto-generated method stub
		return tarjetaRepository.getById(id);
	}

	@Override
	public List<Tarjeta> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

}

