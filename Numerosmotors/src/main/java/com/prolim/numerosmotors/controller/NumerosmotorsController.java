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

    // NUME-514 - Implement charging status API	

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/save")
    public NumerosmotorsDto save(@RequestBody NumerosmotorsDto dto) {
        return service.saveData(dto);
    }

    @GetMapping("/getAll")
    public List<NumerosmotorsDto> getAll() {
        return service.getAllData();
    }

    @GetMapping("/polarion/pallavi/tasks")
    public String getPallaviTasks() {
        return service.getPallaviTasks();
    }
}