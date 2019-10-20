package fr.shaiwen.javafxplus.event;

import javafx.scene.Node;

public class JavaFXPlusEvent {

	
	private Node component;

	public Node getComponent() {
		return component;
	}

	public JavaFXPlusEvent(Node component) {
		super();
		this.component = component;
	}
	
	
}
