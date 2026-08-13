package com.prolim.numerosmotors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prolim.numerosmotors.dto.NumerosmotorsDto;
import com.prolim.numerosmotors.repo.NumerosmotorsRepo;

@Service
public class NumerosmotorsService {

    @Autowired
    private NumerosmotorsRepo repo;

    public NumerosmotorsDto saveData(NumerosmotorsDto dto) {
        return repo.save(dto);
    }

    public List<NumerosmotorsDto> getAllData() {
        return repo.getAll();
    }
}