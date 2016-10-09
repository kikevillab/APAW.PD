package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

	private static final String[] textValue = {"cero", "one", "two", "three", "four", "five"};

    public NaturalNumberEn(int value) {
        super(value);
    }    

    public String getTextValue() {
        if (this.getValue() < textValue.length) {
            return NaturalNumberEn.textValue[this.getValue()];
        } else {
            return "???";
        }
    }
}
