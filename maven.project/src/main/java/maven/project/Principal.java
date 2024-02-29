package maven.project;
import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {

	        DAO dao = new DAO();
	        dao.conectar();

	        Scanner scanner = new Scanner(System.in);

	        int opcao;
	        do {
	            System.out.println("==== Menu ====");
	            System.out.println("1 - Listar usuários");
	            System.out.println("2 - Inserir usuário");
	            System.out.println("3 - Atualizar usuário");
	            System.out.println("4 - Excluir usuário");
	            System.out.println("5 - Sair");
	            System.out.print("Escolha uma opção: ");

	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    // Listar usuários
	                    System.out.println("==== Listar usuários ====");
	                    Usuario[] usuarios = dao.getUsuarios();
	                    for (int i = 0; i < usuarios.length; i++) {
	                        System.out.println(usuarios[i].toString());
	                    }
	                    break;
	                case 2:
	                    // Inserir usuário
	                    System.out.println("==== Inserir usuário ====");
	                    // Take input for new user details
	                    // e.g., int codigo, String login, String senha, char sexo
	                    // Create a new Usuario object with the input
	                    // Call dao.inserirUsuario(usuario) to insert the user
	                    break;
	                case 3:
	                    // Atualizar usuário
	                    System.out.println("==== Atualizar usuário ====");
	                    // Take input for user code and new details
	                    // e.g., int codigo, String login, String senha, char sexo
	                    // Create a new Usuario object with the input
	                    // Call dao.atualizarUsuario(usuario) to update the user
	                    break;
	                case 4:
	                    // Excluir usuário
	                    System.out.println("==== Excluir usuário ====");
	                    // Take input for user code
	                    // Call dao.excluirUsuario(codigo) to delete the user
	                    break;
	                case 5:
	                    // Sair
	                    System.out.println("Saindo do programa.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }

	        } while (opcao != 5);

	        dao.close();
	        scanner.close();
	    }
	}