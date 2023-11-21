package com.TestWebSpring.SpringDemoTest.repositories;

import com.TestWebSpring.SpringDemoTest.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {



}
