package designpattern.templete;

public abstract class Milk {
    public final void make() {
        select();
        if(judge()) {
            add();
            soak();
            beat();
        }
    }
    public void select() {
        System.out.println("获取原料");
    }
    public abstract void add();
    public void soak() {
        System.out.println("浸泡");
    }
    public void beat() {
        System.out.println("搅拌");
    }

    public boolean judge() {
        return true;
    }
}
