// package com.example.escola.service.defasado;

// import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;

// import com.example.escola.models.defasado.Matricula;
// import com.example.escola.repository.defasado.MatriculaRepository;

// @Service
// public class MatriculaService {
//     final private MatriculaRepository matriculaRepository;

//     public MatriculaService(MatriculaRepository matriculaRepository) {
//         this.matriculaRepository = matriculaRepository;
//     }

//     public Matricula save(Matricula matricula) {
//         return matriculaRepository.save(matricula);
//     }

//     public List<Matricula> findAll() {
//         return matriculaRepository.findAll();
//     }

//     public Optional<Matricula> findById(Long id) {
//         return matriculaRepository.findById(id);
//     }

//     public void delete(Long id) {
//         matriculaRepository.deleteById(id);
//     }
// }
