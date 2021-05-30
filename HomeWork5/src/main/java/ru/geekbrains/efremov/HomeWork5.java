package ru.geekbrains.efremov;

public class HomeWork5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee [5];

        persArray[0] = new Employee("Филиппов Артем", "Курьер", "AAtman@mail.ru", "89035543145" , 40000, 25);
        persArray[1] = new Employee("Иванов Степан", "Мерчендайзер", "ISgms@mail.ru","89208524622" ,35000, 21);
        persArray[2] = new Employee("Калтыгин Кирилл", "Арт-директор", "KaltKirill07@mail.ru","89199963452" ,100000, 41);
        persArray[3] = new Employee("Васнецов Михаил", "Водитель", "VSMichCarty@mail.ru","89154467852" ,50000, 45);
        persArray[4] = new Employee("Поклонский Максим", "Менеджер по продажам", "SaleMeSoul@22mail.ru", "89405687724" ,60000, 29);

        for (Employee employee : persArray) {
            if (employee.getAge() > 40) {
                employee.info();
                System.out.println();
            }
        }
    }
}

