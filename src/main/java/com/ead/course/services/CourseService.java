package com.ead.course.services;

import com.ead.course.dtos.CourseDto;
import com.ead.course.models.CourseModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface CourseService {

    void delete(CourseModel courseModel);

    CourseModel save(CourseDto courseDto);

    Optional<CourseModel> findById(UUID courseId);

    CourseModel update(CourseModel courseModel);

    Page<CourseModel> findAll(Specification<CourseModel> spec, Pageable pageable);
}
