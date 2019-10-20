package fr.shaiwen.javafxplus.component;

import fr.shaiwen.javafxplus.event.JavaFXPlusEvent;
import fr.shaiwen.javafxplus.event.JavaFXPlusEventListener;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;

public class CustomButton extends Button {
	
	private JavaFXPlusEventListener listener;

	public CustomButton(Image texture) {
		super();
		this.setGraphic(new ImageView(texture));
		this.setOnAction((ActionEvent e) -> {
			this.listener.onEvent(new JavaFXPlusEvent(this));
		});
	}
	
	public CustomButton(Image texture,Image textureClicked) {
		super();
		this.setGraphic(new ImageView(texture));
		this.setOnAction((ActionEvent e) -> {
			this.listener.onEvent(new JavaFXPlusEvent(this));
			this.setGraphic(new ImageView(textureClicked));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setGraphic(new ImageView(texture));
		});
	}
	
	public CustomButton(Image texture,Image textureClicked,Image hover) {
		super();
		this.setGraphic(new ImageView(texture));
		this.setOnAction((ActionEvent e) -> {
			this.listener.onEvent(new JavaFXPlusEvent(this));
			this.setGraphic(new ImageView(textureClicked));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setGraphic(new ImageView(texture));
		});
		this.setOnDragEntered((DragEvent e) -> {
			this.setGraphic(new ImageView(hover));
		});
		
		this.setOnDragExited((DragEvent e) -> {
			this.setGraphic(new ImageView(texture));
		});
		
	}
	

	public void setListener(JavaFXPlusEventListener listener) {
		this.listener = listener;
	}

	
	
	
	
	
	

}
