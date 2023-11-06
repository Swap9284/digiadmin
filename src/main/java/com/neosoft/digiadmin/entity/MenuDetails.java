package com.neosoft.digiadmin.entity;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu")
public class MenuDetails {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "menuname")
	private String menuName;
	 

	@Column(name = "status")
	private int status;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "menu",fetch=FetchType.LAZY)
	private List<SubMenuDetails> subMenu;
	
	public MenuDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MenuDetails(Long id, String menuName, int status, List<SubMenuDetails> subMenu) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.status = status;
		this.subMenu = subMenu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<SubMenuDetails> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<SubMenuDetails> subMenu) {
		this.subMenu = subMenu;
	}
	
	
	
	
	

}
