import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes
        Caps caps = new Caps(1, "Rua Carlos Alberto de Souza, 552", "70186486456");
        DependenteQuimico usuario1 = new DependenteQuimico();
        usuario1.setTipoVicio("Álcool");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setIdFuncionario(777);
        funcionario1.setEscala("Noturna");
        funcionario1.setIdentificacao("Matricula 202310040032");
        funcionario1.setFuncao("Enfermeiro");

        Medicamento medicamento1 = new Medicamento("Antidepressivo", "31/12/2025");

        Terapia terapia1 = new Terapia();
        terapia1.setIdTerapia(001);
        terapia1.setDescricao("Sessões de Grupo");

        usuario1.setTerapia(terapia1);

        DispositivoDeSeguranca dispositivo1 = new DispositivoDeSeguranca(1, "Câmera", "Ativo");

        ServicoDeLimpeza limpeza1 = new ServicoDeLimpeza(true, false);

        // Lista para armazenamento de objetos
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<UsuarioCAPS> usuarios = new ArrayList<>();
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        ArrayList<DispositivoDeSeguranca> dispositivos = new ArrayList<>();
        ArrayList<ServicoDeLimpeza> servicos = new ArrayList<>();

        // Adicionando os objetos às listas
        funcionarios.add(funcionario1);
        usuarios.add(usuario1);
        medicamentos.add(medicamento1);
        dispositivos.add(dispositivo1);
        servicos.add(limpeza1);

        // Exibição dos dados cadastrados
        System.out.println("CAPS - Unidade: " + caps.getCodUnidade() + ", Endereço: " + caps.getEndereco() + ", CNPJ: " + caps.getCnpj());
        System.out.println("Usuário Dependente Químico - Tipo de vício: " + usuario1.getTipoVicio());
        System.out.println("Funcionário - ID: " + funcionario1.getIdFuncionario() + ", Função: " + funcionario1.getFuncao());
        System.out.println("Medicamento - Bula: " + medicamento1.getBula() + ", Validade: " + medicamento1.getValidade());
        System.out.println("Dispositivo de Segurança - Tipo: " + dispositivo1.getTipo() + ", Status: " + dispositivo1.getStatus());
        System.out.println("Serviço de Limpeza - Com Carrinho? " + limpeza1.getEstacomcarrinho() + ", É Gerente? " + limpeza1.getGerente());
        
        // Removendo dados inseridos
        funcionarios.remove(funcionario1);
        usuarios.remove(usuario1);
        medicamentos.remove(medicamento1);
        dispositivos.remove(dispositivo1);
        servicos.remove(limpeza1);

        // Exibição após remoção
        System.out.println("\nApós remoção:");
        System.out.println("Funcionários cadastrados: " + funcionarios.size());
        System.out.println("Usuários cadastrados: " + usuarios.size());
        System.out.println("Medicamentos cadastrados: " + medicamentos.size());
        System.out.println("Dispositivos de segurança cadastrados: " + dispositivos.size());
        System.out.println("Serviços de limpeza cadastrados: " + servicos.size());
    }
}
