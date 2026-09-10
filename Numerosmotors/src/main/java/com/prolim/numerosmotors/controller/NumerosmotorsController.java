package com.prolim.numerosmotors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prolim.numerosmotors.dto.NumerosmotorsDto;
import com.prolim.numerosmotors.service.NumerosmotorsService;

@RestController
public class NumerosmotorsController {

    @Autowired
    private NumerosmotorsService service;

    // EC-DEV-005
    //EC-518 - EC-DEV-005: Implement Charging Status Display	
    @PostMapping("/save")
    public NumerosmotorsDto save(@RequestBody NumerosmotorsDto dto) {
        return service.saveData(dto);
    }


    @GetMapping("/getAll")
    public List<NumerosmotorsDto> getAll() {
        return service.getAllData();
    }
} 