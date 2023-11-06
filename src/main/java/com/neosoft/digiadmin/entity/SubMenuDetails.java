package com.neosoft.digiadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "submenu")
public class SubMenuDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "submenuname")
	private String subMenuName;
	
	@Column(name = "status")
	private int status;
	
	@ManyToOne
	@JoinColumn(name = "menuid")//foreign key (menu_id) references menu (id)
	private MenuDetails menu;

	
	public SubMenuDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SubMenuDetails(Long id, String subMenuName, int status, MenuDetails menu) {
		super();
		this.id = id;
		this.subMenuName = subMenuName;
		this.status = status;
		this.menu = menu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubMenuName() {
		return subMenuName;
	}

	public void setSubMenuName(String subMenuName) {
		this.subMenuName = subMenuName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public MenuDetails getMenu() {
		return menu;
	}

	public void setMenu(MenuDetails menu) {
		this.menu = menu;
	}
	
	
	

}
