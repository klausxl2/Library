import entities.Book;
import entities.Library;
import entities.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int op;

        try {
            do {
                System.out.println("\nSistema de Gerenciamento de Biblioteca");
                System.out.println("1. Adicionar Livro a biblioteca");
                System.out.println("2. Listar Livros da biblioteca");
                System.out.println("3. Adicionar Usuário");
                System.out.println("4. Listar Usuários");
                System.out.println("5. Emprestar Livro");
                System.out.println("6. Devolver Livro");
                System.out.println("7. Sair");
                System.out.print("Escolha uma opção: ");
                 op = sc.nextInt();
                 sc.nextLine();


                switch (op){
                    case 1:
                        System.out.println("Digite o nome do livro:");
                        String name = sc.nextLine();
                        System.out.println("Digite o nome do autor:");
                        String autor = sc.nextLine();
                        System.out.println("Digite a descrição do livro: ");
                        String description = sc.nextLine();
                        lib.addBook(new Book(name,autor,description,new Random().nextLong()));
                        break;
                    case 2:
                        lib.listBooks();
                        break;
                    case 3:
                        System.out.println("Nome do usuário: ");
                        String nameUser = sc.nextLine();
                        System.out.println("Digite a data de nascimento no formato: dd/MM/yyyy");
                        String datebirth = sc.nextLine();

                        Date birthDate = sdf.parse(datebirth);

                        lib.addUser(new User(nameUser,birthDate,new Random().nextLong()));
                        break;
                    case 4:
                    lib.listUsers();
                    break;

                    default:
                        break;

                }

            } while (op != 7);


        }

        catch (InputMismatchException e){
             e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }


    }
