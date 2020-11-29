package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.ContactBean;

public interface ContactRepo extends JpaRepository<ContactBean, Serializable>{

}
