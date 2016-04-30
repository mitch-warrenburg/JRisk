import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import sun.audio.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;


public class jfx extends Application{
    private Scene theScene;

    private Territory theWall ;
    private Territory skagos;
    private Territory theGrevCliffs;
    private Territory winterfell;
    private Territory theNeck;
    private Territory theFlintCliff;
    private Territory theRills;
    private Territory wolfsrvood;


    private Territory theVale;
    private Territory crorvnlands;
    private Territory westerlands;
    private Territory riverlands;
    private Territory ironIslands;

    private Territory theReach;
    private Territory stormlands;
    private Territory dorne;
    private Territory redMountains;
    private Territory whisperingSound;
    private Territory shieldLands;


    private Territory braavosianCoastland;
    private Territory hillsOfNorvos;
    private Territory qhoyneLands;
    private Territory forrestOfQohor;
    private Territory theGoldenFields;
    private Territory theDisputedLands;
    private Territory andalos;

    private Territory rhoynianVeld;
    private Territory westernWaste;
    private Territory seaOfsighs;
    private Territory elyria;
    private Territory valyria;
    private Territory sarMell;

    private Territory sarnor;
    private Territory abandonedLand;
    private Territory kingdomsOfTheIfeqevron;
    private Territory theFootprint;
    private Territory jbben;
    private Territory realmsOfShogran;
    private Territory vaesDothrak;
    private Territory easternGrassSea;
    private Territory westernGrassSea;
    private Territory parchedFields;

    private Territory paintedMountains;
    private Territory slaversBay;
    private Territory lhazar;
    private Territory samyrianHills;
    private Territory bayasabhad;
    private Territory qarth;
    private Territory redWaste;
    private Territory ghiscar;



    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage theStage)
    {
        URL url = getClass().getResource("got.mp3");
        AudioClip themesong = new AudioClip(url.toString());

        final double initWidth = 1480;
        final double initHeight = 920;

        theStage.setTitle("Timeline Example");
        Group root = new Group();

        theScene = new Scene(root, initWidth, initHeight);
        theStage.setScene( theScene );

        Canvas canvas = new Canvas( initWidth, initHeight );
        root.getChildren().add( canvas );

        Image board = new Image(getClass().getResourceAsStream("westerosMap.jpg"));
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.drawImage( board, 0, 0, initWidth, initHeight );




        jbben = new Territory("jbben");
        initButton(jbben, 1195, 700);

        theWall = new Territory("theWall");
        initButton(theWall, 320, 95);

        skagos = new Territory("skagos");
        initButton(skagos, 390, 95);

        theGrevCliffs = new Territory("theGrevCliffs");
        initButton(theGrevCliffs, 360, 160);

        winterfell = new Territory("winterfell");
        initButton(winterfell, 300, 230);

        theNeck = new Territory("theNeck");
        initButton(theNeck, 240, 300);

        theFlintCliff = new Territory("theFlintCliff");
        initButton(theFlintCliff, 190, 335);

        theRills = new Territory("theRills");
        initButton(theRills, 140, 260);

        wolfsrvood = new Territory("wolfsrvood");
        initButton(wolfsrvood, 180, 190);

        theVale = new Territory("theVale");
        initButton(theVale, 320, 420);

        crorvnlands = new Territory("crorvnlands");
        initButton(crorvnlands, 300, 495);

        westerlands = new Territory("westerlands");
        initButton(westerlands, 170, 500);

        riverlands = new Territory("riverlands");
        initButton(riverlands, 140, 425);

        ironIslands = new Territory("ironIslands");
        initButton(ironIslands, 80, 395);

        theReach = new Territory("theReach");
        initButton(theReach, 250, 515);

        stormlands = new Territory("stormlands");
        initButton(stormlands, 320, 580);

        dorne = new Territory("dorne");
        initButton(dorne, 320, 680);

        redMountains = new Territory("redMountains");
        initButton(redMountains, 205, 655);

        whisperingSound = new Territory("whisperingSound");
        initButton(whisperingSound, 145, 655);

        shieldLands = new Territory("shieldLands");
        initButton(shieldLands, 145, 580);

        braavosianCoastland = new Territory("braavosianCoastland");
        initButton(braavosianCoastland, 525, 370);

        hillsOfNorvos = new Territory("hillsOfNorvos");
        initButton(hillsOfNorvos, 595, 465);

        qhoyneLands = new Territory("qhoyneLands");
        initButton(qhoyneLands, 655, 505);

        forrestOfQohor = new Territory("forrestOfQohor");
        initButton(forrestOfQohor, 770, 490);

        theGoldenFields = new Territory("theGoldenFields");
        initButton(theGoldenFields, 595, 600);

        theDisputedLands = new Territory("theDisputedLands");
        initButton(theDisputedLands, 595, 670);

        andalos = new Territory("andalos");
        initButton(andalos, 545, 495);

        rhoynianVeld = new Territory("rhoynianVeld");
        initButton(rhoynianVeld, 715, 565);

        westernWaste = new Territory("westernWaste");
        initButton(westernWaste, 770, 620);

        seaOfsighs = new Territory("seaOfsighs");
        initButton(seaOfsighs, 820, 640);

        elyria = new Territory("elyria");
        initButton(elyria, 840, 710);

        valyria = new Territory("valyria");
        initButton(valyria, 815, 805);

        sarMell = new Territory("sarMell");
        initButton(sarMell, 710, 665);

        sarnor = new Territory("sarnor");
        initButton(sarnor, 0, 0);

        abandonedLand = new Territory("abandonedLand");
        initButton(abandonedLand, 0, 0);

        kingdomsOfTheIfeqevron = new Territory("kingdomsOfTheIfeqevron");
        initButton(kingdomsOfTheIfeqevron, 0, 0);

        theFootprint = new Territory("theFootprint");
        initButton(theFootprint, 0, 0);

        realmsOfShogran = new Territory("realmsOfShogran");
        initButton(realmsOfShogran, 0, 0);

        vaesDothrak = new Territory("vaesDothrak");
        initButton(vaesDothrak, 0, 0);

        easternGrassSea = new Territory("easternGrassSea");
        initButton(easternGrassSea, 0, 0);

        westernGrassSea = new Territory("westernGrassSea");
        initButton(westernGrassSea, 0, 0);

        parchedFields = new Territory("parchedFields");
        initButton(parchedFields, 0, 0);

        paintedMountains = new Territory("paintedMountains");
        initButton(paintedMountains, 0, 0);

        slaversBay = new Territory("slaversBay");
        initButton(slaversBay, 0, 0);

        lhazar = new Territory("lhazar");
        initButton(lhazar, 0, 0);

        samyrianHills = new Territory("samyrianHills");
        initButton(samyrianHills, 0, 0);

        bayasabhad = new Territory("bayasabhad");
        initButton(bayasabhad, 0, 0);

        qarth = new Territory("qarth");
        initButton(qarth, 0, 0);

        redWaste = new Territory("redWaste");
        initButton(redWaste, 0, 0);

        ghiscar = new Territory("ghiscar");
        initButton(ghiscar, 0, 0);

        Player p1 = new Player("Attacker");
        Player p2 = new Player("Defender");

        theWall.updateTroopCount(15);
        westerlands.updateTroopCount(20);

        System.out.println("Alaska troops before battle: " + theWall.getTroopCount());
        System.out.println("East Africa troops before battle: " + westerlands.getTroopCount());

        Battle battle = new Battle(p1, 1, theWall, p2, 2, westerlands);
        battle.engage();

        System.out.println("Alaska troops after battle: " + theWall.getTroopCount());
        System.out.println("East Africa troops after battle: " + westerlands.getTroopCount());


        theWall.addBorderTerritory(skagos, theGrevCliffs, wolfsrvood);

        skagos.addBorderTerritory(theWall, theGrevCliffs);

        theGrevCliffs.addBorderTerritory(theWall, skagos, winterfell, wolfsrvood);

        theNeck.addBorderTerritory(theFlintCliff, theRills, theVale, winterfell, wolfsrvood);

        theFlintCliff.addBorderTerritory(ironIslands, theNeck, theVale);

        theRills.addBorderTerritory(theNeck, wolfsrvood);

        wolfsrvood.addBorderTerritory(theNeck, theRills, theGrevCliffs, theWall, winterfell);

        theVale.addBorderTerritory(crorvnlands, riverlands, theFlintCliff, theNeck);

        crorvnlands.addBorderTerritory(andalos, riverlands, stormlands, theReach, theVale, westerlands);

        westerlands.addBorderTerritory(crorvnlands, shieldLands, riverlands, theReach);

        riverlands.addBorderTerritory(crorvnlands, ironIslands, realmsOfShogran, theVale, westerlands);

        ironIslands.addBorderTerritory(riverlands, theFlintCliff);

        theReach.addBorderTerritory(crorvnlands, redMountains, shieldLands, stormlands, westerlands, whisperingSound);

        stormlands.addBorderTerritory(andalos, crorvnlands, redMountains, theReach);

        dorne.addBorderTerritory(redMountains, theDisputedLands);

        redMountains.addBorderTerritory(dorne, stormlands, theReach, whisperingSound);

        whisperingSound.addBorderTerritory(redMountains, shieldLands, theReach);

        shieldLands.addBorderTerritory(theReach, westerlands, whisperingSound);

        braavosianCoastland.addBorderTerritory(andalos, hillsOfNorvos);

        hillsOfNorvos.addBorderTerritory(andalos, braavosianCoastland, theGoldenFields, qhoyneLands);

        qhoyneLands.addBorderTerritory(forrestOfQohor, hillsOfNorvos, rhoynianVeld, theGoldenFields);

        forrestOfQohor.addBorderTerritory(parchedFields, qhoyneLands, rhoynianVeld, sarnor);

        theGoldenFields.addBorderTerritory(andalos, hillsOfNorvos, qhoyneLands, rhoynianVeld, sarMell,
                theDisputedLands);

        theDisputedLands.addBorderTerritory(dorne, sarMell, theGoldenFields);

        andalos.addBorderTerritory(braavosianCoastland, crorvnlands, hillsOfNorvos, stormlands, theGoldenFields);

        rhoynianVeld.addBorderTerritory(forrestOfQohor, parchedFields, qhoyneLands, sarMell, theGoldenFields,
                westernWaste);

        westernWaste.addBorderTerritory(paintedMountains, parchedFields, rhoynianVeld, sarMell, seaOfsighs);

        seaOfsighs.addBorderTerritory(elyria, sarMell, valyria, westernWaste);

        elyria.addBorderTerritory(paintedMountains, seaOfsighs, valyria);

        valyria.addBorderTerritory(elyria, seaOfsighs);

        sarMell.addBorderTerritory(theDisputedLands, theGoldenFields, rhoynianVeld, seaOfsighs, westernWaste);

        sarnor.addBorderTerritory(abandonedLand, forrestOfQohor, parchedFields);

        abandonedLand.addBorderTerritory(kingdomsOfTheIfeqevron, parchedFields, sarnor, westernGrassSea);

        kingdomsOfTheIfeqevron.addBorderTerritory(abandonedLand, easternGrassSea, theFootprint, vaesDothrak,
                westernGrassSea);

        theFootprint.addBorderTerritory(kingdomsOfTheIfeqevron, realmsOfShogran, vaesDothrak, jbben);

        jbben.addBorderTerritory(theFootprint);

        realmsOfShogran.addBorderTerritory( theFootprint, riverlands, vaesDothrak);

        vaesDothrak.addBorderTerritory(easternGrassSea, kingdomsOfTheIfeqevron, realmsOfShogran, theFootprint,
                samyrianHills);

        easternGrassSea.addBorderTerritory(kingdomsOfTheIfeqevron, lhazar, samyrianHills, vaesDothrak, westernGrassSea);

        westernGrassSea.addBorderTerritory(abandonedLand, easternGrassSea, kingdomsOfTheIfeqevron, paintedMountains,
                parchedFields, lhazar);

        parchedFields.addBorderTerritory(abandonedLand, forrestOfQohor, rhoynianVeld, paintedMountains, sarnor,
                westernGrassSea, westernWaste);

        paintedMountains.addBorderTerritory(elyria, lhazar, parchedFields, slaversBay, westernGrassSea, westernWaste);

        slaversBay.addBorderTerritory(ghiscar, lhazar, paintedMountains, redWaste);

        lhazar.addBorderTerritory(bayasabhad, easternGrassSea, paintedMountains, redWaste, samyrianHills, slaversBay,
                westernGrassSea);

        samyrianHills.addBorderTerritory(bayasabhad, easternGrassSea, lhazar, vaesDothrak);

        bayasabhad.addBorderTerritory(lhazar, redWaste, qarth, samyrianHills);

        qarth.addBorderTerritory(bayasabhad, redWaste);

        redWaste.addBorderTerritory(bayasabhad, ghiscar, lhazar, qarth, slaversBay);

        ghiscar.addBorderTerritory(redWaste, slaversBay);




        theStage.show();
        themesong.play(1.0);
    }


    public void initButton(Territory territory, int x, int y){

        territory.setStyle("  -fx-padding: 1 5 5 5;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 10;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),\n" +
                "        #9d4024,\n" +
                "        #d86e3a,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 1.1em;");


        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.CORAL);
        shadow.setOffsetX(70);
        shadow.setOffsetY(70);
//Adding the shadow when the mouse cursor is on
        territory.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        territory.setStyle("  -fx-padding: 1 5 5 5;\n" +
                                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                                "    -fx-background-radius: 10;\n" +
                                "    -fx-background-color: \n" +
                                "        linear-gradient(from 0% 93% to 0% 100%, #02a300 0%, #34fa0c 100%),\n" +
                                "        #1d9d33,\n" +
                                "        #32d836,\n" +
                                "        radial-gradient(center 50% 50%, radius 100%, #35d8ca, #c54e2c);\n" +
                                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                                "    -fx-font-weight: bold;\n" +
                                "    -fx-font-size: 1.1em;");
                    }
                });
//Removing the shadow when the mouse cursor is off
        territory.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        territory.setStyle("  -fx-padding: 1 5 5 5;\n" +
                                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                                "    -fx-background-radius: 10;\n" +
                                "    -fx-background-color: \n" +
                                "        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),\n" +
                                "        #9d4024,\n" +
                                "        #d86e3a,\n" +
                                "        radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);\n" +
                                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                                "    -fx-font-weight: bold;\n" +
                                "    -fx-font-size: 1.1em;");
                    }
                });


        //territory.setStyle("-fx-background-radius: 30;");
        //territory.setStyle("-fx-background-insets: 0;");
        //territory.setStyle("-fx-text-fill: white;");

        //territory.setStyle("-fx-font: 0 arial; -fx-base: #8cea37;");
        //territory.setPrefWidth(30);
        //territory.setPrefHeight(30);
        //territory.setEffect(new DropShadow());
        //territory.setEffect(new GaussianBlur(10.0));
        territory.setLayoutX(x);
        territory.setLayoutY(y);
        territory.setOnAction(e -> System.out.println("clicked"));
        ((Group)theScene.getRoot()).getChildren().add(territory);
    }



}