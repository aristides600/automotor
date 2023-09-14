package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Turno;
import com.automotor.taller.repositorio.TurnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {
    @Autowired
    private TurnoRepo turnoRepo;
    public List<Turno> listarTurnos(){
        return turnoRepo.findAll();
    }
    //crear Servicio
    public Turno crearTurno(Turno turno){
        return turnoRepo.save(turno);
    }
    //modificar Servicio manda por ID
    public Turno modificarTurno(Turno turno){
        return turnoRepo.save(turno);
    }
    //eliminar Servicio
    public void eliminarTurno(Long id){
        turnoRepo.deleteById(id);
    }
}
