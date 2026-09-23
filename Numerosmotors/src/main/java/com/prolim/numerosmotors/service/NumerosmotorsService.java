package com.prolim.numerosmotors.service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prolim.numerosmotors.dto.NumerosmotorsDto;
import com.prolim.numerosmotors.repo.NumerosmotorsRepo;

@Service
public class NumerosmotorsService {

    @Autowired
    private NumerosmotorsRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    public NumerosmotorsDto saveData(NumerosmotorsDto dto) {
        return repo.save(dto);
    }

    public List<NumerosmotorsDto> getAllData() {
        return repo.getAll();
    }

    // Get Pallavi Tasks from Polarion
    public String getPallaviTasks() {

        try {

            String username = "rProject";
            String password = "12345";

            String auth = username + ":" + password;

            String encodedAuth = Base64.getEncoder()
                    .encodeToString(auth.getBytes(StandardCharsets.UTF_8));

            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Basic " + encodedAuth);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            String url =
            	    "http://kiran/polarion/rest/v1/projects/DEMOEWEC/workitems";

            System.out.println("Calling URL : " + url);

            ResponseEntity<String> response =
                    restTemplate.exchange(
                            url,
                            HttpMethod.GET,
                            entity,
                            String.class);

            return response.getBody();

        } catch (Exception e) {

            e.printStackTrace();

            return "POLARION ERRORRRRR : " + e.getMessage();
        }
    }
}