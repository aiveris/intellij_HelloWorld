public class MeasuringCodeSpeedBenchmarking {
    public static void main(String[] args)
            throws InterruptedException {

        int timeToSleep = 1000;

        // mark the time the code you are interested in STARTED
        long initialTime = System.currentTimeMillis();

        // run the function you are interested in
        rundomFuntion(timeToSleep);

        // mark the time the code you are interested in STOPPED
        long finalTime = System.currentTimeMillis();

        // Calculate and print the time it took
        System.out.println("It took " + (finalTime - initialTime) + "ms for the function to run");
    }

    public static void rundomFuntion(int sleeptimeMs)
            throws InterruptedException {
        Thread.sleep(sleeptimeMs);
    }
}