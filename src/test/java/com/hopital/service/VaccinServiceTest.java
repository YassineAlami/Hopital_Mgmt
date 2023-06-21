package com.hopital.service;

import com.hopital.entities.Vaccin;
import com.hopital.repo.IVaccin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
class VaccinServiceTest {


    @Test
    void findAll() {

    }

    @Test
    void testFindAll() {
    }

    @Test
    void testFindAll1() {
    }

    @Test
    void findAllById() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteAllById() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void testDeleteAll() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pfizer", "Moderna", "AstraZeneca"})
    void save() { }

    @Test
    void saveAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void existsById() {
    }

    @Test
    void testFindAll2() {
    }

    @Test
    void exists() {
    }
}