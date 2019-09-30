package Entities.People;

public enum Gender {
    AGENDER("Agender"),
    ANDROGYNE("Androgyne"),
    ANDROGYNOUS("Androgynous"),
    BIGENDER("Bigender"),
    CIS("CIS"),
    CIS_FEMALE("CIS female"),
    CIS_MALE("CIS male"),
    CIS_GENDER("CIS gender"),
    FEMALE("Female"),
    FTM("FTM"),
    GENDER_FLUID("Gender fluid"),
    GENDER_NONCONFORMING("Gender nonconforming"),
    GENDER_QUESTIONING("Gender questioning"),
    GENDER_VARIANT("Gender variant"),
    GENDER_QUEER("Gender queer"),
    INTER_SEX("Inter sex"),
    MALE("Male"),
    MTF("MTF"),
    NEITHER("Neither"),
    NEUTROIS("Neutrois"),
    NON_BINARY("Non binary"),
    OTHER("Other"),
    PANGENDER("Pangender"),
    TRANS("Trans"),
    TRANS_FEMALE("Trans female"),
    TRANS_MALE("Trans male"),
    TRANS_ASTERISK("Trans asterisk"),
    TRANS_ASTERISK_FEMALE("Trans asterisk female"),
    TRANS_ASTERISK_MALE("Trans asterisk male"),
    TRANS_MASCULINE("Trans masculine"),
    TWO_SPIRIT("Two spirit");

    Gender(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    private String name;
}
