package com.automotor.taller.servicios;

import com.automotor.taller.repositorio.BajaOrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BajaOrdenService {
    @Autowired
    private BajaOrdenRepo bajaOrdenRepo;
}
