package com.theboxbrigade.quantumchaos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * The Assets class is where all paths for sounds and textures belong.
 * When you add an asset data field, be sure to add the corresponding path in load()
 * 
 * @author Jason
 */
public class Assets {
	public static TextureRegion logo;
	
	public static void load() {
		logo = load("data/images/logo.png", 1024, 768);
	}
	
	public static TextureRegion load(String name, int width, int height) {
		Texture texture = new Texture(Gdx.files.internal(name));
		TextureRegion region = new TextureRegion(texture, 0, 0, width, height);
		region.flip(false, true);
		return region;
	}
}
