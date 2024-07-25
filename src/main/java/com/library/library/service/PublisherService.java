package com.library.library.service;

import com.library.library.dto.PublisherDTO;
import com.library.library.dto.PublisherSaveDTO;

import java.util.List;

public interface PublisherService {
    String addPublisher(PublisherSaveDTO publisherSaveDTO);
    List<PublisherDTO> getAllPublisher();
    String updatePublisher(PublisherDTO publisherUpdateDTO);
    String deletePublisher(int id);
}
