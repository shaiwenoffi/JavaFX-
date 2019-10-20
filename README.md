# JavaFX-
This library can shorten something in JavaFX! I was inspired by Swinger for swing which was created by Litarvan



### Pour commencer

il vous suffit de créé un nouvelle Objet (pour l'instant sois CutonButton ou CustomBar)


### Pour faire un CustomButton
```java
// l'image du bouton cera celle si
CustomButtom button = new CustomButton(new Image("url"));


// l'image du bouton cera celle si puis quand le bouton seras cliqué
CustomButtom button = new CustomButton(new Image("url"), new Image("url));

// maintenant l'image du bouton cera celle si puis quand le bouton seras cliqué et quand on passeras dessus
CustomButtom button = new CustomButton(new Image("url"), new Image("url), new Image("url));
```

## Pour savoir quand on clique sur le bouton

```java
// ne pas mettre de .setOnAction();
button.setListener(new MySuperListener);
```

puis créé votre classe `MySuperListener`

```java
public MySuperListener implements JavaFXPlusEventListener{
	
	@Override
	public void onEvent(JavaFXPlusEvent event) {
		
	}
  
}
```

puis rejouter ceci pour savoir si l'on clique bien sur votre bouton

```java
	@Override
	public void onEvent(JavaFXPlusEvent event) {
		if(event.getComponent().equals(button)) {
			// continue process
		}
		
	}
```

## Voilà

### Pour me soutenir : https://www.paypal.me/launchyourapp1
