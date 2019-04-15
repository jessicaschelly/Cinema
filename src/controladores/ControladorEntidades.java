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
        /* Adicionar os funcionários*/
        funcionarios.add(new Funcionario("Cristina", "123"));
        funcionarios.add(new Funcionario("Jéssica", "321"));
        funcionarios.add(new Funcionario("Alfredo", "111"));
        /* Adicionar os gerentes*/
        gerentes.add(new Gerente("Amanda", "123"));
        
        try {

            Filme filme1 = ControladorFilme.getInstance().cadastra("Homem-Aranha: No aranhaverso", "01:57", "Animação", "O jovem Miles Morales se torna o Homem-Aranha de sua realidade, cruzando seu caminho com cinco colegas de outras dimensões para impedir uma ameaça a todas as realidades. ", 
                    Linguagem.LEGENDADO, Exibicao.TRESDIMENSOES, "18","resources/homemaranha.jpg");
            Filme filme2 = ControladorFilme.getInstance().cadastra("Jogador Nº 1", "01:00", "Aventura","Quando o criador de um mundo de realidade virtual chamado OASIS morre, ele lança um vídeo no qual ele desafia todos os usuários do OASIS a encontrar seu Easter Egg, que dará ao descobridor sua fortuna.", 
                    Linguagem.LEGENDADO, Exibicao.DUASDIMENSOES, "12","resources/readyplayerone.jpg");
            Filme filme3 = ControladorFilme.getInstance().cadastra("Venom", "01:52", "Ação","Um repórter falido é ligado a uma entidade alienígena, um dos muitos simbiontes que invadiram a Terra. Mas o ser tem um gosto para a Terra e decide protegê-lo.", 
                    Linguagem.LEGENDADO, Exibicao.DUASDIMENSOES, "10","resources/venom.jpg");
            
            ControladorSessao.getInstance().cadastra(salas.get(0), "20:00", filme1);
            ControladorSessao.getInstance().cadastra(salas.get(1), "21:00", filme2);
            ControladorSessao.getInstance().cadastra(salas.get(0), "22:30", filme1);
         
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
