package com.arif.crud.services;

import com.arif.crud.dtos.DeveloperRequest;
import com.arif.crud.models.DeveloperModel;
import com.arif.crud.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Arif Pehlivan
 */
@Service
public class DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    public List<DeveloperModel> findAll(){
        return developerRepository.findAll();
    }

    public DeveloperModel addDeveloper(DeveloperRequest request) {
        DeveloperModel developerModel = new DeveloperModel();
        developerModel.setName(request.getName());
        developerModel.setSurname(request.getSurname());
        return developerRepository.save(developerModel);
    }

    public DeveloperModel findById(Long id) {
        return developerRepository.findOne(id);
    }

    public DeveloperModel updateDeveloper(Long id, DeveloperRequest request) {
         DeveloperModel updatedDeveloper = Optional.ofNullable(developerRepository.findOne(id)).map(developer -> {
            developer.setName(request.getName());
            developer.setSurname(request.getSurname());
            return developer;
        }).get();
        return  developerRepository.save(updatedDeveloper);
    }

    public void deleteDeveloper(Long id) {
         developerRepository.delete(id);
    }
}
