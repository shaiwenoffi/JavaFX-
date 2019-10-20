# JavaFX-
This library can be shorten something in JavaFX! I was inspired by Swinger for swing which was created by Litarvan



### To begin

you just need to create a new Object (for now be CutonButton or CustomBar)


### To make a CustomButton
```Java
// the image of the button will be the one
CustomButtom button = new CustomButton (new Image ("url"));


// the image of the button will be the one if then when the button will be clicked
CustomButtom button = new CustomButton (new Image ("url"), new Image ("url));

// now the image of the button will be the one if then when the button will be clicked and when we go over it
CustomButtom button = new CustomButton (new Image ("url"), new Image ("url), new Image (" url));
```

## To know when we click on the button

```Java
// do not put .setOnAction ();
button.setListener (new MySuperListener);
`` `

then create your `MySuperListener` class

```Java
public MySuperListener implements JavaFXPlusEventListener {

@Override
public void onEvent (JavaFXPlusEvent event) {

}
  
}
```

then reissue this to know if we click on your button

```Java
@Override
public void onEvent (JavaFXPlusEvent event) {
if (event.getComponent (). equals (button)) {
// continue process
}

}
```

## Here

### To support me: https://www.paypal.me/launchyourapp1
