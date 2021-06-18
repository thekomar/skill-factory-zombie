package sf.task;

public class Money {
    /**
    * Количество монет от [0 до n]
    * */
    private int count;
    /**
     * Номинал монет  1,2,5,10,50,100,200
     * */
    private int rating;

    public Money(int count, int rating) {
        this.count = count;
        this.rating = rating;
    }
    public int getCount() {
        return count;
    }

    public int getRating() {
        return rating;
    }
}
