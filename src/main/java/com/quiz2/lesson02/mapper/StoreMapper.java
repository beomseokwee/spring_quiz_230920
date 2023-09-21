package com.quiz2.lesson02.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.quiz2.lesson02.domain.Store;

@Repository
public interface StoreMapper {
	
	// input : X
	// output: List<Store>
	public List<Store> selectGetStoreList();
	
}
