package com.ingress.bookstore.service.impl;

import com.ingress.bookstore.dto.BookDto;
import com.ingress.bookstore.repository.BookRepository;
import com.ingress.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

   private final BookRepository bookRepository;
   private final ModelMapper modelMapper;

}
