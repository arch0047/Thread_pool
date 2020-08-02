package HomePackage;

class Processor implements Runnable {

    private int id;
    // constructor
    public Processor(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Starting: " + id);
        try {
            Thread.sleep(5000); // 5 second
        } catch (InterruptedException ignored)
        {

        }
        System.out.println("Completed: " + id);
    }
}



// https://www.youtube.com/watch?v=XjMCgirgWeA