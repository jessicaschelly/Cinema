package controladores;

import entidades.Sessao;
import entidades.Filme;
import entidades.Funcionario;
import entidades.Gerente;
import entidades.Sala;
import entidades.Ingresso;
import enums.Exibicao;
import enums.Linguagem;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorEntidades extends Controlador {

    public final ArrayList<Funcionario> funcionarios = new ArrayList<>();
      public final ArrayList<Gerente> gerentes = new ArrayList<>();
    public final ArrayList<Sala> salas = new ArrayList<>();
    public final ArrayList<Ingresso> ingressos = new ArrayList<>();

    private static ControladorEntidades instance;

    public static ControladorEntidades getInstance() {
        if (instance == null) {
            instance = new ControladorEntidades();
        }
        return instance;
    }

    public ControladorEntidades() {
        
        /* Adicionar as salas */
        salas.add(new Sala("Sala 1"));
        salas.add(new Sala("Sala 2"));
        salas.add(new Sala("Sala 3"));
        /* Adicionar os funcionários*/
        funcionarios.add(new Funcionario("Henrique", "123"));
        funcionarios.add(new Funcionario("Jéssica", "321"));
        funcionarios.add(new Funcionario("Alfredo", "111"));
        /* Adicionar os gerentes*/
        gerentes.add(new Gerente("Fabiane", "1234"));
        
        try {

            Filme filme1 = ControladorFilme.getInstance().cadastra("It: A coisa", "02:15", "Terror", "Um grupo de sete adolescentes de Derry, uma cidade no Maine, formam o auto-intitulado Losers Club - o clube dos perdedores. A pacata rotina da cidade é abalada quando crianças começam a desaparecer e tudo o que pode ser encontrado delas são partes de seus corpos. Logo, os integrantes do \"Losers Club\" acabam ficando face a face com o responsável pelos crimes: o palhaço Pennywise.", 
                    Linguagem.LEGENDADO, Exibicao.TRESDIMENSOES, "16","resources/it-cartaz.jpg");
            
            Filme filme2 = ControladorFilme.getInstance().cadastra("Jogador Nº 1", "01:00", "Aventura","Em 2044, Wade Watts, assim como o resto da humanidade, prefere a realidade virtual do jogo OASIS ao mundo real. Quando o criador do jogo, o excêntrico James Halliday morre, os jogadores devem descobrir a chave de um quebra-cabeça diabólico para conquistar sua fortuna inestimável. Para vencer, porém, Watts tem de abandonar a existência virtual e ceder a uma vida de amor e realidade da qual sempre tentou fugir.", 
                    Linguagem.LEGENDADO, Exibicao.DUASDIMENSOES, "12","resources/readyplayerone.jpg");
            Filme filme3 = ControladorFilme.getInstance().cadastra("Venom", "01:52", "Ação","Um dos maiores e mais complexos personagens da Marvel se torna o centro das atenções quando Eddie Brock (Tom Hardy) se torna o hospedeiro do simbiótico alienígena Venom. Como jornalista, Eddie vem tentando derrubar o notório fundador da Life Foundation, o gênio Carlton Drake (Riz Ahmed) – e essa obsessão arruinou sua carreira e o relacionamento com sua namorada, Anne Weying (Michelle Williams). Ao investigar um dos experimentos de Drake, o alienígena Venom se funde com o corpo de Eddie, e de repente ele tem superpoderes incríveis, assim como a chance de fazer o que ele quiser. Sombrio, distorcido, imprevisível e alimentado pela raiva, Venom deixa Eddie lutando para controlar habilidades perigosas que ele também acha poderosas e inebriantes. Uma vez que Eddie e Venom precisam um do outro para conseguir o que procuram, eles se tornam cada vez mais interligados – onde Eddie acaba e Venom começa?", 
                    Linguagem.LEGENDADO, Exibicao.DUASDIMENSOES, "10","resources/venom.jpg");
            
            Filme filme4 = ControladorFilme.getInstance().cadastra("Clube da Luta", "02:29", "Drama", "Um homem deprimido que sofre de insônia conhece um estranho vendedor chamado Tyler Durden e se vê morando em uma casa suja depois que seu perfeito apartamento é destruído. A dupla forma um clube com regras rígidas onde homens lutam. A parceria perfeita é comprometida quando uma mulher, Marla, atrai a atenção de Tyler.",
                    Linguagem.LEGENDADO, Exibicao.DUASDIMENSOES, "16", "resources/clubedaluta.jpg");
            
            ControladorSessao.getInstance().cadastra(salas.get(0), "20:00", filme1);
            ControladorSessao.getInstance().cadastra(salas.get(1), "21:00", filme2);
            ControladorSessao.getInstance().cadastra(salas.get(1), "22:30", filme3);
            
         
        } catch (Exception ex) {
            Logger.getLogger(ControladorEntidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Funcionario getFuncionarioById(String id) {
        return funcionarios.stream()
                .filter(func -> func.getID().equals(id))
                .findFirst().orElse(null);
    }
    
    public Gerente getGerenteoById(String id) {
        return gerentes.stream()
                .filter(func -> func.getID().equals(id))
                .findFirst().orElse(null);
    }

    public Ingresso geraIngresso(Sessao sessao, boolean inteira) {
        int id = 0;
        if (ingressos.size() > 0) {
            id = ingressos.get(ingressos.size() - 1).ID + 1;
        }

        int valor = 20;
        if (inteira) {
            valor = 40;
        }

        Ingresso ing = new Ingresso(id, sessao, valor);
        ingressos.add(ing);
        return ing;
    }

    public int totalVendas() {
        int soma = 0;
        for (Ingresso ing : ingressos) {
            soma += ing.valor;
        }

        return soma;
    }

}
