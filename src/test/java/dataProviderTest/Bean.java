package dataProviderTest;

/**
 * Created by April_Chou on 2017/5/20.
 */
public class Bean {
    private String val;
    private int i;
    public Bean(String val, int i){
        this.val = val;
        this.i = i;
    }

    public String getVal(){
        return val;
    }

    public int getI(){
        return i;
    }

    public void setVal(int i){
        this.i = i;
    }
}
