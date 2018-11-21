public enum Day {
    MONDAY(1,"ITS BAD DAY"),TUESDAY(2,"its worst day"),WEDNESDAY(3,"its soso day"),
    THURSDAY(4,"its ok ok"), FRIDAY(5,"yahooo"),SATURDAY(6,"its weekend time"),SUNDAY(7,"sleepy day");

    int i;
    String j;
    Day(int i, String j){
        this.i = i;
        this.j = j;

    }
    public int geti(){
        return i;
    }
    public  String getj(){
        return j;
    }
}
