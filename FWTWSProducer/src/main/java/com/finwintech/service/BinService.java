package com.finwintech.service;

import com.finwintech.entity.Bin;
import com.finwintech.repository.BinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinService implements IBinService {
	@Autowired
	private BinRepository binRepository;
	@Override
	public Bin getBinByBinNumber(String binNumber) {
		return binRepository.findByBinNumber(binNumber);
	}
}
