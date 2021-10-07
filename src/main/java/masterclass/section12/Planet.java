package masterclass.section12;


public class Planet extends masterclass.section12.HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(masterclass.section12.HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
