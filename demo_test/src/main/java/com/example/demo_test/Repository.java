package com.example.demo_test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Member, Long> {
}
