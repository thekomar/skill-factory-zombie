package sf.task;

public class GreenBank implements CountingMachine {
    @Override
    public int result(Money[] monies) {
        int result = 0;//Хранит в себе сумму монет
        System.out.println("GREEN BANK начал считать монеты");
        /**
         * Пробегаемся по всему нашему массиву(Монетам)
         * */
        for (int i = 0; i < monies.length; i++) {
            Money currentMoney = monies[i]; //Текущей элемент массива-Монет
            int rating = currentMoney.getRating(); //номинал текущей монеты
            int count = currentMoney.getCount(); //Кол во текущей монеты

            int score = rating * count; //Всего денег для данного номинала
            result = result + score; //каждый раз когда пробегаемся по массиву , переменная увеличивает значение
        }
        return result;
    }
}
