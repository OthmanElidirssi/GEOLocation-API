package com.example.locationapi.repos;

import com.example.locationapi.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
