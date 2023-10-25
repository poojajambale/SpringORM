package com.springorm.dao;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.Student;

public class StudentDAO {
	private HibernateTemplate hibernateTemplate;
	
	//inserting student using save method
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
