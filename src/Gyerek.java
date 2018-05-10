public abstract class Gyerek {
    private int elegedettseg;
    private String name;
    private boolean nyafog = false;


    public abstract void applyTevekenyseg(Main.Tevekenysegek actualTevekenyseg);

    public void changeElegedettseg(int value) {
        elegedettseg += value;
    }

    public int getElegedettseg() {
        return elegedettseg;
    }

    public void setElegedettseg(int elegedettseg) {
        this.elegedettseg = elegedettseg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNyafog() {
        return nyafog;
    }

    public void setNyafog(boolean nyafog) {
        this.nyafog = nyafog;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gyerek neve: " + this.getName());
        sb.append(" Elégedettség: " + this.getElegedettseg());
        sb.append(" Nyafog: " + this.isNyafog());
        return sb.toString();
    }
}
