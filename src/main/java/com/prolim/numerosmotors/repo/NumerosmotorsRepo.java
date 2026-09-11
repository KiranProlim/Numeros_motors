package com.prolim.numerosmotors.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prolim.numerosmotors.dto.NumerosmotorsDto;

@Repository
public class NumerosmotorsRepo {

    private List<NumerosmotorsDto> db = new ArrayList<>();

    public NumerosmotorsDto save(NumerosmotorsDto dto) {
        db.add(dto);
        return dto;
    }

    public List<NumerosmotorsDto> getAll() {
        return db;
    }
}