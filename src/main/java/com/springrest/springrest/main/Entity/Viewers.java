package com.springrest.springrest.main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Viewers_Data")
public class Viewers {
	
	@Id
	private int ViewerId;
	public String ViewerName;
	public int ViewerAge;
	public String ViewerCountry;
	public Viewers() {
		super();
	}
	public int getViewerId() {
		return ViewerId;
	}
	public void setViewerId(int viewerId) {
		ViewerId = viewerId;
	}
	public String getViewerName() {
		return ViewerName;
	}
	public void setViewerName(String viewerName) {
		ViewerName = viewerName;
	}
	public int getViewerAge() {
		return ViewerAge;
	}
	public void setViewerAge(int viewerAge) {
		ViewerAge = viewerAge;
	}
	public String getViewerCountry() {
		return ViewerCountry;
	}
	public void setViewerCountry(String viewerCountry) {
		ViewerCountry = viewerCountry;
	}
	

}
