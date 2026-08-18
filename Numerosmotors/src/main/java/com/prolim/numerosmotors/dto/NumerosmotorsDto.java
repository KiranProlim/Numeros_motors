package com.prolim.numerosmotors.dto;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class NumerosmotorsDto implements Serializable {

	@Id
    private int id;
    private String name;

    public NumerosmotorsDto() {
    }

    public NumerosmotorsDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}