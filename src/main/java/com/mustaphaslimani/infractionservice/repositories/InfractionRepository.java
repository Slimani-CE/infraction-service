package com.mustaphaslimani.infractionservice.repositories;

import com.mustaphaslimani.infractionservice.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource
public interface InfractionRepository extends JpaRepository<Infraction, Long> {
    List<Infraction> findByRadarId(Long radarId);
}
