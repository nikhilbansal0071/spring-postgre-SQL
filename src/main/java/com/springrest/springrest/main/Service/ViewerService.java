package com.springrest.springrest.main.Service;

import java.util.List;

import com.springrest.springrest.main.Entity.Viewers;

public interface ViewerService {

	public Viewers saveViewers(Viewers viewers);
	public List<Viewers> getAllViewers();
}
