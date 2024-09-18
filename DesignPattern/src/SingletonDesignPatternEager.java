public class SingletonDesignPatternEager {

    private static final SingletonDesignPatternEager singletonDesignPatternEager = new SingletonDesignPatternEager();

    private SingletonDesignPatternEager() {

    }

    public static SingletonDesignPatternEager getInstance() {
        return singletonDesignPatternEager;
    }
}
