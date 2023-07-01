package com.springrest.springrest.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.main.Entity.Viewers;
import com.springrest.springrest.main.Repository.ViewerRepository;

@Service
public class ViewerServiceImpl implements ViewerService{
	
	@Autowired
	private ViewerRepository viewerrepository;
	
	public Viewers saveViewers(Viewers viewers) {
		
		return  viewerrepository.save(viewers);
	}

	public List<Viewers> getAllViewers(){
	return viewerrepository.findAll();
	
	}
}
