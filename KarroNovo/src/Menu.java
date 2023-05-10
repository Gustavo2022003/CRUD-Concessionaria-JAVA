import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    public Integer menu(){
        System.out.println("O que deseja fazer?\n1 - Cadastrar novo veículo\n2 - Editar veículo\n3 - Ver informações de um veículo específico\n4 - Excluir um veículo\n5 - Ver todos os veículos\n6 - Sair\n");

        Integer menu_input = scanner.nextInt();

        return menu_input;
    }

    public Integer menu ()
}
