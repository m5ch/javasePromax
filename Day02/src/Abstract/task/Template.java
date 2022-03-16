package Abstract.task;

public abstract class Template {
    public final void write(){
        System.out.println("《我的狗狗》");
        System.out.println("我养了一只狗");
        System.out.println(writeMain());
        System.out.println("我的狗狗真棒~~");
    }

    public abstract String writeMain();
}
