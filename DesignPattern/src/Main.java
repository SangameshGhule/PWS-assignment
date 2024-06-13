public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        SingletonDesignPatternLazy singletonDesignPatternLazy = SingletonDesignPatternLazy.getInstance();
//        SingletonDesignPatternLazy singletonDesignPatternLazy1 = SingletonDesignPatternLazy.getInstance();
//
//        System.out.println(singletonDesignPatternLazy.hashCode());
//        System.out.println(singletonDesignPatternLazy1.hashCode());

        System.out.println(SingletonDesignPatternEager.getInstance().hashCode());
        System.out.println(SingletonDesignPatternEager.getInstance().hashCode());
    }
}