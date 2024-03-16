package com.ingress.bookstore.service.impl;

import com.ingress.bookstore.dto.StudentDto;
import com.ingress.bookstore.repository.StudentRepository;
import com.ingress.bookstore.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

}
