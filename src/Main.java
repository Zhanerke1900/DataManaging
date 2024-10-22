public class Main {
    public static void main(String[] args) {
        DataModel model = new DataModel("Initial Data");
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        presenter.updateData();
        presenter.appendData();
    }
}
