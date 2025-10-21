public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Playlist newPlay = new Playlist();

        System.out.println("--- Lista antes de borrar cancion ---");
        newPlay.addSong("Yesterday", 150);
        newPlay.addSong("Imagine", 180);
        newPlay.addSong("Cancion de prueba a eliminar", 87);
        newPlay.printPlaylist();
        newPlay.getTotalDuration();

        System.out.println("--- Lista despues de borrar xd ---");
        newPlay.removeSong("Cancion de prueba a eliminar");
        newPlay.printPlaylist();
        newPlay.getTotalDuration();
    }
}
