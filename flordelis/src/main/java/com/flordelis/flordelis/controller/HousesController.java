package com.flordelis.flordelis.controller;

import com.flordelis.flordelis.model.House;
import com.flordelis.flordelis.repository.HouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/houses")
@AllArgsConstructor
public class HousesController {

    private final HouseRepository homeRepository;

    @GetMapping
    public List<House> list() {
        return homeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<House> create(@RequestBody House house) {
        return new ResponseEntity(homeRepository.save(house), HttpStatus.CREATED);
    }
}
