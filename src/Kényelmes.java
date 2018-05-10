public class Kényelmes extends Gyerek {

    public Kényelmes() {
    }

    public Kényelmes(String name, int elegedettseg) {
        this.setName(name);
        this.setElegedettseg(elegedettseg);
    }

    @Override
    public void applyTevekenyseg(Main.Tevekenysegek actualTevekenyseg) {
        if (!this.isNyafog()) {
            switch (actualTevekenyseg) {
                case ENEK:
                    break;
                case RAJZ:
                    this.setElegedettseg(4);
                    break;
                case TANC:
                    this.changeElegedettseg(-1);
                    break;
                case LABDAZAS:
                    this.changeElegedettseg(-2);
                    break;
            }
            if (this.getElegedettseg() <= 0) {
                this.setNyafog(true);
            }
        }
    }
}
