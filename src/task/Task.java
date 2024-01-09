package task;

import task.controller.TaskController;

import java.util.Scanner;

public class Task {

    static Scanner scanner;

    public static void main(String[] args) {
        System.out.print("\n\uD83D\uDC9B Обери який обхід ти хочешь отримати: \n");
        int menu;
        do {
            menu = getMenu();
            runMenu(menu);
        } while (menu != 1 && menu != 2 && menu != 3 && menu != 4);
    }

    private static int getMenu(){
        System.out.print("""
                1\uFE0F\u20E3   Обхід неупорядкований
                2\uFE0F\u20E3   Обхід передупорядкований
                3\uFE0F\u20E3   Обхід поступорядкований
                
                4\uFE0F\u20E3   Усі обходи одразу
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void runMenu(int menu) {
        TaskController controller = new TaskController();
            switch (menu) {
                case 1 -> controller.getInorder();
                case 2 -> controller.getPreorder();
                case 3 -> controller.getPostorder();
                case 4 -> controller.getAll();
                default -> System.out.println("\n\u274C   Спробуй ще:");
            }
    }
}
