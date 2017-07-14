package ru.ncedu.java.tasks;

/**
 * Created by i.ruzhentsev on 14.07.2017.
 */
/**
 * ЦЕЛЬ ЗАДАЧИ - разобраться с основами объектно-ориентированного программирования в Java,
 * принципами написания класса, реализации методов get/set, обращения к полям и методам объектов.
 *
 * ЗАДАНИЕ
 * Реализовать класс, представляющий собой описание сотрудника компании (Employee).
 *
 * ТРЕБОВАНИЯ
 * 1) Экземпляр класса, реализующего данный интерфейс, должен соответствовать одному сотруднику.
 * 2) Необходимо реализовать методы get/set для имени (и фамилии), полного имени, зарплаты сотрудника,
 *  а также его непосредственного менеджера и топового (самого вышестоящего) менеджера.
 * Данные (поля) должны быть объявлены как private-переменные класса.
 * Методы get** / set** должны оперировать с этими полями.
 * 3) По умолчанию (у только что созданного сотрудника) зарплата должна быть равна 1000.
 *
 * ОБЩИЕ ТРЕБОВАНИЯ (ко всем решениям задач для их автоматической проверки)
 * Вот как должна выглядеть реализация данного интерфейса:
 * public class EmployeeImpl implements Employee {  }
 * Если в коде есть конструкторы, то среди них должен быть конструктор без параметров:
 * public EmployeeImpl() {  }
 *
 * ПРИМЕЧАНИЕ
 * Задачу можно решать без явной обработки и генерации исключительных ситуаций (Exceptions).
 *
 * @author Alexander Kharichkin
 * @author Yuriy Popov
 */
public interface Employee {
    /**
     * @return Зарплата сотрудника на настоящий момент.
     */
    int getSalary();

    /**
     * Увеличивает зарплату сотрудника на заданное значение
     * @param value Значение, на которое нужно увеличить
     */
    public void increaseSalary(int value);

    /**
     * @return Имя сотрудника
     */
    public String getFirstName();

    /**
     * Устанавливает имя сотрудника
     * @param firstName Новое имя
     */
    public void setFirstName(String firstName);

    /**
     * @return Фамилия сотрудника
     */
    public String getLastName();

    /**
     * Устанавливает фамилию сотрудника
     * @param lastName Новая фамилия
     */
    public void setLastName(String lastName);

    /**
     * @return Имя и затем фамилия сотрудника, разделенные символом " " (пробел)
     */
    public String getFullName();

    /**
     * Устанавливает Менеджера сотрудника.
     * @param manager Сотрудник, являющийся менеджером данного сотрудника.
     * НЕ следует предполагать, что менеджер является экземпляром класса EmployeeImpl.
     */
    public void setManager(Employee manager);

    /**
     * @return Имя и фамилия Менеджера, разделенные символом " " (пробел).
     * Если Менеджер не задан, возвращает строку "No manager".
     */
    public String getManagerName();

    /**
     * Возвращает Менеджера верхнего уровня, т.е. вершину иерархии сотрудников,
     *   в которую входит данный сотрудник.
     * Если над данным сотрудником нет ни одного менеджера, возвращает данного сотрудника.
     * Замечание: поскольку менеджер, установленный методом {@link #setManager(Employee)},
     *   может быть экзепляром другого класса, при поиске топ-менеджера нельзя обращаться
     *   к полям класса EmployeeImpl. Более того, поскольку в интерфейсе Employee не объявлено
     *   метода getManager(), поиск топ-менеджера невозможно организовать в виде цикла.
     *   Вместо этого нужно использовать рекурсию (и это "более объектно-ориентированно").
     */
    public Employee getTopManager();
}
