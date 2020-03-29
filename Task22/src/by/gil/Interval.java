package by.gil;

public class Interval implements Comparable <Interval> {

    private Integer seconds;

    public Interval (Integer hours, Integer minutes, Integer seconds ){

        Integer minutes1 = hours * 60 + minutes;
        this.seconds = minutes1 *60 + seconds;
        System.out.println(this.seconds + " секунд в данном инвервале");

    }
    public Interval ( Integer seconds ){

        this.seconds = seconds;
        System.out.println(this.seconds + " секунд в данном инвервале");

    }

    @Override
    public int compareTo(Interval o) {
        int result = this.seconds.compareTo(o.seconds);
        return result;
    }
}
