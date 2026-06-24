
package banco;
import modelo.Aluno;
import java.util.ArrayList;

public class BancoSimulado {
public static ArrayList<Aluno> alunos = new ArrayList<>();
public static int idAluno = 1;

static {

    alunos.add(new Aluno(
            idAluno++,
            "João Silva",
            "3A",
            "joao.silva@email.com"
    ));

    alunos.add(new Aluno(
            idAluno++,
            "Eduardo Souza",
            "2B",
            "eduardo.souza@email.com"
    ));

    alunos.add(new Aluno(
            idAluno++,
            "Pedro Junior",
            "1C",
            "pedro.junior@email.com"
    ));

    alunos.add(new Aluno(
            idAluno++,
            "Leomar Santos",
            "3B",
            "leomar.santos@email.com"
    ));

    alunos.add(new Aluno(
            idAluno++,
            "Alice Moura",
            "2A",
            "alice.moura@email.com"
    ));



}

}
