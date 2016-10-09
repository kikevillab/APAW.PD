package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumber number;

    private NaturalNumberCreator creator;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }

    public void createNaturalNumber(int number) {
        this.number = this.creator.createNaturalNumber(number);
    }

    public NaturalNumber getNaturalNumber() {
        return number;
    }
}
