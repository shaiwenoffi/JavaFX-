package fr.shaiwen.javafxplus.component;

import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class CustomBar extends ProgressBar{

	public CustomBar(String color,Image font) {
		super();
		this.setStyle("-fx-accent: "+color+";");
		this.setBackground(new Background(new BackgroundImage(font, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
	}

	public void setValue(int value) {
		this.setProgress(value / 100);
	}
	
	
}
