public class DataModel {
    private String data;

    public DataModel(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void appendData(String moreData) {
        this.data = this.data + " | " + moreData;
    }

    public void clearData() {
        this.data = "";
    }

    public boolean hasData() {
        return !this.data.isEmpty();
    }

    public void prependData(String newData) {
        this.data = newData + " | " + this.data;
    }
}
