
class Music {
    public void play(){
        System.out.println("Play Music");
    }
    public void stop(){
        System.out.println("Stop Music");
    }
    public void change(){
        System.out.println("Change Music");
    }
}
class Sony extends Music{
    @Override
    public void play() {}
}
class Panasonic extends Music{

}
public class MusicCompaniesOverridePlayMethodExampleOfInheritance {
    public static void main(String[] args) {
        Sony sobj = new Sony();
        Panasonic pobj = new Panasonic();
        sobj.play(); // it removed play() function by override
        pobj.play(); // it has play() function
    }
}
