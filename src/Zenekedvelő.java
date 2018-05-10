public class Zenekedvelő extends Gyerek {

    public Zenekedvelő() {
    }

    public Zenekedvelő(String name, int elegedettseg) {
        this.setName(name);
        this.setElegedettseg(elegedettseg);
    }

    @Override
    public void applyTevekenyseg(Main.Tevekenysegek actualTevekenyseg) {
        if (!this.isNyafog()) {
            switch (actualTevekenyseg) {
                case ENEK:
                    this.setElegedettseg(4);
                    break;
                case RAJZ:
                    this.changeElegedettseg(-1);
                    break;
                case TANC:
                    break;
                case LABDAZAS:
                    this.changeElegedettseg(-1);
                    break;
            }
            if (this.getElegedettseg() <= 0) {
                this.setNyafog(true);
            }
        }
    }
}
