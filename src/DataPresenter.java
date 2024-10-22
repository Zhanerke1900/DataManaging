public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void updateData() {
        view.displayData(model.getData());
        String newData = view.getInput("Enter new data: ");
        model.setData(newData);
        view.showUpdatedData(model.getData());
    }

    public void appendData() {
        String moreData = view.getInput("Enter another piece of data: ");
        model.appendData(moreData);
        view.showFinalData(model.getData());
    }
}
