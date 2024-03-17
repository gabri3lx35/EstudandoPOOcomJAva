package aulas;

import src.classes.Aluno;
import src.classes.Funcionario;
import src.classes.Pessoa;
import src.classes.Professor;

public class Aula06 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("maria",17,"f","");
        Professor prof = new Professor("Alessandro",59,"m");
        Funcionario funcionario = new Funcionario("Jão",32,"m");
        aluno.status();
        prof.status();
        funcionario.status();
    }
}
