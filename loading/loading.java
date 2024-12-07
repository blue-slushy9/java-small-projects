public class Main {

    public static void main(String[] args) {
        // Create a Loading object with the same name
        Loading loading = new Loading();
        // Call the class method
        loading.loadingMessage();
    }
}

class Loading {

    // Define LoadingMessage() method
    private void loadingMessage() {
        System.out.println("Loading...");
    }
}