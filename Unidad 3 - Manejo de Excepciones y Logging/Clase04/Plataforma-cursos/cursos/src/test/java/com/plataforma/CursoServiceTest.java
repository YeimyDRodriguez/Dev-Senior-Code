package com.plataforma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.plataforma.excepcion.CursoLlenoException;
import com.plataforma.model.Curso;
import com.plataforma.service.CursoService;

public class CursoServiceTest {
    private CursoService cursoService;

    @BeforeEach
    void setUp(){
        cursoService = new CursoService();
    }

    @Test
    void agregarCursoCorrectamente(){
        Curso curso = new Curso("Java Básico", "CURSO001", 30);
        Curso curso2 = new Curso("Java Intermedio", "CURSO002", 30);
        cursoService.addCurso(curso);
        cursoService.addCurso(curso2);

        assertEquals(2, cursoService.listarCursos().size());
        assertEquals("Java Básico", cursoService.listarCursos().get(0).getNombre());
        assertEquals("Java Intermedio", cursoService.listarCursos().get(1).getNombre());
    }

    @Test
    void listarCursosVacio(){
        assertEquals(0, cursoService.listarCursos().size());
    }

    @Test
    void buscarCursoPorCodigo() throws CursoLlenoException {
        Curso curso = new Curso("Java Básico", "CURSO001", 30);
        Curso curso2 = new Curso("Java Intermedio", "CURSO002", 30);
        Curso curso3 = new Curso("Java Avanzado", "CURSO003", 30);
        cursoService.addCurso(curso);

        Curso encontrado = cursoService.buscarCursoPorCodigo("CURSO001");
        assertEquals("Java Básico", encontrado.getNombre());
    }

    @Test
    void buscarCursoPorCodigoNoExistente(){
        assertThrows(CursoLlenoException.class, () -> {
            cursoService.buscarCursoPorCodigo("NO_Existe");
        });
    }
}