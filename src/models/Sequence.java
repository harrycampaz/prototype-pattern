package models;

public class Sequence implements Cloneable {
    private String id;
    protected  long result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getResult() {
        return result;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return  clone;
    }
}
