package com.automotor.taller.servicios;

import com.automotor.taller.repositorio.OrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepo ordenRepo;

}
