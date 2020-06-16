package homeWork1.DayOfWeek;
                                        // Задание 5
public enum DayOfWeek {
    Понедельник(8), Вторник(8), Среда(8), Четверг(8),
    Пятница(8), Суббота, Воскресенье;

    int hoursToWork;
    static int workingHoursLeft = Понедельник.hoursToWork + Вторник.hoursToWork + Среда.hoursToWork +
            Четверг.hoursToWork + Пятница.hoursToWork;

    DayOfWeek() {
    }

    DayOfWeek(int hoursToWork) {
        this.hoursToWork = hoursToWork;
    }
}


