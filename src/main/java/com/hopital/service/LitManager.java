package com.hopital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopital.entities.Lit;
import com.hopital.repo.IChambre;
import com.hopital.repo.ILit;

@Service
public class LitManager implements IMetierLit
{
	@Autowired
	private ILit lrepo;

	@Autowired
	private IChambre chrepo;
	
	@Override
	public Lit addLit(Lit l, long idch) 
	{
		
		return null;
	}

}
