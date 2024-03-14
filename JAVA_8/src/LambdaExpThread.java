public class LambdaExpThread {

  public void gamesDisplay(String game) throws InterruptedException {
      System.out.println(game+" "+"game started..");
      Thread.sleep(3000);
      System.out.println(game+" "+"game ended..");
  }

    public void trackDisplay(String track) throws InterruptedException {
        System.out.println(track+" "+"track started..");
        Thread.sleep(4000);
        System.out.println(track+" "+"track ended..");
    }

}
