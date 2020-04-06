package creational.builder.home_build.implementations;

import creational.builder.home_build.HomeBuildPlan;

public class NormalSize implements HomeBuildPlan {
    private boolean basement;
    private boolean structure;
    private boolean roof;
    private boolean interior;

    public NormalSize(){
        this.basement = false;
        this.structure = false;
        this.roof = false;
        this.interior = false;
    }

    @Override
    public void buildBasement() {
        this.basement |= true;

    }

    @Override
    public void buildStructure() {
        this.structure |= true;

    }

    @Override
    public void buildRoof() {
        this.roof |= true;

    }

    @Override
    public void buildInterior() {
        this.interior |= true;

    }

    public String getHome(){
        final StringBuilder spec = new StringBuilder();

        spec.append("There are");

        if(basement){
            spec.append(" basement");
        }
        if(structure){
            spec.append(" structure");
        }
        if(roof){
            spec.append(" roof");
        }
        if(interior){
            spec.append(" interior");
        }


        return spec.toString();
    }

}