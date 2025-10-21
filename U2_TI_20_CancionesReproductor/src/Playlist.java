class Playlist {
    private Node head;

    public void addSong(String name, int duration) {
        Node newSong = new Node(name, duration);
        if (head == null) {
            head = newSong;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void removeSong(String name) {
        if (head == null) return;

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void printPlaylist() {
        System.out.println("Lista actual:");
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.name + " (" + current.duration + " s)");
            current = current.next;
            index++;
        }
        System.out.println("Duración total: " + getTotalDuration() + " s");
    }

    public int getTotalDuration() {
        int total = 0;
        Node current = head;
        while (current != null) {
            total += current.duration;
            current = current.next;
        }
        return total;
    }
}
