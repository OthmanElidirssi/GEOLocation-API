package com.example.locationapi.service;


import com.example.locationapi.entities.Position;
import com.example.locationapi.repos.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PositionService {


    private PositionRepository positionRepository;


    @Autowired
    public PositionService(PositionRepository positionRepository){
        this.positionRepository=positionRepository;
    }


    public void addPosition(Position position){
        positionRepository.save(position);
    }

    public List<Position> getAll(){
        return positionRepository.findAll();
    }
}
