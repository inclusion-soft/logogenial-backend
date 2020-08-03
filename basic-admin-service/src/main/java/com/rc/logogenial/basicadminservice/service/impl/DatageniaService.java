package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Datagenia;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.IDatageniaRepository;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@Service
public class DatageniaService extends BaseService<Datagenia> implements IGenericService<Datagenia> {
    @Autowired
    private IDatageniaRepository repository;

    @Override
    public Datagenia create(Datagenia datagenia) {
        return repository.save(datagenia);
    }

    @Override
    public void delete(Datagenia datagenia) throws ResourceNotFoundException {
        if (repository.findById(datagenia.getId()).isPresent()) {
            repository.delete(datagenia);
        }
        throw new ResourceNotFoundException("datagenia", "id", Integer.toString(datagenia.getId()));
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("datagenia", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Datagenia> findAll() {
        return repository.findAll();
    }

    @Override
    public Datagenia findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        } else {
            throw new ResourceNotFoundException("datagenia", "id", Integer.toString(id));
        }
    }

    @Override
    public Datagenia update(Datagenia datagenia) throws ResourceNotFoundException {
        if (repository.findById(datagenia.getId()).isPresent()) {
            return repository.save(datagenia);
        }
        throw new ResourceNotFoundException("datagenia", "id", Integer.toString(datagenia.getId()));
    }

//    public Datagenia upload(MultipartFile archivo, int id) throws IOException {
//        if(!archivo.isEmpty()){
//            Optional<Datagenia> datagenia = repository.findById(id);
//            if(!datagenia.isPresent()) {
//                throw new ResourceNotFoundException("datagenia", "id", Integer.toString(datagenia.getId()));
//            }
//            String nombreArchivo = archivo.getName() + java.time.LocalDate.now();
//            Path rutaArchivo = Paths.get("C:\\dev\\upload-logogenial").resolve(nombreArchivo);
//            Files.copy(archivo.getInputStream(),rutaArchivo );
//            datagenia.get().setFile(nombreArchivo);
//            return datagenia.get();
//        }
//        throw new IOException("No fue posible registrar el archivo a la estructura datagenial");
//    }

    @Override
    public ResultSearchData<Datagenia> findAllSearch(int page, int size, String sortBy, String sortOrder) {
        Pageable paging = PageRequest.of(page, size, sortOrder.equals("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending());
        Page<Datagenia> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Datagenia>) this.getResultSearch(pagedResult);
    }

}
