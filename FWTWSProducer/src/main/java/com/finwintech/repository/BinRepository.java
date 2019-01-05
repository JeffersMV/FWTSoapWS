package com.finwintech.repository;

import com.finwintech.entity.Bin;
import org.springframework.data.repository.CrudRepository;

public interface BinRepository extends CrudRepository<Bin, Long>  {
	Bin findByBinNumber(String binNumber);
}
