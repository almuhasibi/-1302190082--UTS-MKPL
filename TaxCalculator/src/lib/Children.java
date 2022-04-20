package lib;

public class Children {
    private String childName;
    private String TotalChildrens;

    public Children(String childName, String TotalChildrens) {
        this.childName = childName;
        this.TotalChildrens = TotalChildrens;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getTotalChildrens() {
        return TotalChildrens;
    }

    public void setTotalChildrens(String TotalChildrens) {
        this.TotalChildrens = TotalChildrens;
    }
}