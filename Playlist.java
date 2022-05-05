import java.util.Random;

public class Playlist {

    public static void main(String[] args) {

        List<String> playList = new ArrayList<String>();

        playList.add("Song1");

        playList.add("Song2");

        playList.add("Song3");

        playList.add("Song4");

        playList.add("Song5");

        playList.add("Song6");

        playList.add("Song7");

        playList.add("Song8");

        playList.add("Song9");

        playList.add("Song10");

        playList.add("Song11");

        playList.add("Song12");

        playList.add("Song13");

        playList.add("Song14");

  

        // shuffle the playlist

        for (int i=0; i<playList.size(); ++i) {

            Random rand = new Random();

            int temp = rand.nextInt(playList.size() -i) + i;

            Collections.swap(playList, i, temp);

        }

        // print the shuffled playlist

        for(int j = 0; j < playList.size(); ++j) {

            System.out.println(playList.get(j));

        }

    }

}
