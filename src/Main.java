public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void task1(){
        System.out.println("Задача 1");
        String firsName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firsName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
    }
    //Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
    // полностью написанные заглавными буквами (верхним регистром).
    //
    //Напишите программу, которая изменит написание Ф. И. О. сотрудника
    // с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
    //
    //В качестве строки с исходными данными используйте строку fullName.
    //
    //Результат программы выведите в консоль в формате: "Данные ФИО сотрудника
    // для заполнения отчета — …"

    public static void task2() {
        System.out.println("Задача 2");
        String firsName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firsName + " " + middleName;
        System.out.println(fullName.toUpperCase());
    }
}