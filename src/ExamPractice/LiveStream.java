package ExamPractice;

public class LiveStream {
    public void startStream() {

        try (LiveStreamConnection streamConnection = new LiveStreamConnection(this)) {
            try {
                streamConnection.openConnection();
            } catch (OpenConnectionException e) {
                System.out.println("Could not start the live stream");
                return; // Exit if connection cannot be opened.
            }
            streamConnection.awaitStreamEnd(); // wait for the stream to end.
        } catch (ConnectionException e) {
            System.out.println("Something went wrong with the connection");
        }
    }
}


