import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso JavaScript");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscritos());
        devCamila.progedir();
        devCamila.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudoInscritos());
        devJoao.progedir();
        devJoao.progedir();
        devJoao.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Joao" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }


}
