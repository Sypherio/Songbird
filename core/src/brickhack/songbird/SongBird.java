package brickhack.songbird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import brickhack.songbird.models.GameModel;
import brickhack.songbird.util.Notes;

public class SongBird extends ApplicationAdapter {

    private GameModel gameModel;

    private static PitchInterface pitchInterface;

    public SongBird(PitchInterface pitchInterface) {
        this.pitchInterface = pitchInterface;
    }

    public static PitchInterface getPitchEngineInstance() {
        return pitchInterface;
    }

    @Override
	public void create () {
        Notes.initialize();
        this.gameModel = new GameModel();
    }

	@Override
	public void render () {
        Gdx.gl.glClearColor(0.3f, 0.3f, 0.3f, 0.4f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gameModel.update();
	}
}
