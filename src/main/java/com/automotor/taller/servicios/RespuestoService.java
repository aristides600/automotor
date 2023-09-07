package com.automotor.taller.servicios;

import com.automotor.taller.repositorio.RespuestoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestoService {
    @Autowired
    private RespuestoRepo respuestoRepo;
}
