package com.ead.course.services;

import com.ead.course.dtos.LessonDto;
import com.ead.course.models.LessonModel;
import com.ead.course.models.ModuleModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface LessonService {
    LessonModel save(LessonDto lessonDto, ModuleModel moduleModel);

    Optional<LessonModel> findLessonIntoModule(UUID moduleId, UUID lessonId);

    void delete(LessonModel lessonModel);

    LessonModel update(@Valid LessonDto lessonDto);

    List<LessonModel> findAllByModule(UUID moduleId);

    Page<LessonModel> findAllByModule(Specification<LessonModel> spec, Pageable pageable);
}
