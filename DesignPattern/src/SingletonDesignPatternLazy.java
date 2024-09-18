public class SingletonDesignPatternLazy {
    private static SingletonDesignPatternLazy singletonDesignPatternLazy;
    private SingletonDesignPatternLazy() {

    }
    public static SingletonDesignPatternLazy getInstance() {
        if (singletonDesignPatternLazy == null) {
            synchronized (SingletonDesignPatternLazy.class) {
                if (singletonDesignPatternLazy == null) {
                    singletonDesignPatternLazy = new SingletonDesignPatternLazy();
                }
            }
        }
        return singletonDesignPatternLazy;
    }

}
