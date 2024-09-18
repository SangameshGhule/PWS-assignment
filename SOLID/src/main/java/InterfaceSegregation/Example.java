package InterfaceSegregation;

public class Example {


//   Clients should not be forced to depend on interfaces they do not use. Instead of one fat interface, many small interfaces are preferred.


    // Before ISP
    public interface Worker {
        void work();
        void eat();
    }

    public class HumanWorker implements Worker {
        @Override
        public void work() {
            // working logic
        }

        @Override
        public void eat() {
            // eating logic
        }
    }

    public class RobotWorker implements Worker {
        @Override
        public void work() {
            // working logic
        }

        @Override
        public void eat() {
            // robots don't eat, but still have to implement this method
        }
    }




//    // After ISP
    public interface Workable {
        void work();
    }

    public interface Eatable {
        void eat();
    }

    public class HumanWorkerr implements Workable, Eatable {
        @Override
        public void work() {
            // working logic
        }

        @Override
        public void eat() {
            // eating logic
        }
    }

    public class RobotWorkerr implements Workable {
        @Override
        public void work() {
            // working logic
        }
    }




















}
