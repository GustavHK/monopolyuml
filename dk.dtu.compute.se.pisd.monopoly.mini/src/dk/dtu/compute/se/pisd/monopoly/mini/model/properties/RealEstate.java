package dk.dtu.compute.se.pisd.monopoly.mini.model.properties;

import dk.dtu.compute.se.pisd.designpatterns.Subject;
import dk.dtu.compute.se.pisd.monopoly.mini.controller.GameController;
import dk.dtu.compute.se.pisd.monopoly.mini.model.Player;
import dk.dtu.compute.se.pisd.monopoly.mini.model.Property;
import dk.dtu.compute.se.pisd.monopoly.mini.model.exceptions.PlayerBrokeException;

/**
 * A specific property, which represents real estate on which houses
 * and hotels can be built. Note that this class does not have details
 * yet and needs to be implemented.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class RealEstate extends Property {
    private int houseCount;
    private int houseRent;
    private int houseCost;

    public void setHouseCount(int houseCount) {
        this.houseCount = houseCount;
        notifyChange();
    }

    public int getHouseCount() {
        return houseCount;
    }

    public void setHouseCost(int houseCost) {
        this.houseCost = houseCost;
        notifyChange();
    }
    public int getHouseCost() {
        return houseCost;
    }

    public void setHouseRent(int houseRent) {
        this.houseRent = houseRent;
        notifyChange();
    }
    public int getHouseRent() {
        return houseRent;
    }




    public void computeRent() {

        super.setCurrentRent(super.getRent()+houseRent*houseCount);
    }

}


