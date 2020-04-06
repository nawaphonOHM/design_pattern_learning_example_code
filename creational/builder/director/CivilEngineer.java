package creational.builder.director;

import creational.builder.home_build.HomeBuildPlan;
import creational.builder.home_build.implementations.NormalSize;

public class CivilEngineer {
    public HomeBuildPlan getResult(){
        final HomeBuildPlan homePlane = new NormalSize();


        homePlane.buildBasement();
        homePlane.buildInterior();
        homePlane.buildRoof();
        homePlane.buildStructure();

        return homePlane;
    }
}