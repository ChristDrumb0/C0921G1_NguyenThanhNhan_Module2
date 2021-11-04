package ss4_class_object.bai_tap.lop_stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.getStartTime();
        stopWatch.start();
        long arr[] = new long[100000];
        long arr2[] = new long[100000];
        for (int i = 0; i<100001;i++) {

            stopWatch.stop();
            stopWatch.getEndTime();
            System.out.println(stopWatch.getElapsedTime());

        }
    }

}
