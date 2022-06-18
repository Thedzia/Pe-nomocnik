public class FolderProxy implements Folder1 {
    private Folder2 folder2;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    public void performOperations() {
        if (user.getUserName().equalsIgnoreCase("Facebookcom") && user.getPassword().equalsIgnoreCase("password")) {
            folder2 = new Folder2();
            folder2.performOperations();

        } else {
            System.out.println("Nie masz dostępu do tgo folderu");
        }
    }
}