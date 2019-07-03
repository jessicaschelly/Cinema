/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Funcionario;
import exceptions.CadastroRepetidoException;
import exceptions.CampoVazioException;
import exceptions.EntidadeNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jesk
 */
public class ControladorFuncionario extends Controlador {

    public final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ControladorFuncionario instance;

    public static ControladorFuncionario getInstance() {
        if (instance == null) {
            instance = new ControladorFuncionario();
        }
        return instance;
    }

    public Funcionario cadastra(String nome, String ID) throws CampoVazioException, EntidadeNotFoundException, CadastroRepetidoException {
        verificaCampoVazio(nome, "Nome");
        verificaCampoVazio(ID, "Duração");

        if (getFuncionarioByID(ID) != null) {
            throw new CadastroRepetidoException("Erro: Funcionario com id: '" + ID + "' já cadastrado.");
        }

        Funcionario funcionario = new Funcionario(nome, ID);
        funcionarios.add(funcionario);
        return funcionario;

    }
    
    public Funcionario editar(String nome, String ID, Funcionario funcionarioAntigo) throws CampoVazioException, EntidadeNotFoundException, CadastroRepetidoException{
         verificaCampoVazio(nome, "Nome");
        verificaCampoVazio(ID, "Duração");

        if (getFuncionarioByID(ID) != null && !ID.equals(funcionarioAntigo.getID())) {
            throw new CadastroRepetidoException("Erro: Funcionario com id: '" + ID + "' já cadastrado.");
        }
        
        funcionarioAntigo.setID(ID);
        funcionarioAntigo.setNome(nome);
        
        return funcionarioAntigo;
    }
    
    

    public Funcionario getFuncionarioByID(String ID) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getID().equals(ID))
                .findFirst().orElse(null);
    }

    public String[] nomeIDFuncionarios() {
        List<String> names = funcionarios.stream().map(x -> x.getNome() + " - " + x.getID()).collect(Collectors.toList());
        return names.toArray(new String[0]);
    }

    public void remove(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
}
