package com.tajutechgh.kafkaconsumer.repository;

import com.tajutechgh.kafkaconsumer.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}