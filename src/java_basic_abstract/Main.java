package java_basic_abstract;

public class Main extends Player {

	public static void main(String[] args) {
		Main main = new Main();
		main.play("love someone");
	}

	@Override
	void play(String songName) {

		System.out.println(songName + "곡을 재생합니다.");
	}

	@Override
	void pause() {
		System.out.println("pause");
	}

	@Override
	void stop() {
		System.out.println("stop");
	}

}
